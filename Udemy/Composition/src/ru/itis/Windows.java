package ru.itis;

public class Windows {
    private String material;
    private String color;
    private boolean isDoubleGlazed;
    private String furniture;

    public Windows(String material, String color, boolean isDoubleGlazed, String furniture) {
        this.material = material;
        this.color = color;
        this.isDoubleGlazed = isDoubleGlazed;
        this.furniture = furniture;
    }

    public void open(){
        System.out.println("Windows was opened!");
    }

    public void close(){
        System.out.println("Windows was closed!");
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isDoubleGlazed() {
        return isDoubleGlazed;
    }

    public String getFurniture() {
        return furniture;
    }
}
