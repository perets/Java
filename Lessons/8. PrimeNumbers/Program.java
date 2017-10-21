import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// переменная-флажок, true - если число простое, false - если составное
		boolean isPrime = true;
		// если число 2 ИЛИ три, то говорим, что простое
		if (number == 2 || number == 3) {
			isPrime = true;
		}
		// если число больше, чем 3
		if (number > 3) {
			// начинаем с 2-ки перебирать его делители
			int i = 2;
			// пока делитель меньше корня из самого числа(возвели обе части в квадрат)
			while (i*i <= number) {
				// если number нацело делится на текущий делитель
				if (number % i == 0) {
					// говорим, что число не простое
					isPrime = false;
					// завершаем цикл
					break;
				}
				// если цикл не заврешился - переходим к следуюшему делителю
				i = i + 1;
			}
		}
		// в зависимости от значения флажка печатаем результат
		if (isPrime == true) {
			System.out.println("PROSTOYE");
		} else {
			System.out.println("NE PROSTOYE");
		}
	}
}