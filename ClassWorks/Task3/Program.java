class Program {
	
	public static void printArrayReverse (int array[]) {
		for (int i = array.length - 1; i > 0; i--){
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {-5, -4, -3, -2, -1, 0};
		printArrayReverse(a);
	}
}

