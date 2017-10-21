package ru.itis;

public class Main {
    // подпрограмма-процедура
    // selectionSort - имя процедуры, может быть любым
    // array - формальный параметр
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            // ищем минмальный элемент в диапазоне [i, N-1].
            int min = array[i];
            int indexOfMin = i;
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    indexOfMin = j;
                }
            }
            // поменяли местами i-ый элемент и минимальный элемент
            int temp = array[i];
            array[i] = min;
            array[indexOfMin] = temp;
            // в min - минимальный элемент
            // indexOfMin - индекс минимального элемента
        }
    }
    public static void main(String[] args) {
	    int a[] = {-10, 14, 10, 5, 11};
	    int b[] = {2, -10, 1, 5, 2, 10, 12, 4};

	    // вызов процедуры с аргументом a
        selectionSort(a);
        // вызов процедуры с аргументом b
        selectionSort(b);
    }
}
