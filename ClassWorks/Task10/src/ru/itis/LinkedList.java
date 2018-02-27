package ru.itis;

/**
 * 11.11.2017
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    public void addToBegin(T element) {
        // создаем новый узел
        Node<T> newNode = new Node<>();
        // кладем в узел значение
        newNode.element = element;

        // если в списке не было ничего
        if (head == null) {
            // новый элемент, который пришел первым, стал последним
            tail = newNode;
            this.count++;
        }

        newNode.next = head;
        this.head = newNode;
        this.count++;
    }

    // добавляет в конец
    public void  add(T element) {
        Node<T> newNode = new Node<>();
        newNode.element = element;

        if (head == null){
            tail = newNode;
            head = newNode;
            this.count++;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
            this.count++;
        }
    }

    public T get (int index){
        if (index >= 0 && index < count) {
            int i = 0;
            Node<T> current = head;
            while (i < index){
                current = current.next;
                i++;
            }
            return current.element;

        } else {
            return null;
        }
    }


    public void remove (int index){
        if (index >= 0 && index < count) {
            int i = 0;
            Node<T> current = head;
            while (i < index-1){
                current = current.next;
                i++;
            }
            current.next = current.next.next;
            this.count--;

        } else {
            System.out.println("Такого элемента не существует");
        }
    }
}