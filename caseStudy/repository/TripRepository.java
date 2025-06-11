package caseStudy.repository;

import caseStudy.model.Trip;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class TripRepository {
    private static final String FILE_PATH = "data/trips.dat";
    private List<Trip> trips;

    public TripRepository() {
        this.trips = FileUtil.readFromFile(FILE_PATH);
        if (this.trips.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu chuyến đi, tạo dữ liệu mẫu...");
            createSampleData();
            saveToFile();
        }
    }

    private void saveToFile() {
        FileUtil.writeToFile(FILE_PATH, trips);
    }

    public List<Trip> getAll() {
        return trips;
    }

    public Optional<Trip> findById(String tripId) {
        return trips.stream().filter(t -> t.getId().equalsIgnoreCase(tripId)).findFirst();
    }

    private void createSampleData() {
        trips.add(new Trip("SG-DL01", "51F-12345", "HCM", "DL", LocalDateTime.of(2025, 7, 20, 7, 30), 350000));
        trips.add(new Trip("SG-VT01", "51F-67890", "HCM", "VT", LocalDateTime.of(2025, 7, 22, 9, 0), 200000));
        trips.add(new Trip("DL-SG01", "29S-55555", "DL", "HCM", LocalDateTime.of(2025, 7, 25, 14, 0), 400000));
    }
}
