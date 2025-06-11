package caseStudy.model;


import caseStudy.until.DateUtil;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String busLicensePlate;
    private String departureStationId;
    private String arrivalStationId;
    private LocalDateTime departureTime;
    private double price;

    public Trip(String id, String busLicensePlate, String departureStationId, String arrivalStationId, LocalDateTime departureTime, double price) {
        this.id = id;
        this.busLicensePlate = busLicensePlate;
        this.departureStationId = departureStationId;
        this.arrivalStationId = arrivalStationId;
        this.departureTime = departureTime;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getBusLicensePlate() {
        return busLicensePlate;
    }

    public String getDepartureStationId() {
        return departureStationId;
    }

    public String getArrivalStationId() {
        return arrivalStationId;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedTrip(Bus bus, Station departure, Station arrival) {
        return String.format("Mã chuyến: %s | %s -> %s | Khởi hành: %s | Giá: %,.0f VND | %s",
                id, departure.getName(), arrival.getName(), DateUtil.format(departureTime), price, bus.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(id, trip.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
