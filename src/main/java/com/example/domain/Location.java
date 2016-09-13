package com.example.domain;

import lombok.Data;

/**
 * Created by Admin on 2016/9/13.
 */
@Data
public class Location {

    private String place;
    private String year;
    public Location(String place,String year) {
        this.place = place;
        this.year = year;
    }
}
