package com.farshid.starter.backend_starter.service;

import org.springframework.stereotype.Service;

import com.farshid.starter.backend_starter.domain.model.TourPackage;
import com.farshid.starter.backend_starter.repository.TourPackageRepository;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name) {
        return tourPackageRepository
                .findById(code)
                .orElse(tourPackageRepository.save(new TourPackage(code, name)));

    }

    public Iterable<TourPackage> lookup() {
        return tourPackageRepository.findAll();
    }

    public long total() {
        return tourPackageRepository.count();
    }
}
