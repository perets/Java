package ru.itis;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[5];
        for (int i = 0; i < 5; i++){
            rectangles[i] = new Rectangle();
            rectangles[i].widht = random.nextInt(10);
            rectangles[i].lenght = random.nextInt(10);
        }

    }
}
