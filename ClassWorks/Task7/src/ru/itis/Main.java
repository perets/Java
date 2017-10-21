package ru.itis;

public class Main {

    public static void main(String[] args) {
        RationalNumber rationalNumber = new RationalNumber(25, 35);
        rationalNumber.optimize();
        System.out.println(rationalNumber.numerator + " / " + rationalNumber.denominator );
        //rationalNumber.numerator = 10;
        //rationalNumber.denominator = 11;
    }
}
