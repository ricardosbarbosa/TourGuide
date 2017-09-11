package com.github.ricardosbarbosa.tourguide.model;

public class Location {
    public final String name;
    public final Integer image;

    public Location(String name, Integer image) {
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString() {
        return name;
    }
}