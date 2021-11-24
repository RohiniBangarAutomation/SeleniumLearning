package Set1JavaAssignment;

/*22.Get two integer arrays as input. Find if there are common elements in the arrays. find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4) */

public class Q22CommonArrayele {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 3, 4, 5, 6 };
		int i, j;
		int count=0;
		System.out.println("common array elements:");
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(" " + arr1[i]);
					count++;

				}

			}
		}
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(" " + arr2[j]);
					count++;
				}

			}

		}
		System.out.println("\nTotal common array elements:"+count);

	}
}
