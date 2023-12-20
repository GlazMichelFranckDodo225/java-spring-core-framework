package com.dgmf.fundamentals.interfaces.impl;

import com.dgmf.fundamentals.interfaces.Hotel;

public class Marriot implements Hotel {
    @Override
    public String getStartRating() {
        return null;
    }

    @Override
    public String getHotelName() {
        return "Marriot";
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
