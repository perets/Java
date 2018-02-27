package ru.itis;

public class Roof {
    private String material;
    private String color;
    private Lamp lamp;

    public Roof(String material, String color, Lamp lamp) {
        this.material = material;
        this.color = color;
        this.lamp = lamp;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
