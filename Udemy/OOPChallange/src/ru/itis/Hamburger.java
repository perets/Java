package ru.itis;

public class Hamburger {
    private String name;
    private double price;
    private Bread bread;
    private Meat meat;
    private String ingredients;
//    private int numberOfIngredients = 0;
    private boolean isCarrot;
    private boolean isLetucce;
    private boolean isTomato;
    private boolean isBacon;

    public Hamburger(Bread bread, Meat meat, double price) {
        this.price = price;
        this.bread = bread;
        this.meat = meat;
        ingredients = "Create a Hamburger";

    }

    public void setName(String name) {
        this.name = name;
        ingredients = "This is " + this.name + " Hamburger";
    }

    public void addTopping(Topping topping) {
        switch (topping.getName()) {
            case "Lettuce": {
                if(isLetucce) {
                    System.out.println(topping.getName()+ " already added!");
                } else {
                    isLetucce = true;
                    ingredients += " with " + topping.getName();
                    this.price += topping.getPrice();
                }
            }
            break;

            case "Tomato": {
                if (isTomato){
                    System.out.println(topping.getName()+ " already added!");
                } else {
                    isTomato = true;
                    ingredients += " with " + topping.getName();
                    this.price += topping.getPrice();
                }
            }
            break;

            case "Carrot": {
                if (isCarrot){
                    System.out.println(topping.getName()+ " already added!");
                }else{
                    isCarrot = true;
                    ingredients += " with " + topping.getName();
                    this.price += topping.getPrice();
                }
            }
            break;

            case "Bacon": {
                if(isBacon){
                    System.out.println(topping.getName()+ " already added!");
                }else{
                    isBacon = true;
                    ingredients += " with " + topping.getName();
                    this.price += topping.getPrice();
                }
            }
            break;

        }

    }

    public void ShowIngredients() {
        System.out.println("This is a standart Hamburger \n with ");
        if(isBacon) System.out.println("Bacon");
        if(isCarrot) System.out.println("Carrot");
        if(isLetucce) System.out.println("Letucce");
        if(isTomato) System.out.println("Tomato");

    }

    public double getPrice() {
        return this.price;
    }
}

class Bread {
    private String type;

    public Bread(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Meat {
    private String type;

    public Meat(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}