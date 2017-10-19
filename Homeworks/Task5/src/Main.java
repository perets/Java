import java.util.Scanner;

public class Main {

    public static double integrateSin2x (double a, double b, int n){
        double result = 0;
        double deltaX = (b - a)/n;
        for ( double x = a + deltaX; x < b - deltaX; x = x + 2*deltaX){
            result = result + (Math.sin(2 * (x - deltaX)) + 4 * Math.sin(2 * x) + Math.sin(2 * (x + deltaX)));
        }
        return (deltaX/3)*result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();

        double result;
        result = integrateSin2x(a, b, n);
        System.out.println(result);
    }
}
