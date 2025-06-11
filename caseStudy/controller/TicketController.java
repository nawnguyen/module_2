package caseStudy.controller;

import caseStudy.model.Customer;
import caseStudy.model.Ticket;
import caseStudy.model.Trip;
import caseStudy.service.interfaces.CustomerServiceInterface;
import caseStudy.service.interfaces.TicketServiceInterface;
import caseStudy.until.ValidateUtil;
import caseStudy.view.InputUtil;
import caseStudy.view.TicketView;

import java.util.List;
import java.util.Optional;

public class TicketController {
    private final TicketServiceInterface ticketService;
    private final CustomerServiceInterface customerService;
    private final TripController tripController;
    private final TicketView ticketView;

    public TicketController(TicketServiceInterface ticketService, CustomerServiceInterface customerService, TripController tripController, TicketView ticketView) {
        this.ticketService = ticketService;
        this.customerService = customerService;
        this.tripController = tripController;
        this.ticketView = ticketView;
    }

    public void startBookingFlow() {
        tripController.showAllTrips();
        if (tripController.getTripById("SG-DL01").isEmpty()) return;

        String tripId;
        while (true) {
            tripId = InputUtil.readString("Nhập mã chuyến đi bạn muốn đặt: ").toUpperCase();
            if (ValidateUtil.isTripIdValid(tripId) && tripController.getTripById(tripId).isPresent()) {
                break;
            }
            ticketView.printError("Mã chuyến đi không hợp lệ hoặc không tồn tại. Vui lòng nhập lại.");
        }

        Trip selectedTrip = tripController.getTripById(tripId).get();
        List<Integer> bookedSeats = ticketService.getBookedSeats(tripId);

        System.out.println("Các ghế đã được đặt cho chuyến " + tripId + ": " + (bookedSeats.isEmpty() ? "Chưa có" : bookedSeats));
        System.out.println("Tổng số ghế: " + tripController.getBusForTrip(selectedTrip).getSeatCapacity());

        int seatNumber;
        while (true) {
            seatNumber = InputUtil.readInt("Nhập số ghế muốn đặt: ");
            if (!bookedSeats.contains(seatNumber) && seatNumber > 0 && seatNumber <= tripController.getBusForTrip(selectedTrip).getSeatCapacity()) {
                break;
            }
            ticketView.printError("Ghế không hợp lệ hoặc đã được đặt. Vui lòng chọn ghế khác.");
        }

        System.out.println("Nhập thông tin khách hàng:");
        String customerName, customerPhone;
        while (true) {
            customerName = InputUtil.readString("Tên khách hàng: ");
            if (ValidateUtil.isNameValid(customerName)) break;
            ticketView.printError("Tên không hợp lệ (cần ít nhất 2 ký tự, không chứa số/ký tự đặc biệt).");
        }

        while (true) {
            customerPhone = InputUtil.readString("Số điện thoại: ");
            if (ValidateUtil.isPhoneValid(customerPhone)) break;
            ticketView.printError("Số điện thoại không hợp lệ (phải là 10 chữ số, bắt đầu bằng 0).");
        }

        try {
            Customer customer = customerService.findOrCreateCustomer(customerName, customerPhone);
            Ticket bookedTicket = ticketService.bookTicket(tripId, customer, seatNumber);
            ticketView.printBookingSuccess(bookedTicket);
        } catch (Exception e) {
            e.printStackTrace();
            ticketView.printError("Không thể hoàn tất đặt vé: " + e.getMessage());
        }
    }

    public void startCancellationFlow() {
        List<Ticket> tickets = ticketService.findAll();
        if (tickets.isEmpty()) {
            ticketView.printMessage("Không có vé nào để hủy.");
            return;
        }

        ticketView.displayTicketList(tickets);

        String ticketId = InputUtil.readString("Nhập mã vé bạn muốn hủy: ").toUpperCase();
        Optional<Ticket> ticketOpt = ticketService.findById(ticketId);

        if (ticketOpt.isEmpty()) {
            ticketView.printError("Không tìm thấy vé với mã đã nhập.");
            return;
        }

        String confirm = InputUtil.readString("Bạn có chắc muốn hủy vé " + ticketId + "? (y/n): ");
        if (!confirm.equalsIgnoreCase("y")) {
            ticketView.printMessage("Đã hủy thao tác xóa vé.");
            return;
        }

        try {
            ticketService.cancelTicket(ticketId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        ticketView.printSuccess("Hủy vé thành công!");
    }
}