//Terminal  -> Program.java
class Program{
	public static void main (String[] args) {
		int sum = 23423; //сумма для снятия в банкомате
		System.out.println(sum);
		int num5000 = sum / 5000;
		sum = sum % 5000;
		System.out.println("5000 - " + num5000);

		int num1000 = sum / 1000;
		sum = sum % 1000;
		System.out.println("1000 - " + num1000);

		int num500 = sum / 500;
		sum = sum % 500;
		System.out.println("500 - " + num500);

		int num100 = sum / 100;
		sum = sum % 100;
		System.out.println("100 - " + num100);

		int num50 = sum / 50;
		sum = sum % 50;
		System.out.println("50 - " + num50);

		int num10 = sum / 10;
		sum = sum % 10;
		System.out.println("10 - " + num10);

		int num5 = sum / 5;
		sum = sum % 5;
		System.out.println("5 - " + num5);

		int num2 = sum / 2;
		sum = sum % 2;
		System.out.println("2 - " + num2);

		int num1 = sum / 1;
		sum = sum % 1;
		System.out.println("1 - " + num1);
//жловпдло

	}

}