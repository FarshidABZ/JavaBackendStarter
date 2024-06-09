package com.farshid.starter.backend_starter.service;

import org.springframework.stereotype.Service;

import com.farshid.starter.backend_starter.domain.model.Difficulty;
import com.farshid.starter.backend_starter.domain.model.Region;
import com.farshid.starter.backend_starter.domain.model.Tour;
import com.farshid.starter.backend_starter.domain.model.TourPackage;
import com.farshid.starter.backend_starter.repository.TourPackageRepository;
import com.farshid.starter.backend_starter.repository.TourRepository;

@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    public Tour createTour(String title,
            String description,
            String blurb,
            Integer price,
            String tourPackageCode,
            Difficulty difficulty,
            Region region) {

        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageCode)
                .orElseThrow(() -> new RuntimeException("Tour package not found"));

        return tourRepository.save(new Tour(title, description, blurb, price, tourPackage, difficulty, region));
    }

    public long total() {
        return tourRepository.count();
    }
}
