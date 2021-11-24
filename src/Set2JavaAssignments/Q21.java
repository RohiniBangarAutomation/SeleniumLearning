package Set2JavaAssignments;

public class Q21 {

	public static void main(String[] args) {
//		21) Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
//	if both the sum is equal return 1 or return -1.
		int a[]= {21,10,7,8,9,44};
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
			}
			if(i%2==1)
			{
				sum1=sum1+a[i];
			}
		}
		System.out.println("sum of even indexes:"+sum);
		System.out.println("sum of odd indexes:"+sum1);
		if(sum==sum1)
		{
		System.out.println("1");
		}
		else
			System.out.println("-1");

	}

}
