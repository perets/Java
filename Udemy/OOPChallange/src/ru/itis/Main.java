package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Hamburger standart = new Hamburger(new Bread("White"), new Meat("Black Angus"), 5.0);
        standart.setName("Standart");
        System.out.println("Price is "+ standart.getPrice());
        standart.ShowIngredients();
        standart.addTopping(new Tomato());

        System.out.println("Price is "+ standart.getPrice());
        standart.ShowIngredients();

        standart.addTopping(new Bacon());

        System.out.println("Price is "+ standart.getPrice());
        standart.ShowIngredients();

        standart.addTopping(new Bacon());

        System.out.println("Price is "+ standart.getPrice());
        standart.ShowIngredients();


    }
}
