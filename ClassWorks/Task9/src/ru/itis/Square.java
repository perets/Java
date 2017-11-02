package ru.itis;

public class  Square extends Rectangle{

    public Square(double x, double y, double side) {
        super(x, y, side, side);
    }

    @Override
    double calcArea() {
        return super.calcArea();
    }

    @Override
    double calcPerimeter() {
        return super.calcPerimeter();
    }
}
