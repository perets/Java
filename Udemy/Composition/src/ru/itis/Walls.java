package ru.itis;

public class Walls {
    private String material;
    private String color;

    public Walls(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
