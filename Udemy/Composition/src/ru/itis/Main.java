package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Walls walls = new Walls("Brick", "White");
        Windows windows = new Windows("Wood", "Brown",true, "Rehau");
        Door door = new Door("Wood", "White", "SuperPuper");
        Floor floor = new Floor("Laminate", "White-grey", true);
        Roof roof = new Roof("Strech", "White-Blue", new Lamp("MOdern",false,30));

        Room hall = new Room(walls, windows,door,floor,roof);

        hall.getRoof().getLamp().turnOn();
    }
}
