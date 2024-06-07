package com.farshid.starter.backend_starter.repository;

import org.springframework.data.repository.CrudRepository;

import com.farshid.starter.backend_starter.domain.model.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {

}
