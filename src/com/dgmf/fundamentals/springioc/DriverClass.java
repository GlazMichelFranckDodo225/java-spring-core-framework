package com.dgmf.fundamentals.springioc;

import com.dgmf.fundamentals.springioc.impl.Hilton;
import com.dgmf.fundamentals.springioc.impl.Marriot;
import com.dgmf.fundamentals.springioc.interfaces.Hotel;

public class DriverClass {
    public static void main(String[] args) {
        Hotel hotel = new Marriot();
        System.out.println("The Name of the Hotel is " + hotel.getHotelName());

        Hotel hotel2 = new Hilton();
        System.out.println("The Name of the Hotel is " + hotel2.getHotelName());
    }
}