package com.travix.flightsearch.controller;

import com.travix.flightsearch.controller.dto.CrazyAirSearchRequest;
import com.travix.flightsearch.controller.dto.CrazyAirSearchResponse;
import com.travix.flightsearch.service.CrazyAirSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value = "crayzAir", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CrazyAirSearchResponse> searchCrazyAir(CrazyAirSearchRequest request) {
        return null;
    }
}
