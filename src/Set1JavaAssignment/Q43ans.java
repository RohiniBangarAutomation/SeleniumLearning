package Set1JavaAssignment;
//43. Retrieve the odd-position digits from input integer array. Multiply them with their index and return their sum.
public class Q43ans {

	public static void main(String[] args) {
		int arr[]= {4,6,10,8,40,3};
		int sum=0;
		System.out.println("Array elements at odd position are:");
		for(int i=1;i<arr.length;i=i+2)
		{
			
			
			System.out.print(" "+arr[i]);
			sum=sum+arr[i]*i;
			
			
		}
		System.out.println(" sum is:"+sum);

	}

}
