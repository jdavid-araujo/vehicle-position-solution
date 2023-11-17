package com.david.poiservice.repository;

import com.david.poiservice.model.Poi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PoiRepository extends JpaRepository<Poi, Long> {

    @Query("SELECT e FROM Poi e WHERE (:name IS NULL OR e.name like %:name%)")
    Page<Poi> findByName(@Param("name") String name, Pageable pageable);

}
