package com.dgmf.fundamentals.interfaceusage.main.interfaces;

import com.dgmf.fundamentals.interfaceusage.main.interfaces.impl.Hilton;
import com.dgmf.fundamentals.interfaceusage.main.interfaces.impl.Marriot;

public class DriverClass {
    public static void main(String[] args) {
        Hotel hotel = new Marriot();
        System.out.println("The Name of the Hotel is " + hotel.getHotelName());

        Hotel hotel2 = new Hilton();
        System.out.println("The Name of the Hotel is " + hotel2.getHotelName());
    }
}