package com.dgmf.fundamentals.main;

import com.dgmf.fundamentals.interfaces.Hotel;
import com.dgmf.fundamentals.interfaces.impl.Hilton;
import com.dgmf.fundamentals.interfaces.impl.Marriot;

public class MainApp {
    public static void main(String[] args) {
        Hotel hotel = new Marriot();
        System.out.println("The Name of the Hotel is " + hotel.getHotelName());

        Hotel hotel2 = new Hilton();
        System.out.println("The Name of the Hotel is " + hotel2.getHotelName());
    }
}