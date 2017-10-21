package ru.itis;

import java.util.Scanner;

public class Main {

    public static double integrateSin2x(double a, double b, int n) {
        double result = 0;
        double deltaX = Math.abs(b - a) / n;
        for (double x = a; x <= b; x = x + deltaX) {
            result = result + Math.sin(2 * x) * deltaX;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // границы инегрирования
        double a, b;

        // количество разбиений
        int n;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        n = scanner.nextInt();

        double result = integrateSin2x(a, b, n);
        System.out.println(result);
    }
}
