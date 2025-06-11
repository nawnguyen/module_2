package caseStudy.service.interfaces;

import caseStudy.model.Trip;

import java.util.List;
import java.util.Optional;

public interface TripServiceInterface {
    List<Trip> getAllTrips();

    Optional<Trip> getTripById(String tripId);

    double getRevenueByTrip(String tripId);
}
