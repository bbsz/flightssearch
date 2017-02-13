package com.travix.flightsearch.controller;

import com.travix.flightsearch.controller.dto.CrazyAirSearchFlightDto;
import com.travix.flightsearch.controller.dto.CrazyAirSearchRequest;
import com.travix.flightsearch.domain.Flight;
import com.travix.flightsearch.service.CrazyAirSearchCriteria;
import com.travix.flightsearch.service.CrazyAirSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by sergej on 13.2.2017.
 */
@RestController
@RequestMapping("flightsSearch/")
public class CrazyAirFlightsSearchController {

    private CrazyAirSearchService crazyAirSearch;

    @Autowired
    public CrazyAirFlightsSearchController(CrazyAirSearchService crazyAirSearch) {
        this.crazyAirSearch = crazyAirSearch;
    }

    @RequestMapping(value = "crayzAir", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CrazyAirSearchFlightDto> searchCrazyAir(@Valid @RequestBody CrazyAirSearchRequest request) {
        CrazyAirSearchCriteria criteria = toSearchCriteria(request);
        List<Flight> flights = crazyAirSearch.getFlights(criteria);
        List<CrazyAirSearchFlightDto> dtos = toSearchResponse(flights);
        return dtos;
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

    private List<CrazyAirSearchFlightDto> toSearchResponse(List<Flight> flights) {
        Function<Flight, CrazyAirSearchFlightDto> responseMapper = flight -> {
            CrazyAirSearchFlightDto response = new CrazyAirSearchFlightDto(flight);
            return response;
        };

        return flights.stream().map(responseMapper).collect(Collectors.toList());
    }
}
