package caseStudy.view;

import caseStudy.model.Bus;
import caseStudy.model.Station;
import caseStudy.model.Trip;

import java.util.List;
import java.util.Map;

public class TripView {
    public void displayTrips(List<Trip> trips, Map<String, Bus> busMap, Map<String, Station> stationMap) {
        System.out.println("\n--- DANH SÁCH CÁC CHUYẾN ĐI HIỆN CÓ ---");
        if (trips.isEmpty()) {
            System.out.println("Không có chuyến đi nào.");
            return;
        }
        for (Trip trip : trips) {
            Bus bus = busMap.get(trip.getBusLicensePlate());
            Station departure = stationMap.get(trip.getDepartureStationId());
            Station arrival = stationMap.get(trip.getArrivalStationId());
            System.out.println(trip.getFormattedTrip(bus, departure, arrival));
        }
    }
    public void displayTripRevenue(String tripId, double revenue) {
        System.out.println("------------------------------------");
        System.out.printf("Tổng doanh thu của chuyến %s: %,.0f VND%n", tripId, revenue);
        System.out.println("------------------------------------");
    }
    public void printError(String message) {
        System.err.println("Lỗi: " + message);
    }
}

