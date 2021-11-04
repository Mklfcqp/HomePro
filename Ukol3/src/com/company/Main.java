package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        System.out.println(adela.getDescription());

        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(jan.getDescription());


        Room room1 = new Room(1, "jednolůžkový", true, true, 1000);
        System.out.println(room1.getDescription());
        Room room2 = new Room(2, "jednolůžkový", true, true, 1000);
        System.out.println(room2.getDescription());
        Room room3 = new Room(3, "trojlůžkový", false, true,2400);
        System.out.println(room3.getDescription());

        Bookings bookings = new Bookings();
        Booking booking1 = new Booking(adela, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Type.HOLIDAY);
        bookings.addBooking(booking1);

        Booking booking2 = new Booking(adela, room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Type.WORKING);
        booking2.addGuest(jan);
        bookings.addBooking(booking2);

        bookings.printBookings();

    }
}