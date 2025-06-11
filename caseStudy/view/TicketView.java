package caseStudy.view;

import caseStudy.model.Customer;
import caseStudy.model.Ticket;
import caseStudy.model.Trip;

import java.util.List;

public class TicketView {
    public void displayTicketDetails(Ticket ticket, Trip trip, Customer customer) {
        System.out.println("\n--- THÔNG TIN VÉ ---");
        System.out.println("Mã vé: " + ticket.getId());
        System.out.println("Hành khách: " + customer.getName() + " - SĐT: " + customer.getPhone());
        System.out.println("Tuyến: " + trip.getFormattedTrip(null, null, null).split("\\|")[1].trim());
        System.out.println("Số ghế: " + ticket.getSeatNumber());
        System.out.printf("Giá vé: %,.0f VND%n", ticket.getPrice());
        System.out.println("Trạng thái: " + ticket.getStatus());
        System.out.println("--------------------");
    }

    public void printBookingSuccess(Ticket ticket) {
        System.out.println("\nĐẶT VÉ THÀNH CÔNG! Chi tiết vé của bạn:");
        System.out.println(ticket);
    }

    public void printCancellationSuccess(Ticket ticket) {
        System.out.println("\nHỦY VÉ THÀNH CÔNG! Trạng thái vé đã được cập nhật:");
        System.out.println(ticket);
    }

    public void printError(String message) {
        System.err.println("Lỗi: " + message);
    }

    public void printSuccess(String message) {
        System.out.println("✅ " + message);
    }

    public void printMessage(String message) {
        System.out.println("ℹ️ " + message);
    }

    public void displayTicketList(List<Ticket> tickets) {
        System.out.println("\n===== DANH SÁCH VÉ ĐÃ ĐẶT =====");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
        System.out.println("================================\n");
    }
}
