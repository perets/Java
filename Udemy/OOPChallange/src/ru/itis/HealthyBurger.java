package ru.itis;

public class HealthyBurger extends Hamburger {
    private boolean isChees;
    private boolean isKetchup;


    public HealthyBurger(Bread bread, Meat meat, double price) {
        super(bread, meat, price);
    }
}
