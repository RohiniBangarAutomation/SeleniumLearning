package Set2JavaAssignments;

import java.util.Arrays;
//9) int[] a={12,14,2,26,35}
//find the difference b/w max and min values in array
//output:35-2=33.
public class Q9DiffInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 23, 6, 9, 10 };
		System.out.println("Original array:" + Arrays.toString(arr));
		int max_value = arr[0];
		int min_value = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max_value) {
				max_value = arr[i];

			} else if (arr[i] < min_value) {
				min_value = arr[i];
			}
		}
		System.out.println("difference between min amd max value is:" + (max_value - min_value));

	}

}
