package com.farshid.starter.backend_starter.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.farshid.starter.backend_starter.domain.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);

    @Override
    @RestResource(exported = false)
    void deleteAllByIdInBatch(Iterable<Integer> ids);

    @Override
    @RestResource(exported = false)
    void deleteAllInBatch();

    @Override
    @RestResource(exported = false)
    void deleteAllInBatch(Iterable<Tour> entities);

    @Override
    @RestResource(exported = false)
    void deleteInBatch(Iterable<Tour> entities);

    @Override
    @RestResource(exported = false)
    <S extends Tour> List<S> saveAllAndFlush(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    <S extends Tour> S saveAndFlush(S entity);

    @Override
    @RestResource(exported = false)
    <S extends Tour> List<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    void delete(Tour entity) ;

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Tour> entities) ;

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Integer> ids) ;

    @Override
    @RestResource(exported = false)
    void deleteById(Integer id) ;

    @Override
    @RestResource(exported = false)
    <S extends Tour> S save(S entity);    
}
