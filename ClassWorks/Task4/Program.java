class Program {
	public static int minArray (int a[]){
		int indexMin = 0;
		for (int i = 1; i < a.length; i++){
			if (a[i] < a[indexMin]){
				indexMin = i;
			}
		}
		return a[indexMin];

	}

	public static void main (String[] args){
		int a[] = {5, 8, -3, 6, -7};
		System.out.println(minArray(a));
	}
}