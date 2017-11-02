package ru.itis;

public class Ellips extends Shape {
    private double a;
    private double b;

    public Ellips(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    double calcArea() {
        return Math.PI * a * b;
    }

    @Override
    double calcPerimeter() {
        return 2* Math.PI * Math.sqrt((a * a + b * b )/ 2);
    }
}
