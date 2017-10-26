package ru.itis;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
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

        TvRemote tvRemote = new TvRemote(tv);

    }
}
