package ru.itis;

public class Rectangle {
    int lenght = 0;
    int widht = 0;

    public Rectangle (int lenght, int widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    public int area(){
        return lenght * widht;
    }

    public void print(){
        System.out.println("Длина: " + this.lenght + ". "
                + "Ширина: " + this.widht + ". " + "Площадь: " + this.area());
    }
}
