package com.travix.flightsearch.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by sergej on 13.2.2017.
 */
public class CrazyAirSearchRequest {
    @JsonProperty(value = "origin", required = true)
    private String origin;

    @JsonProperty(value = "destination", required = true)
    private String destination;

    @JsonProperty(value = "numberOfPassengers", required = true)
    private int passengersCount;

    @JsonFormat(pattern = "mm-dd-yyyy")
    @JsonProperty(value = "departureDate", required = true)
    private Date departureDate;

    @JsonProperty(value = "returnDate", required = true)
    @JsonFormat(pattern = "mm-dd-yyyy")
    private Date returnDate;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
