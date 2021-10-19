package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    Guest mainGuest;
    List<Guest> otherGuests = new ArrayList<>(); //nerozumím
    Room room;
    LocalDate begin;
    LocalDate end;
    Type type;

    public Booking(Guest mainGuest, Room room, LocalDate begin, LocalDate end, Type type) {
        this.mainGuest = mainGuest;
        this.room = room;
        this.begin = begin;
        this.end = end;
        this.type = type;
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void addGuest(Guest newGuest) {      //nerozumím
        otherGuests.add(newGuest);              //nerozumím
    }

    public void removeGuest(Guest guest) {      //nerozumím
        otherGuests.remove(guest);              //nerozumím
    }

    public void clearOtherGuests() {            //nerozumím
        otherGuests.clear();                    //nerozumím
    }
//
    public String getDescription() {            //nerozumím
        StringBuilder result = new StringBuilder("Booking for "+mainGuest.getFullName()+" ("+type
                +") from " + begin.toString() + " to " + end.toString() + " other guests: ");
        for (Guest guest : otherGuests) {
            result.append(guest.getFullName()).append(", ");
        }
        return result.toString();
    }

}
