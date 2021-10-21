package com.company;

public class Room {
    int roomNumber;
    String capacity;
    boolean hasBalcony;
    boolean hasViewOfTheSea;
    int price;

    public Room(int roomNumber, String capacity, boolean hasBalcony, boolean hasViewOfTheSea, int price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.hasBalcony = hasBalcony;
        this.hasViewOfTheSea = hasViewOfTheSea;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasViewOfTheSea() {
        return hasViewOfTheSea;
    }

    public void setHasViewOfTheSea(boolean hasViewOfTheSea) {
        this.hasViewOfTheSea = hasViewOfTheSea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return "Pokoj č. "+roomNumber+": "+capacity+" míst," +price+" Kč/noc";               
    }
}
