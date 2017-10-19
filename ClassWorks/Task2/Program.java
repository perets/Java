import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		// фактическое количество элементов
		int count = 0;
		// бесконечный цикл
		while(true) {
			// на каждом шаге цикла выводим - меню
			System.out.println("MENU:");
			System.out.println("1. Show Array");
			System.out.println("2. Add element");
			System.out.println("3. Exit");
			// считываем команду от пользователя
			int command = scanner.nextInt();
			// выбор по command
			switch (command) {
				// если команда 1 - выводим массив
				case 1: {
					for (int i = 0; i < count; i++) {
						System.out.print(array[i] + " ");
					} 
					System.out.println();
				} break;
				// если команда 2
				case 2: {
					// если массив переполнен
					if (count == 10) {
						System.out.println("Array is full");
					} else {
						System.out.println("Enter element");
						// считываем элемент
						int element = scanner.nextInt();
						array[count] = element;
						count++;
					}
				} break;
				case 3: {
					System.exit(0);
				}
			}
		}
	}
}