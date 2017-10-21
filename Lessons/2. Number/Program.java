class Program {
	public static void main(String[] args) {
		int x = 211;
		int x0 = x % 2; // 1
		x = x / 2; // 105
		int x1 = x % 2; // 1
		x = x / 2; // 52
		int x2 = x % 2; // 0
		x = x / 2; // 26
		// ...
		// дописать
		System.out.println(x7 + "" + x6 + ""
			+ x5 + "" + x4 + "" + x3 + "" + x2
			+ "" + x1 + "" + x0);
	}
}