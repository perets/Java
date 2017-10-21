class ProgramWithFor {
	public static void main(String[] args) {
		int array[] = {-1, 2, 1, 5, 6};

		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}