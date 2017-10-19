class Program {
		public static void main (String[] args) {
			int x = 211;
			
			int x0 = x % 2;
			x = x / 2;

			int x1 = x % 2;
			x = x / 2;

			int x2 = x % 2;
			x = x / 2;

			int x3 = x % 2;
			x = x / 2;

			int x4 = x % 2;
			x = x / 2;

			int x5 = x % 2;
			x = x / 2;

			int x6 = x % 2;
			x = x / 2;

			int x7 = x % 2;
			x = x / 2;
			System.out.println(x7 + "" + x6 + "" + x5 + "" + x4 + "" + x3 + "" + x2 + "" + x1 + "" + x0 );
	}		
}