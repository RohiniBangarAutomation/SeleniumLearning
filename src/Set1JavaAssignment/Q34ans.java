package Set1JavaAssignment;

public class Q34ans {

	public static void main(String[] args) {
		//find the average of the maximum and minimum number in an integer array
		int arr[]= {12,34,54,6,26,34};
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("max\t"+max);
		System.out.println("min\t"+min);
		float avg=(max+min)/2;
		System.out.println("average:"+avg);

	}

}
