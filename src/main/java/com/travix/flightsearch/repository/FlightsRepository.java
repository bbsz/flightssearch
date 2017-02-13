package com.travix.flightsearch.repository;

import com.travix.flightsearch.domain.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sergej on 12.2.2017.
 */
public interface FlightsRepository extends Repository<Flight, Long> {

    @Query("SELECT f FROM Flight f WHERE f.provider = 0 AND f.origin = :origin AND f.destination = :destination ")
    List<Flight> findCrazyAirFlights(@Param("origin") String origin, @Param("destination") String destination);
}
