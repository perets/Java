package ru.itis;

public class Room {
    private Walls walls;
    private Windows windows;
    private Door door;
    private Floor floor;
    private Roof roof;

    public Room(Walls walls, Windows windows, Door door, Floor floor, Roof roof) {
        this.walls = walls;
        this.windows = windows;
        this.door = door;
        this.floor = floor;
        this.roof = roof;
    }

    public void toAir (){
        windows.open();
        door.open();
    }

    public Walls getWalls() {
        return walls;
    }

    public Windows getWindows() {
        return windows;
    }

    public Door getDoor() {
        return door;
    }

    public Floor getFloor() {
        return floor;
    }

    public Roof getRoof() {
        return roof;
    }
}
