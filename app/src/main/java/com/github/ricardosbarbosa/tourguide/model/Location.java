package com.github.ricardosbarbosa.tourguide.model;

public class Location {
    public final String name;
    public final String image;

    public Location(String name, String image) {
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString() {
        return name;
    }
}