package com.travix.flightsearch.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.travix.flightsearch.domain.CabinClass;

import java.util.Date;

/**
 * Created by sergej on 13.2.2017.
 */
public class CrazyAirSearchResponse {
    @JsonProperty(value = "airline", required = true)
    private String airLine;

    @JsonProperty(value = "price", required = true)
    private double price;

    @JsonProperty(value = "cabinclass", required = true)
    private CabinClass cabinClass;

    @JsonProperty(value = "departureAirportCode", required = true)
    private String departureAirportCode;

    @JsonProperty(value = "destinationAirportCode", required = true)
    private String destinationAirportCode;

    @JsonFormat(pattern = "mm-dd-yyyy HH:MM:ss")
    @JsonProperty(value = "departureDate", required = true)
    private Date departureDate;

    @JsonFormat(pattern = "mm-dd-yyyy HH:MM:ss")
    @JsonProperty(value = "arrivalDate", required = true)
    private Date arrivalDate;

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CabinClass getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(CabinClass cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
