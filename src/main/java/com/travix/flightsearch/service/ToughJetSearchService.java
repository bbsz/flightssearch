package com.travix.flightsearch.service;

import com.travix.flightsearch.domain.Flight;
import com.travix.flightsearch.repository.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sergej on 13.2.2017.
 */
@Service
public class ToughJetSearchService {

    private FlightsRepository flightsRepository;

    @Autowired
    public ToughJetSearchService(FlightsRepository repository) {
        this.flightsRepository = repository;
    }

    public List<Flight> getFlights(SearchCriteria sc) {
        return flightsRepository.findToughJetFlights(sc.getOrigin(), sc.getDestination(), sc.getDepartureDate());
    }

}
