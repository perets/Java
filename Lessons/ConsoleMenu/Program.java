import java.util.Scanner;
class Program {
	public static void main(String[] args) throws Exception {
		System.setOut(new java.io.PrintStream(System.out, true, "cp866"));
		Scanner scanner = new Scanner(System.in);
		int a, b;
		while (true) {
			System.out.println("MENU:");			
			System.out.println("1. Sum numbers");			
			System.out.println("2. Sub numbers");			
			System.out.println("3. Exit");

			int command = scanner.nextInt();

			switch(command) {
				case 1: {
					System.out.println("Enter two numbers");
					a = scanner.nextInt();
					b = scanner.nextInt();
					int sum = a + b;
					System.out.println(a + "+" + b + "=" + sum);
				} break;
				case 2: {
					System.out.println("Enter two numbers");
					a = scanner.nextInt();
					b = scanner.nextInt();
					int sub = a - b;
					System.out.println(a + "-" + b + "=" + sub);
				}; break;
				case 3: {
					System.exit(0);
				}; break;
			}
		}
	}
}