package Set1JavaAssignment;

import java.util.Scanner;

/*45. Retrieve the non-prime numbers within the range of a given input. Add-up the non-prime
 *  numbers and return the result.
 */


public class Q45nonPrimeno {

	public static void main(String[] args) {

		int count;
		System.out.print("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 1,sum=0;
		System.out.println("non-Prime numbers between 1 to " + n + " are ");
		for (int i = 1; i < n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				//System.out.print(i + "  ");
				flag=1;
				//break;
			}
			else if(!(count == 2))
			{
				System.out.println(" "+i);
				sum=sum+i;
			}

		}
System.out.println("sum:"+sum);
	}

}
