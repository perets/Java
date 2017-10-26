package ru.itis;

import java.util.Scanner;

public class TvRemote {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Program goodMorning =
                new Program("Доброе утро", "05:00", "09:00");
        Program letsSpeak =
                new Program("Пусть говорят", "18:00", "19:00");
        Program news =
                new Program("Новости", "12:00", "12:10");

        Channel firstChannel =
                new Channel("Первый канал");

        firstChannel.addProgram(goodMorning);
        firstChannel.addProgram(news);
        firstChannel.addProgram(letsSpeak);

        //firstChannel.showAllPrograms();

        Program criminalNews =
                new Program("Сегодня", "12:00", "12:20");
        Program youNotBelieve =
                new Program("Ты не поверишь", "20:15", "22:15");

        Channel ntv = new Channel("НТВ");

        ntv.addProgram(criminalNews);
        ntv.addProgram(youNotBelieve);

        //ntv.showAllPrograms();

        TV tv = new TV();
        tv.add(firstChannel);
        tv.add(ntv);

        while (true) {
            System.out.println("Введите номер канала: ");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
            int chennelNumber = 0;
            chennelNumber = scanner.nextInt();
            tv.switchChannel(chennelNumber);

        }
    }
}

