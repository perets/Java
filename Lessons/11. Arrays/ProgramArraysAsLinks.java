class ProgramArraysAsLinks {
	public static void main(String[] args) {
		int x = 7;
		int y = 10;

		y = x;
		y = 5;
		System.out.println(x); // 7

		int a[] = {4, 5, 6};
		int b[] = a;
		b[1] = 10;
		System.out.println(a[1]);
	}
}