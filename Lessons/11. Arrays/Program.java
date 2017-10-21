class Program {
	public static void main(String[] args) {
		int array[] = {-1, 2, 1, 5, 6};

		// output array
		int i = 0;
		while (i < 5) {
			System.out.print(array[i] + " ");
			i++; // i = i + 1
		}
		System.out.println();
		// reverse output array
		i = 4;
		while (i >= 0) {
			System.out.print(array[i] + " ");
			i--;
		}
	}
}
