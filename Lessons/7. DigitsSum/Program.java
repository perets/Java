import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int digitsSum = 0;
		while (number != 0) {
			digitsSum = digitsSum + number % 10;
			number = number / 10;
		}
		System.out.println(digitsSum);
	}
}