class Program {
	public static void main(String[] args) {
		int array[] = {1, 6, 3, -1, 2, 4, 7, 8};

		for (int i = 0; i < 8; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < 4 ; i++) {
			int buffer = array[i];
			array[i] = array [8-1-i];
			array[8-1-i] = buffer;
		}

		System.out.println();	
		for (int i = 0; i < 8; i++) {
			System.out.print(array[i] + " ");
		}
	}
}