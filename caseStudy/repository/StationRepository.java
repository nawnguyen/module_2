package caseStudy.repository;

import caseStudy.model.Station;

import java.util.List;
import java.util.Optional;

public class StationRepository {
    private static final String FILE_PATH = "data/stations.dat";
    private List<Station> stations;

    public StationRepository() {
        this.stations = FileUtil.readFromFile(FILE_PATH);
        if (this.stations.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu bến xe, tạo dữ liệu mẫu...");
            createSampleData();
            saveToFile();
        }
    }

    private void saveToFile() {
        FileUtil.writeToFile(FILE_PATH, stations);
    }

    public List<Station> getAll() {
        return stations;
    }

    public Optional<Station> findById(String id) {
        return stations.stream().filter(s -> s.getId().equalsIgnoreCase(id)).findFirst();
    }

    private void createSampleData() {
        stations.add(new Station("HCM", "Bến xe Miền Đông (TP.HCM)"));
        stations.add(new Station("DL", "Bến xe Liên Tỉnh (Đà Lạt)"));
        stations.add(new Station("VT", "Bến xe Vũng Tàu"));
    }
}