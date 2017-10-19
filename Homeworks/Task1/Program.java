import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int minimumSum = number;
		while (number != -1) {
			int digitsSum = 0;
			int digit = number;
			while (digit !=0) {
				digitsSum = digitsSum + digit%10;
				digit = digit/10;
			}
			System.out.println ("Сумма цифр " + digitsSum);
			
			if (digitsSum < minimumSum) {
				minimumSum = digitsSum;
			}

			number = scanner.nextInt();
		}
		System.out.println(minimumSum);
	} 
}