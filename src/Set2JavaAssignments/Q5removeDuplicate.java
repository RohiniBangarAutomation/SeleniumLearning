package Set2JavaAssignments;

public class Q5removeDuplicate {

	public static void main(String[] args) {
//		5)      Given integer array
//	input :int[] arr={2,3,5,4,1,6,7,7,9};
//
//Remove the duplicate elements and print sum of even numbers in the array..
//print -1 if arr contains only odd numbers

		int arr[] = { 2, 3, 5, 4, 1, 6, 7, 7, 9 };
		int flag = 0, i;
		int sum = 0, flag1 = 0;
		System.out.println("Array Elements:");
		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.print(" " + arr[i]);
			}

			flag = 0;

			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
			if (arr[i] % 2 == 1) {
				flag1 = 1;

			}
		}
		if (flag1 == 0) {
			System.out.println("All numbers are even");
		}

		System.out.println(" sum:" + sum);
	}

}
