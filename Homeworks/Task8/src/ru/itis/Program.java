package ru.itis;

import java.time.LocalTime;

/**
 * 25.10.2017
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {
    // поля класса - свойства класса, значения полей
    // определяют состояние объекта
    String name;

    // время начала программы
    LocalTime startTime;

    // время завершения программы
    LocalTime finishTime;

    public Program(String name, String startTime, String finishTime) {
        // используем функцию parse класса LocalTime для
        // преобразования времени в виде строки в формат, понятный java
        this.startTime = LocalTime.parse(startTime);
        this.finishTime = LocalTime.parse(finishTime);
        this.name = name;
    }

    boolean isGoingNow() {
        // сохранили текущее время
        LocalTime nowTime = LocalTime.now();
        // если текущее время после начала программы и перед концом программы
        if (nowTime.isAfter(startTime) &&
                nowTime.isBefore(finishTime)) {
            return true;
        } else {
            return false;
        }
    }
}
