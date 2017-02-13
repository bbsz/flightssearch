package com.travix.flightsearch.controller;

import com.travix.flightsearch.controller.dto.CrazyAirSearchRequest;
import com.travix.flightsearch.controller.dto.CrazyAirSearchResponse;
import com.travix.flightsearch.domain.Flight;
import com.travix.flightsearch.service.CrazyAirSearchCriteria;
import com.travix.flightsearch.service.CrazyAirSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by sergej on 13.2.2017.
 */
@RestController
@RequestMapping("flightsSearch/")
public class FlightsSearchController {

    private CrazyAirSearchService crazyAirSearch;

    @Autowired
    public FlightsSearchController(CrazyAirSearchService crazyAirSearch) {
        this.crazyAirSearch = crazyAirSearch;
    }

    @RequestMapping(value = "crayzAir", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CrazyAirSearchResponse> searchCrazyAir(CrazyAirSearchRequest request) {
        CrazyAirSearchCriteria criteria = toSearchCriteria(request);
        List<Flight> flights = crazyAirSearch.getFlights(criteria);
        List<CrazyAirSearchResponse> responses = toSearchResponse(flights);
        return responses;
    }

    private CrazyAirSearchCriteria toSearchCriteria(CrazyAirSearchRequest request) {
        CrazyAirSearchCriteria criteria = new CrazyAirSearchCriteria();
        criteria.setDepartureDate(request.getDepartureDate());
        criteria.setReturnDate(request.getReturnDate());
        criteria.setDestination(request.getDestination());
        criteria.setOrigin(request.getOrigin());
        criteria.setPassengersCount(request.getPassengersCount());

        return criteria;
    }

    private List<CrazyAirSearchResponse> toSearchResponse(List<Flight> flights) {
        Function<Flight, CrazyAirSearchResponse> responseMapper = flight -> {
            CrazyAirSearchResponse response = new CrazyAirSearchResponse(flight);
            return response;
        };

        return flights.stream().map(responseMapper).collect(Collectors.toList());
    }
}
