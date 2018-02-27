package ru.itis;

/**
 * 11.11.2017
 * MainList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Максим"); // 0
        list.add("Ильгиз"); // 1
        list.add("Артем"); // 2
        list.add("Александр"); // 3
        list.add("Денис"); // 4

        String element = list.get(0);
        System.out.println(element);

        list.remove(3);

        int i = 0;
    }
}