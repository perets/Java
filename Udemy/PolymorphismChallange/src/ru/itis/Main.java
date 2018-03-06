package ru.itis;

public class Main {

    static class Car{
        private String name;
        private boolean engine;
        private int celinders;
        private int wheels;
        private  int velocity;

        Car(String name, int celinders) {
            this.name = name;
            this.celinders = celinders;
            this.wheels = 4;
            this.engine = true;
            this.velocity = 0;
        }

        String startEngine(){
            return "Engine is start!";
        }

        int accelerate (int speed){
            System.out.println("car.accelerate");
            return this.velocity + speed;
        }

        void brake(){
            System.out.println("car.brake");
            this.velocity = 0;
        }
    }

    static class Audi extends Car {

         Audi(String name, int celinders) {
            super("Audi " + name, 8);
        }

        @Override
         int accelerate(int speed) {
            System.out.println("Audi.accelerate");
            return super.accelerate(speed);
        }


    }

     static class Bmw extends Car {
         Bmw(String name, int celinders) {
            super("BMW " + name, 6);
        }

        @Override
         int accelerate(int speed) {
            System.out.println("BMW.accelerate");
            return super.accelerate(speed);
        }
    }



     static class RangeRover extends Car {
         RangeRover(String name, int celinders) {
            super("RangeROver "+ name, 8);
         }

        @Override
        public int accelerate(int speed) {
            System.out.println("RangeRover.accelerate");
            return super.accelerate(speed);
        }

        @Override
        public String startEngine() {
            System.out.println("RangeRover");
            return super.startEngine();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15 ; i++) {
            Car car = randomCar();
            car.accelerate(5);
            car.startEngine();
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generate was " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Audi("A6", 8);

            case 2:
                return new Bmw("x5",6);

            case 3:
                return new RangeRover("Sport", 8);
        }
        return null;
    }
}
