package ru.itis;

public class Door {
    private String material;
    private String color;
    private String furniture;

    public Door(String material, String color, String furniture) {
        this.material = material;
        this.color = color;
        this.furniture = furniture;
    }

    public void open(){
        System.out.println("Door was opened!");
    }

    public void close(){
        System.out.println("Door was closed!");
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getFurniture() {
        return furniture;
    }
}
