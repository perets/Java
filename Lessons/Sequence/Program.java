import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentNumber;
		int compSum = 1;

		currentNumber = scanner.nextInt();
		while (currentNumber != -1) {
			if (currentNumber % 10 == 7) {
				compSum = compSum * currentNumber;
			}
			currentNumber = scanner.nextInt();
		}
		System.out.println("Composition " + compSum);
	}
}