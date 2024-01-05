package com.dgmf.fundamentals.springioc.impl;

import com.dgmf.fundamentals.springioc.interfaces.Hotel;

public class Hilton implements Hotel {
    @Override
    public String getStartRating() {
        return null;
    }

    @Override
    public String getHotelName() {
        return "Hilton";
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getAvailability() {
        return 0;
    }
}
