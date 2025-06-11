package caseStudy.service.interfaces;


import caseStudy.model.Customer;
import caseStudy.model.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketServiceInterface {
    Ticket bookTicket(String tripId, Customer customer, int seatNumber) throws Exception;

    Ticket cancelTicket(String ticketId) throws Exception;

    List<Integer> getBookedSeats(String tripId);

    Optional<Ticket> getTicketById(String ticketId);

    List<Ticket> findAll();

    Optional<Ticket> findById(String ticketId);  // <--- thêm vào

    void deleteById(String ticketId);
}
