package caseStudy.repository;

import caseStudy.model.Ticket;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TicketRepository {
    private static final String FILE_PATH = "data/tickets.dat";
    private List<Ticket> tickets;

    public TicketRepository() {
        this.tickets = FileUtil.readFromFile(FILE_PATH);
    }

    private void saveToFile() {
        FileUtil.writeToFile(FILE_PATH, tickets);
    }

    public List<Ticket> getAll() {
        return tickets;
    }

    public Ticket save(Ticket ticket) {
        tickets.removeIf(t -> t.getId().equals(ticket.getId()));
        tickets.add(ticket);
        saveToFile();
        return ticket;
    }

    public Optional<Ticket> findById(String ticketId) {
        return tickets.stream().filter(t -> t.getId().equalsIgnoreCase(ticketId)).findFirst();
    }

    public List<Ticket> findByTripId(String tripId) {
        return tickets.stream().filter(t -> t.getTripId().equalsIgnoreCase(tripId)).collect(Collectors.toList());
    }

    public void delete(String ticketId) {
        tickets.removeIf(t -> t.getId().equalsIgnoreCase(ticketId));
    }
}
