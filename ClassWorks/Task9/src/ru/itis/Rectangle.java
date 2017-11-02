package ru.itis;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        if (length >= 0){
            this.length = length;
        } else {
            this.length = 1;
        }
        if (width >= 0) {
            this.width = width;
        } else {
            this.width =1;
        }
    }

    double calcArea (){
        double area;
        area = length * width;
        return area;
    }

    double calcPerimeter (){
        double perimeter;
        perimeter = 2 * (length + width);
        return perimeter;
    }
}
