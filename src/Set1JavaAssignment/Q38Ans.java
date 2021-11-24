package Set1JavaAssignment;

public class Q38Ans {

	public static void main(String[] args) {
		//38. Retrieve the max from array which is in a odd-index
		int max=0;
		int arr[]= {12,23,56,23,45,64,343};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			}
		}
		System.out.println("Max value at odd position:"+max);

	}

}
