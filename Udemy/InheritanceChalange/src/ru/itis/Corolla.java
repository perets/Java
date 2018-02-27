package ru.itis;

public class Corolla extends  Car {

    private int monthOfRoadService;

    public Corolla (int monthOfRoadService ){
        super ("Corolla", "2",4,5,4,true);
        this.monthOfRoadService = monthOfRoadService;
    }

    public int getMonthOfRoadService() {
        return monthOfRoadService;
    }
}
