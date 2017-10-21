// Terminal -> Program.java
class Program {
	public static void main(String args[]) {
		int sum = 13567; // сумма,
		// которую хочет снять человек в банкомате

		// необходимо вывести количество купюр каждого номинала
		int x5000 = sum / 5000;
		sum = sum % 5000; // 3567
		int x1000 = sum / 1000;
		sum = sum % 1000;
		System.out.println("5000 - " + x5000);
		System.out.println("1000 - " + x1000);
		System.out.println("500 - " + x500);
		System.out.println("5000 - " + x5000);
		System.out.println("5000 - " + x5000);
	}
}