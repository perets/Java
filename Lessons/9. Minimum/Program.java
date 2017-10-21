import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int currentNumber = scanner.nextInt();
		int min = currentNumber;

		while (currentNumber != -1) {
			if (currentNumber < min) {
				min = currentNumber;
			}
			currentNumber = scanner.nextInt();
		}

		System.out.println(min);
	}
}
