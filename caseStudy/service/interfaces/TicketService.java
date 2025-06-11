package caseStudy.service.interfaces;


import caseStudy.model.Bus;
import caseStudy.model.Customer;
import caseStudy.model.Ticket;
import caseStudy.model.Trip;
import caseStudy.repository.BusRepository;
import caseStudy.repository.TicketRepository;
import caseStudy.repository.TripRepository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class TicketService implements TicketServiceInterface {
    private final TicketRepository ticketRepository;
    private final TripRepository tripRepository;
    private final BusRepository busRepository;

    public TicketService(TicketRepository ticketRepository, TripRepository tripRepository, BusRepository busRepository) {
        this.ticketRepository = ticketRepository;
        this.tripRepository = tripRepository;
        this.busRepository = busRepository;
    }

    @Override
    public Ticket bookTicket(String tripId, Customer customer, int seatNumber) throws Exception {
        Trip trip = tripRepository.findById(tripId).orElseThrow(() -> new Exception("Lỗi: Không tìm thấy chuyến đi " + tripId));
        Bus bus = busRepository.findByLicensePlate(trip.getBusLicensePlate()).orElseThrow(() -> new Exception("Lỗi: Không tìm thấy xe cho chuyến đi"));
        if (seatNumber <= 0 || seatNumber > bus.getSeatCapacity()) {
            throw new Exception("Lỗi: Số ghế không hợp lệ.");
        }
        if (getBookedSeats(tripId).contains(seatNumber)) {
            throw new Exception("Lỗi: Ghế số " + seatNumber + " đã có người đặt.");
        }
        String ticketId = "VE" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
        Ticket newTicket = new Ticket(ticketId, tripId, customer.getId(), customer.getName(),customer.getPhone(), seatNumber, trip.getPrice());
        return ticketRepository.save(newTicket);
    }

    @Override
    public Ticket cancelTicket(String ticketId) throws Exception {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow(() -> new Exception("Mã vé không tồn tại."));
        if (ticket.getStatus() == Ticket.Status.CANCELLED) {
            throw new Exception("Vé này đã được hủy trước đó.");
        }
        ticket.setStatus(Ticket.Status.CANCELLED);
        return ticketRepository.save(ticket);
    }
    public boolean saveToFile(Ticket ticket) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tickets.txt", true))) {
            writer.write(ticket.toString());
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public List<Integer> getBookedSeats(String tripId) {
        return ticketRepository.findByTripId(tripId).stream()
                .filter(ticket -> ticket.getStatus() == Ticket.Status.BOOKED)
                .map(Ticket::getSeatNumber)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Ticket> getTicketById(String ticketId) {
        return ticketRepository.findById(ticketId);
    }

    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public Optional<Ticket> findById(String ticketId) {
        return ticketRepository.findById(ticketId);
    }

    @Override
    public void deleteById(String ticketId) {
        Optional<Ticket> ticketOpt = ticketRepository.findById(ticketId);
        ticketOpt.ifPresent(ticket -> {
            ticket.setStatus(Ticket.Status.CANCELLED);
            ticketRepository.delete(ticketId);
        });
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.getAll();
    }
}
