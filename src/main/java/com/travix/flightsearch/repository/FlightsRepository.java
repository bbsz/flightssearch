package com.travix.flightsearch.repository;

import com.travix.flightsearch.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sergej on 12.2.2017.
 */
@Repository
public interface FlightsRepository extends JpaRepository<Flight, Long> {
}
