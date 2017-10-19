import java.util.Scanner;
import java.util.Random;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Введите размер массива: ");
		int arraySize = scanner.nextInt();
		int array[] = new int[arraySize];
		//Заполняем массив
		for (int i = 0; i < arraySize; i++){
			array[i] = random.nextInt(100) - 50;
		}

		//выводим массив на экран для дальнейшего сравнения
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// находим номер минимального и максимального элемента
		int indexMax = 0, indexMin = 0;
		for (int i = 1; i < arraySize; i++ ) {
			if (array[i] < array[indexMin]){
				indexMin = i;
			}

			if (array[i] > array[indexMax]){
				indexMax = i;
			}
		}
		System.out.println("Минимальный элемен массива равен " + array[indexMin] + ". Его номер " + indexMin + ". ");
		System.out.println("Максимальный элемен массива равен " + array[indexMax] + ". Его номер " + indexMax + ". ");
		//меняем местами минимальный и максимальный элемент
		int temp = array[indexMin];
		array[indexMin] = array[indexMax];
		array[indexMax] = temp;

		//снова выводим массив для проверки
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}		

	}
}