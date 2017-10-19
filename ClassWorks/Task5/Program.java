import java.util.Scanner;

class Program {
	public static double integrateSin2x (double a, double b, int n) {
		double result = 0;
        double deltaX = Math.abs(b - a) / n;
        for (double x = a; x <= b; x = x + deltaX) {
            result = result + Math.sin(2 * (2*x - deltaX) / 2) * (-deltaX);
        }
        return result;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double a, b;
        int n;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        n = scanner.nextInt();
        double result = integrateSin2x(a, b, n);
        System.out.println(result);
	}
}