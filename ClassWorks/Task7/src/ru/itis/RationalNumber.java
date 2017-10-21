package ru.itis;

/**
 * 21.10.2017
 * RationalNumber
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RationalNumber {
    // числитель
    int numerator;
    // знаменатель
    int denominator;

    // метод - процедура для сокращения дроби
    void optimize() {
        int nod = runEuclidAlgorithm(numerator, denominator);
        numerator = numerator / nod;
        denominator = denominator / nod;
    }

    // выполняет поиск НОД двух чисел
    int runEuclidAlgorithm(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        // тернарный услонвый оператор e ? x : y,
        // результатом выражения будет x, если e - верно
        // и y - если e - ложно.
//        if (a != 0) {
//            return a;
//        } else {
//            return b;
//        }
        return a != 0 ? a : b;
    }

    public RationalNumber (int numerator, int denominator){
        if (denominator != 0 ){
            this.numerator = numerator;
            this.denominator = denominator;
            System.out.println(this.numerator);
            System.out.println(this.denominator);
        } else {
            System.out.println("не возможно инициализировать рациональное число! На ноль делить нельзя!");
        }
    }
}
