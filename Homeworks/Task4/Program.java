package

import java.util.Scanner;

class Program {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int currentArraySize = 0;
		int arraySize = 0;
		int element;
		int array[] = new int[0];
		
		while (true) {
			System.out.println("Меню:");
			System.out.println("1. Создать пустой массив.");
			System.out.println("2. Добавить эемент в конец массива.");
			System.out.println("3. Добавить лемент в начало массива.");
			System.out.println("4. Развернуть массив на месте");
			System.out.println("5. Отсортировать массив по возрастанию");
			System.out.println("6. Найти минимальный элемент массива.");
			System.out.println("7. Найти максимальный элемент массива.");
			System.out.println("8. Вывести массив.");
			System.out.println("9. Выход.");
			
			int command = scanner.nextInt();
			
			switch(command) {
				
				case 1: {
					System.out.print("Введите размер массива: ");
					arraySize = scanner.nextInt();
					array = new int[arraySize];
					System.out.println("Массив создан");
					System.out.println();
				}break;
				
				case 2: {
					if (currentArraySize == arraySize){
						System.out.println("Массив переполнен!!!");
						System.out.println();
					} else {
						System.out.print("Введите новый элемент:");
						element = scanner.nextInt();
						array[currentArraySize] = element;
						currentArraySize++;
					}
				} break;
				
				case 3: {
					element = scanner.nextInt();
					if (currentArraySize == 0) {
						array[currentArraySize] = element;
						currentArraySize++;
					} else {
						for (int i = currentArraySize; i > 0; i--){
							array[i] = array[i-1];
						}
						array[0] = element;
						currentArraySize++;
					}
					System.out.println("Элемент добавлен!");
				}break;
				
				case 4: {
					for (int i = 0; i < currentArraySize/2; i++ ){
						int temp = array[i];
						array[i] = array[currentArraySize -1 -i]; 
						array[currentArraySize-1-i] = temp;
					}
					System.out.println("Разворот выполнен");
					break;
				}
				
				case 5: {
					for (int i = 0;  i < currentArraySize; i++) {
						int indexMin = i;
						for (int j = i; j < currentArraySize; j++){
							if (array[j] < array[indexMin]) {
								indexMin = j;
							}
						}
						int temp = array[i];
						array[i] = array[indexMin];
						array[indexMin] = temp;
					}
					System.out.println("Сортировка выполнена");
					
					for (int i = 0; i < currentArraySize; i++){
						System.out.print(array[i] + " ");
					}
					System.out.println();
					break;
				}
				
				case 6: {
					int indexMin = 0;
					for (int i = 1; i < currentArraySize; i++){
						if (array[i] < array[indexMin]) {
							indexMin = i;
						}
					}
					System.out.println("Минимльный элемент массива равен " + array[indexMin] + ". " + "Его индекс " + indexMin + ".");
					break;
				}
				
				case 7: {
					int indexMax = 0;
					for (int i = 1; i < currentArraySize; i++){
						if (array[i] > array[indexMax]) {
							indexMax = i;
						}
					}
					System.out.println("Максимальный элемент массива равен " + array[indexMax] + ". " + "Его индекс " + indexMax + ".");
					break;
				}
				
				case 8: {
					for (int i = 0; i < currentArraySize; i++){
						System.out.print(array[i] + " ");
					}
					System.out.println();
					break;
				}
				case 9: {
					System.exit(0);
				}
				
			}
		}
	}
}