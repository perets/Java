package ru.itis;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[10];
        for (int i = 0; i < 10; i++){
            rectangles[i] = new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1);
            rectangles[i].print();
        }

        for (int i = 0;  i < rectangles.length; i++) {
            int indexMin = i;
            for (int j = i; j < rectangles.length; j++){
                if (rectangles[j].area() < rectangles[indexMin].area()) {
                    indexMin = j;
                }
            }
            Rectangle temp = rectangles[i];
            rectangles[i] = rectangles[indexMin];
            rectangles[indexMin] = temp;
        }
        System.out.println("Сортировка по возрастанию площади: ");
        for (int i = 0; i < 10; i++){
            rectangles[i].print();
        }

    }
}
