package caseStudy.service.interfaces;


import caseStudy.model.Bus;
import caseStudy.repository.BusRepository;

import java.util.Optional;

public class BusService implements BusServiceInterface {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public Optional<Bus> getBusByLicensePlate(String licensePlate) {
        return busRepository.findByLicensePlate(licensePlate);
    }
}

