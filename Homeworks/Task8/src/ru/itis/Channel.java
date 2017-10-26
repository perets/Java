package ru.itis;

import java.time.format.DateTimeFormatter;

/**
 * 25.10.2017
 * Channel
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Channel {
    // массив передач
    Program programs[];
    // количество программ, которые есть в канале
    int count = 0;

    String name;

    Channel(String name) {
        // объявили массив из 5 переменных для хранения программ
        // сейчас в массиве программ нет вообще
        this.programs = new Program[5];
        this.name = name;
    }

    void addProgram(Program program) {
        this.programs[count] = program;
        count++;
    }

    void showAllPrograms() {
        System.out.println(this.name + " программа передач.");
        // создаем объект Formatter для форматирования времени по нашему шаблону
        // далее этот форматтер будет передан во время начала и во время конца передачи
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");
        for (int i = 0; i < count; i++) {
            System.out.println(programs[i].startTime.format(formatter) + " : " +
                    programs[i].finishTime.format(formatter) + " - " + programs[i].name);
        }
    }


    void showCurrentProgram() {
        // пробегаем по всем передачам канала
        for (int i = 0; i < count; i++) {
            // если i-ая передача идет в данный момент - выводим ее
            if (programs[i].isGoingNow() == true) {
                System.out.println(programs[i].name);
            }
        }
    }
}
