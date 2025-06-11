package caseStudy.repository;

import caseStudy.model.Bus;

import java.util.List;
import java.util.Optional;

public class BusRepository {
    private static final String FILE_PATH = "data/buses.dat";
    private List<Bus> buses;

    public BusRepository() {
        this.buses = FileUtil.readFromFile(FILE_PATH);
        if (this.buses.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu xe, tạo dữ liệu mẫu...");
            createSampleData();
            saveToFile();
        }
    }

    private void saveToFile() {
        FileUtil.writeToFile(FILE_PATH, buses);
    }

    public List<Bus> getAll() {
        return buses;
    }

    public Optional<Bus> findByLicensePlate(String licensePlate) {
        return buses.stream().filter(b -> b.getLicensePlate().equalsIgnoreCase(licensePlate)).findFirst();
    }

    private void createSampleData() {
        buses.add(new Bus("51F-12345", "Ford Transit", 16));
        buses.add(new Bus("51F-67890", "Huyndai Solati", 16));
        buses.add(new Bus("29S-55555", "Thaco Limousine", 29));
    }
}
