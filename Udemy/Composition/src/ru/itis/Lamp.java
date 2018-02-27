package ru.itis;

public class Lamp {
    private String style;
    private boolean isBattary;
    private int globRating;

    public Lamp(String style, boolean isBattary, int globRating) {
        this.style = style;
        this.isBattary = isBattary;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning On");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattary() {
        return isBattary;
    }

    public int getGlobRating() {
        return globRating;
    }
}
