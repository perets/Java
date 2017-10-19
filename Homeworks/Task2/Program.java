import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); 
		int multiplNumbers = 1; // переменная для произведения
		while (number != -1) {
			
			//System.out.println(number);
			
			int digitsSum = 0;
			int digit = number;
			while (digit !=0) {
				digitsSum = digitsSum + digit%10;
				digit = digit/10;
			}
			
			System.out.println ("Сумма цифр " + digitsSum);
			
			boolean isPrime = true;

			if (digitsSum == 2 || digitsSum == 3) {
				isPrime = true;
			}

			if (digitsSum > 3) {
				int i=2;
				while (i*i <= digitsSum) {
					if (digitsSum % i == 0){
						isPrime = false;
						break;
					}
					i = i + 1;
				}
			}
			if (isPrime == true) {
				multiplNumbers = multiplNumbers * number;
			}
			System.out.println("Произведение чисел сумма цифр которого простое число равно " + multiplNumbers);
			
			number = scanner.nextInt();
		}
	} 
}