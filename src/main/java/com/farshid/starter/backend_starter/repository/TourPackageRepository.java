package com.farshid.starter.backend_starter.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.farshid.starter.backend_starter.domain.model.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, Integer> {
    Optional<TourPackage> findByName(@Param("name") String name);
    Optional<TourPackage> findByCode(@Param("code") String code);
}
