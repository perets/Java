// подключаем необходимые библиотеки
import java.util.Scanner; // библиотека дл€ считывани€
import java.util.Random; // дл€ генерации случайных чисел
// ваша программа внутри class Program
class Program {
	// входна€ точка приложени€, любое приложение начинает запуск с нее
	public static void main(String args[]) {
		// объ€вили переменную дл€ считывани€
		Scanner scanner; 
		// настроили ее на консоль
		scanner = new Scanner(System.in);
		// объ€вили и создали генератор случайных чисел
		Random random;
		random = new Random();

		// попросили компьютер сгенерировать случайное число от 0 до 10
		int computerNumber = random.nextInt(10);
		// считали число с консоли
		int userNumber = scanner.nextInt();
		// пока числа не равны
		while (computerNumber != userNumber) {
			// сравниваем и пишем результат
			if (computerNumber > userNumber) {
				System.out.println("computerNumber is larger");
			} else {
				System.out.println("computerNumber is smaller");
			}
			// считываем новое число
			userNumber = scanner.nextInt();
		}

		System.out.println("You are right!");
	}
}