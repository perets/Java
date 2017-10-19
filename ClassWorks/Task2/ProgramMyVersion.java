import java.util.Scanner;

class ProgramMyVersion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		int i = 0;
		int number = scanner.nextInt();
		while ( i < 10 ) {
			array[i] = number;
			i++;
			for (int k = 0; k < i; k++ ) {
				System.out.print(array[k] + " ");

			}
			System.out.println();
			number = scanner.nextInt();
		}

	}
}
