package ru.itis;

import java.util.Scanner;

public class Main {

    public static void addElement (ArrayList list, int element){

            if (list.count < list.elements.length) {
                list.elements[list.count] = element;
                list.count++;
            } else {
                System.err.println("Нет места");
            }
    }

    public static void deleteElement (ArrayList list, int index){
        if (index < list.count && index != -1){
            for (int i = index; i < list.count; i++){
                list.elements[i] = list.elements[i + 1];
            }
            list.count--;
        } else {
            System.err.println("Неверный индекс или элемент не найден");
        }
    }

    public static void printElements (ArrayList list){
        for (int i = 0; i < list.count; i++){
            System.out.print(list.elements[i] + " ");
        }
        System.out.println();
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList[] list = new ArrayList[10];

        for (int i = 0; i < 10; i++){
            list[i] = new ArrayList();
        }

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить элемент в список");
            System.out.println("2. удалить элемент из списка");
            System.out.println("3. показать список");
            System.out.println("4. показать все списки");
            System.out.println("5. Выход.");
            int command = scanner.nextInt();

            switch (command){

                case 1: {
                    System.out.print("Введите номер списка: ");
                    int listNumber = scanner.nextInt();
                    System.out.print("Введите элемент ");
                    int element = scanner.nextInt();
                    //if
                    addElement(list[listNumber], element);
                } break;

                case 2: {
                    int index = -1;
                    System.out.print("Введите номер списка: ");
                    int listNumber = scanner.nextInt();
                    System.out.print("Введите элемент: ");
                    int element = scanner.nextInt();
                    for (int i = 0; i < list[listNumber].elements.length; i++){
                        if (list[listNumber].elements[i] == element) {
                            index = i;
                            break;
                        }
                    }
                    deleteElement(list[listNumber], index);
                } break;

                case 3: {
                    System.out.print("Введите номер списка ");
                    int listNumber = scanner.nextInt();
                    for (int i = 0; i < list[listNumber].count; i++){
                        System.out.print(list[listNumber].elements[i] + " ");
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    for (int i = 0; i < list.length; i++){
                        System.out.print(i + ". ");
                        if (list[i].count == 0){
                            System.out.println("Список пуст");
                        } else {
                            printElements(list[i]);
                        }
                    }
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
