package ru.itis;

public class Main {

    public static void main(String[] args) {
        char a[] = {'5', '6', '2', '1', '7'};
        System.out.println(parseNumber(a));
    }

    public static boolean isLetter(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDigit(char c) {
        if (c >= '0' && c <='9'){
            return true;
        } else {
            return false;
        }
    }

    // ['2','3','1','6'] -> 2316
    public static int parseNumber(char digits[]) {
        int result = 0;
        int pow = 1;
        for (int i = digits.length-1; i >= 0; i--){
            result = result + convertToIntFromDigit(digits[i])*pow;
            pow = pow * 10;
        }
        return result;
    }

        // '1' -> 1
        // '8' -> 8
    public static int convertToIntFromDigit(char c) {
        return c - '0';
    }
}
