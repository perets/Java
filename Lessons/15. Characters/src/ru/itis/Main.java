package ru.itis;

public class Main {
    public static void main(String[] args) {
	    char letterA = 'A';
	    // результат операции char + int -> int
	    int letterBCode = letterA + 1;
	    char letterB = (char)letterBCode;
        System.out.println(letterB);

    }
}
