import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentNumber;
		int evensSum = 0;

		currentNumber = scanner.nextInt();
		while (currentNumber != -1) {
			if (currentNumber % 2 == 0) {
				evensSum = evensSum + currentNumber;
			}
			currentNumber = scanner.nextInt();
		}
		System.out.println("SUM " + evensSum);
	}
}