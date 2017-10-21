package ru.itis;

public class Main {

    public static int sumElementsInArray(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
	    int a[] = {3, 5, 2, 5, 6};
	    int result = sumElementsInArray(a);
        System.out.println(result);
    }
}
