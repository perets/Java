package ru.itis;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(55,false);
        printer.print(10);
        System.out.println(""+printer.getTonerLevel());
        System.out.println(""+printer.getNumberOfPrintedPages());
        printer.fillToner();

        
    }
}
