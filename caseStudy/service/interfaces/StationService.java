package caseStudy.service.interfaces;


import caseStudy.model.Station;
import caseStudy.repository.StationRepository;

import java.util.Optional;

public class StationService implements StationServiceInterface {
    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Optional<Station> getStationById(String id) {
        return stationRepository.findById(id);
    }
}
