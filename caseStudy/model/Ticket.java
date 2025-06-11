package caseStudy.model;

import caseStudy.until.DateUtil;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    public enum Status {
        BOOKED, CANCELLED
    }

    private String id;
    private String tripId;
    private String customerId;
    private String customerName;
    private String phoneNumber;
    private int seatNumber;
    private LocalDateTime bookingTime;
    private double price;
    private Status status;

    public Ticket(String id, String tripId, String customerId,String customerName,String phoneNumber, int seatNumber, double price) {
        this.id = id;
        this.tripId = tripId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.seatNumber = seatNumber;
        this.bookingTime = LocalDateTime.now();
        this.price = price;
        this.status = Status.BOOKED;
    }

    public String getId() {
        return id;
    }

    public String getTripId() {
        return tripId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString() {
        return String.format(
                "Mã vé: %s | Chuyến: %s | Ghế: %d | Tên: %s | SDT: %s |Đặt lúc: %s | Giá: %,.0f VND | Trạng thái: %s",
                id, tripId, seatNumber, customerName, phoneNumber, DateUtil.format(bookingTime), price, status
        );
    }
}
