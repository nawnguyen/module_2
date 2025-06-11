package caseStudy.service.interfaces;


import caseStudy.model.Bus;

import java.util.Optional;

public interface BusServiceInterface {
    Optional<Bus> getBusByLicensePlate(String licensePlate);
}
