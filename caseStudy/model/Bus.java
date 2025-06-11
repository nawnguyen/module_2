package caseStudy.model;


import java.io.Serializable;

public class Bus implements Serializable {
    private static final long serialVersionUID = 1L;
    private String licensePlate;
    private String model;
    private int seatCapacity;

    public Bus(String licensePlate, String model, int seatCapacity) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.seatCapacity = seatCapacity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return "Xe '" + model + "' (BKS: " + licensePlate + ", " + seatCapacity + " chỗ)";
    }
}