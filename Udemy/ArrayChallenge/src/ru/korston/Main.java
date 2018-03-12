package ru.korston;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        printArray(numbers);
        printArray(sortIntegers(numbers));

    }

    public static int[] getIntegers (int size){
        System.out.println("Enter " + size + " integer value: \r");
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = scanner.nextInt();

        }
        return numbers;

    }

    public static void printArray (int[] numbers){
        System.out.println("\n ");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]+ ", ");
        }
        System.out.println("");
    }

    public static int[] sortIntegers(int[] numbers){

        for (int i = 0; i < numbers.length ; i++) {
            int indexMax = i;
            for (int j = i; j < numbers.length ; j++) {
                if(numbers[j] > numbers[indexMax]){
                    indexMax = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMax];
            numbers[indexMax] = temp;

        }
        return numbers;
    }

}
