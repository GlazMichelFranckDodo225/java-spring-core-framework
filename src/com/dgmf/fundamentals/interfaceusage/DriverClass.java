package com.dgmf.fundamentals.interfaceusage;

import com.dgmf.fundamentals.interfaceusage.impl.Hilton;
import com.dgmf.fundamentals.interfaceusage.impl.Marriot;
import com.dgmf.fundamentals.interfaceusage.interfaces.Hotel;

public class DriverClass {
    public static void main(String[] args) {
        Hotel hotel = new Marriot();
        System.out.println("The Name of the Hotel is " + hotel.getHotelName());

        Hotel hotel2 = new Hilton();
        System.out.println("The Name of the Hotel is " + hotel2.getHotelName());
    }
}