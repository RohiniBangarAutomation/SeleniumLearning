package Set2JavaAssignments;

public class Q12 {
	/*
	 * 12) arraylist1={ 1,2,3,4,5} arraylist2={ 6,7,8,9,10} size of both list should
	 * be same output={6,2,8,4,10}
	 * 
	 */
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		int c[]=alternativeIndicesElements(a,b);
		System.out.println("alternative index elements:");
		for(int d:c)
			System.out.print(" "+d);
		
	}
	public static int[] alternativeIndicesElements(int[] a, int[] b){
		int c[]=new int[a.length];
		if(a.length==b.length)
			for(int i=0;i<a.length;i++)
				if(i%2==0)
					c[i]=b[i];
				else
					c[i]=a[i];
		return c;
	}
}
