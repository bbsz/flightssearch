package com.travix.flightsearch.repository;

import com.travix.flightsearch.domain.Flight;
import org.springframework.data.repository.Repository;

/**
 * Created by sergej on 12.2.2017.
 */
public interface FlightsRepository extends Repository<Flight, Long> {
}
