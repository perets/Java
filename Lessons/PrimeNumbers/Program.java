import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// ����������-������, true - ���� ����� �������, false - ���� ���������
		boolean isPrime = true;
		// ���� ����� 2 ��� ���, �� �������, ��� �������
		if (number == 2 || number == 3) {
			isPrime = true;
		}
		// ���� ����� ������, ��� 3
		if (number > 3) {
			// �������� � 2-�� ���������� ��� ��������
			int i = 2;
			// ���� �������� ������ ����� �� ������ �����(������� ��� ����� � �������)
			while (i*i <= number) {
				// ���� number ������ ������� �� ������� ��������
				if (number % i == 0) {
					// �������, ��� ����� �� �������
					isPrime = false;
					// ��������� ����
					break;
				}
				// ���� ���� �� ���������� - ��������� � ���������� ��������
				i = i + 1;
			}
		}
		// � ����������� �� �������� ������ �������� ���������
		if (isPrime == true) {
			System.out.println("PROSTOYE");
		} else {
			System.out.println("NE PROSTOYE");
		}
	}
}