class Task31 {
	public static void intersectionArray (int x[], int y[]) {
		int a[] = null, b[] =null;
		if (x.length >= y.length){
			a = x;
			b = y;
		} else {
			a = y;
			b = x;
		}
		for (int i = 0; i < a.length; i++) {
			for ( int j = 0; j < b.length; j++){
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
					break;
				}
			}
		}
	}



	public static void main(String[] args) {
		int a[] = {1, 4, 6, 8, 7, 5,};
		int b[] = {1, 2, 3, 4, 7, 9, 10};
		intersectionArray(a, b);
	}




}