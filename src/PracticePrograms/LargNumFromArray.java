package PracticePrograms;

public class LargNumFromArray {

	public static void main(String[] args) {
		int arr[]= {4,6,20,12,15};
		
		int val=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>val)
				val=arr[i];
		}
		System.out.println("Largest number:"+val);

	}

}
