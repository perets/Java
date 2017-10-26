package ru.itis;
import java.util.Scanner;

public class TvRemote {

    TvRemote (TV tv){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер канала: ");
            int chennelNumber = 0;
            chennelNumber = scanner.nextInt();
            tv.switchChannel(chennelNumber);
        }
    }
}

