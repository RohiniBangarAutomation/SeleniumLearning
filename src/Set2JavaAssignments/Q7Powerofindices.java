package Set2JavaAssignments;

public class Q7Powerofindices {
	// 7)Given array of intergers,print the sum of elements sqaring/cubing as per
	// the power of their indices.
//answer=  sum=sum+a[i]^i;
	// eg:input:{2,3,5}
//	Output:29

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			
			sum += (Math.pow(arr[i], i));

		System.out.println("Sum of power of induces:" + sum);
	}

}
