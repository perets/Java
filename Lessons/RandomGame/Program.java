// ���������� ����������� ����������
import java.util.Scanner; // ���������� ��� ����������
import java.util.Random; // ��� ��������� ��������� �����
// ���� ��������� ������ class Program
class Program {
	// ������� ����� ����������, ����� ���������� �������� ������ � ���
	public static void main(String args[]) {
		// �������� ���������� ��� ����������
		Scanner scanner; 
		// ��������� �� �� �������
		scanner = new Scanner(System.in);
		// �������� � ������� ��������� ��������� �����
		Random random;
		random = new Random();

		// ��������� ��������� ������������� ��������� ����� �� 0 �� 10
		int computerNumber = random.nextInt(10);
		// ������� ����� � �������
		int userNumber = scanner.nextInt();
		// ���� ����� �� �����
		while (computerNumber != userNumber) {
			// ���������� � ����� ���������
			if (computerNumber > userNumber) {
				System.out.println("computerNumber is larger");
			} else {
				System.out.println("computerNumber is smaller");
			}
			// ��������� ����� �����
			userNumber = scanner.nextInt();
		}

		System.out.println("You are right!");
	}
}