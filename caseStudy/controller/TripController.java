package caseStudy.controller;


import caseStudy.model.Bus;
import caseStudy.model.Station;
import caseStudy.model.Trip;
import caseStudy.repository.BusRepository;
import caseStudy.repository.StationRepository;
import caseStudy.service.interfaces.*;
import caseStudy.until.ValidateUtil;
import caseStudy.view.InputUtil;
import caseStudy.view.TripView;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TripController {
    private final TripServiceInterface tripService;
    private final BusServiceInterface busService;
    private final StationServiceInterface stationService;
    private final TripView tripView;
    private Map<String, Bus> busMap;
    private Map<String, Station> stationMap;

    public TripController(TripServiceInterface tripService, BusServiceInterface busService, StationServiceInterface stationService, TripView tripView) {
        this.tripService = tripService;
        this.busService = busService;
        this.stationService = stationService;
        this.tripView = tripView;
        this.busMap = new BusRepository().getAll().stream().collect(Collectors.toMap(Bus::getLicensePlate, Function.identity()));
        this.stationMap = new StationRepository().getAll().stream().collect(Collectors.toMap(Station::getId, Function.identity()));
    }

    public void showAllTrips() {
        List<Trip> trips = tripService.getAllTrips();
        tripView.displayTrips(trips, busMap, stationMap);
    }

    public Optional<Trip> getTripById(String id) {
        return tripService.getTripById(id);
    }

    public Bus getBusForTrip(Trip trip) {
        return busMap.get(trip.getBusLicensePlate());
    }

    public void showRevenueStatistics() {
        showAllTrips();
        List<Trip> trips = tripService.getAllTrips();
        if (trips.isEmpty()) return;
        String tripId;
        while (true) {
            tripId = InputUtil.readString("Nhập mã chuyến đi cần xem doanh thu: ").toUpperCase();
            if (ValidateUtil.isTripIdValid(tripId) && getTripById(tripId).isPresent()) {
                break;
            }
            tripView.printError("Mã chuyến đi không hợp lệ hoặc không tồn tại. Vui lòng nhập lại.");
        }
        double revenue = tripService.getRevenueByTrip(tripId);
        tripView.displayTripRevenue(tripId, revenue);
    }
}
