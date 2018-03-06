package ru.itis;

public class Topping {

    private String name;
    private double price;
    private boolean isAdded;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setAdded(boolean added) {
        isAdded = added;
    }

    public boolean isAdded() {
        return isAdded;
    }


}

class Lettuce extends Topping {

    public Lettuce() {
        super("Lettuce", 0.20);
    }

}

class Tomato extends Topping {
    public Tomato() {
        super("Tomato", 0.50);
    }
}

class Carrot extends Topping {
    public Carrot () {
        super("Carrot", 0.10);
    }
}
class Bacon extends Topping {
    public Bacon() {
        super("Bacon", 0.90);
    }
}