package Assignment2;

public class ArrayExample {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[5];
		int i = 0;

		a[0] = 2;
		a[1] = 3;
		a[2] = 5;

		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 6;
		b[4] = 5;
		// System.out.println("same elements in both array are:");
		System.out.println("commoan array elements:");
		int sum = 0;
		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					// System.out.println(" "+a[i]);
					int[] commonarr = { a[i] };

					for (int z = 0; z < commonarr.length; z++) {
						System.out.println(" " + commonarr[z]);
					}

					sum = sum + a[i];
				}
			}
		}
		System.out.println("sum of common elements:" + sum);
	}

}
