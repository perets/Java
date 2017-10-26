package ru.itis;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[5];
        for (int i = 0; i < 5; i++){
            rectangles[i] = new Rectangle(random.nextInt(10), random.nextInt(10));
            System.out.println(rectangles[i].area());
        }

    }
}
