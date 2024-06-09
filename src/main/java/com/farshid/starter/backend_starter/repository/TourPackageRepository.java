package com.farshid.starter.backend_starter.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.farshid.starter.backend_starter.domain.model.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    Optional<TourPackage> findByName(String name);
}
