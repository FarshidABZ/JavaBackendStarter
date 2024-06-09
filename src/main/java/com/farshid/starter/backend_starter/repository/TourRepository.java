package com.farshid.starter.backend_starter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.farshid.starter.backend_starter.domain.model.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {
    List<Tour> findByTourPackageCode(@Param("code") String code);
}
