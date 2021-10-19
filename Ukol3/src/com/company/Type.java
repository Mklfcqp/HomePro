package com.company;

public enum Type {
    WORKING("working"), HOLIDAY("holiday");

    final String description;

    Type(String description); {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
