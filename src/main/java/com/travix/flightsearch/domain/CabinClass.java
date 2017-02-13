package com.travix.flightsearch.domain;

/**
 * Created by sergej on 12.2.2017.
 */
public enum CabinClass {
    ECONOMY("E"), BUSINESS("B");

    public final String code;

    private CabinClass(String code){
        this.code = code;
    }
}
