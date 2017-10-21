import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		// переменная scanner для считывания
		Scanner scanner = new Scanner(System.in);
		// переменная для хранения текущего считанного числа
		int currentNumber;
		// произведение всех чисел, оканчивающихся на 7
		int mutl7End = 1;
		// считываем число
		currentNumber = scanner.nextInt();
		// пока число не равно -1
		while (currentNumber != -1) {
			// если число оканчивается на 7
			if (currentNumber % 10 == 7) {
				// считаем произведение 
				mutl7End = mutl7End * currentNumber;
			}
			// считываем новое число
			currentNumber = scanner.nextInt();
		}
		System.out.println("SUM " + evensSum);
	}
}