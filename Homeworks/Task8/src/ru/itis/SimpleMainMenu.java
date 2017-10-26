package ru.itis;

import java.util.Scanner;

/**
 * 25.10.2017
 * SimpleMainMenu
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleMainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Channel channels[] = new Channel[5];
        int channelsCount = 0;
        while (true) {
            System.out.println("1. Создать канал");
            System.out.println("2. Показать список передач первого канала");
            System.out.println("2. Пульт управления телевизором");
            System.out.println("4. Выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Введите количество передач.");
                    int programsCount = scanner.nextInt();
                    System.out.println("Введите название канала.");
                    String channelName = scanner.next();
                    Channel channel = new Channel(channelName);
                    for (int i = 0; i < programsCount; i++) {
                        System.out.println("Введите время начала, время завершения и название канала.");
                        String startTime = scanner.next();
                        String finishTime = scanner.next();
                        String name = scanner.next();

                        Program program = new Program(name, startTime, finishTime);

                        channel.addProgram(program);
                    }

                    channels[channelsCount] = channel;
                    channelsCount++;
                } break;
                case 2: {
                    channels[0].showAllPrograms();
                }break;

                case 3:{
                //    TvRemote tvRemote = new TvRemote();
                }
                case 4:{
                    System.exit(0);
                }

            }
        }
    }
}
