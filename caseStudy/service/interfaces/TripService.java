package caseStudy.service.interfaces;


import caseStudy.model.Ticket;
import caseStudy.model.Trip;
import caseStudy.repository.TicketRepository;
import caseStudy.repository.TripRepository;

import java.util.List;
import java.util.Optional;

public class TripService implements TripServiceInterface {
    private final TripRepository tripRepository;
    private final TicketRepository ticketRepository;

    public TripService(TripRepository tripRepository, TicketRepository ticketRepository) {
        this.tripRepository = tripRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.getAll();
    }

    @Override
    public Optional<Trip> getTripById(String tripId) {
        return tripRepository.findById(tripId);
    }

    @Override
    public double getRevenueByTrip(String tripId) {
        return ticketRepository.findByTripId(tripId).stream()
                .filter(ticket -> ticket.getStatus() == Ticket.Status.BOOKED)
                .mapToDouble(Ticket::getPrice)
                .sum();
    }
}
