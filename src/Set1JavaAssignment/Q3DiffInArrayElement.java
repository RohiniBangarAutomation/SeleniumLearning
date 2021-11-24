package Set1JavaAssignment;

public class Q3DiffInArrayElement {
//	A integer array is given as input. find the difference between each element. Return the index of the largest element
	// which has the largest difference gap.
//	input: {2,3,4,2,3}
//	logic: 2-3=1,3-4=1,4-2=2,2-3=1
//	2 is the max diff between 4 and 2,return the index of 4 i.e 2
//	output:2

	public static void main(String[] args) {
		int arr[] = { 12,4,3,2,1 };
		int result = 0;
		int max = 0;
		int i, index = 0;
		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				result = arr[i] - arr[j];
				if (result > max) {
					max = result;
					index = i;
				}

			}

		}
		System.out.println("Maximum difference of elements:" + max);
		System.out.println("Index of element with high difference:" + index);
	}
}
