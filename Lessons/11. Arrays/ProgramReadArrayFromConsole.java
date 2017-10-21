import java.util.Scanner;

class ProgramReadArrayFromConsole {
	public static void main(String[] args) {
		// объявляем сканнер для считывания
		Scanner scanner = new Scanner(System.in);
		// переменная, в которой вы будете хранить размер массива
		int arraySize;
		// считываем размер массива с консоли
		arraySize = scanner.nextInt();
		// объявлем массив размерна arraySize
		int array[] = new int[arraySize];
		// бежим по каждому элементу массива
		for (int i = 0; i < arraySize; i++) {
			// кладем туда значение, считанное с консоли
			array[i] = scanner.nextInt();
		}

		// бежим по всем элементам массива
		for (int i = 0; i < arraySize; i++) {
			// если элемент массива четный - заменяем его нулем
			if (array[i] % 2 == 0) {
				array[i] = 0;
			}
		}

		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}
	}
}