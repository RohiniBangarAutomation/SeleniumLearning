package Set2JavaAssignments;

/*10) Given an array find the largest 'span'(span is the number of elements between two same digits)
    find their sum.
	a[]={1,4,2,1,4,1,5}
	Largest span=5*/

public class Q10MaxSpan {

	public static void main(String[] args) {
		int a[] = { 1, 4, 2, 1, 4, 1, 5 };
		System.out.println("sum of largest span elements:" + largestSpan(a));
	}

	public static int largestSpan(int[] a) {
		int max = 0;
		int a1 = 0;
		int a2 = 0;
		int n = 0;
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++)
				if (a[i] == a[j])
					n = j;
			if (n - i > max) {
				max = n - i;
				a1 = i;
				a2 = n;
			}
		}
		System.out.println("largest span:" + (a2 - a1));
		for (int i = a1; i <= a2; i++)
			sum = sum + a[i];
		return (sum);
	}

}
