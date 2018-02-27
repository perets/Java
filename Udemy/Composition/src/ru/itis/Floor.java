package ru.itis;

public class Floor {
    private String material;
    private String color;
    private boolean isClean;

    public Floor(String material, String color, boolean isClean) {
        this.material = material;
        this.color = color;
        this.isClean = isClean;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isClean() {
        return isClean;
    }
}
