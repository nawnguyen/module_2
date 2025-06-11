package caseStudy.service.interfaces;


import caseStudy.model.Station;

import java.util.Optional;

public interface StationServiceInterface {
    Optional<Station> getStationById(String id);
}
