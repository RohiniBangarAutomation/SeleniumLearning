package Set1JavaAssignment;

public class Q29RemoveArrayEle {

	/*
	 * 29.An array of integers is given.The given element is removed new array is
	 * returned. input1:{10,10,20,30,76} output: {20,30,76}(10 is asked to remove)
	 */

	public static void main(String[] args) {

		int arr[] = { 10, 10, 20, 30, 76 };
		int a = 10;
		for (int i = 0; i < arr.length; i++) {

			if (!(arr[i] == a)) {
				
				System.out.println(" " + arr[i]);
			}

		}

	}
}
