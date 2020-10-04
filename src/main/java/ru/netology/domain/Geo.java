package ru.netology.domain;

public class Geo {
    String type;
    String coordinates;
    private int object;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }
}
