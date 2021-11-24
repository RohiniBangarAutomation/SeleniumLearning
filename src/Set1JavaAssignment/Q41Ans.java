package Set1JavaAssignment;

import java.util.Scanner;

public class Q41Ans {


//	41.	input1={1,2,3}
//		input2={3,4,5}
//		input3;+(union)
//		output:inp1+inp2
//		input1:{1,2,3,4,5}
//		input 2:{2,3,4,5}
//		input3=*(intersection)
//		output:inp1*inp2
//		INPUT1:{1,2,3,4,5}
//		INPUT2:{3,6,7,8,9}
//		INPUT3:-(MINUS)
//		output:inp1-inp2

		public static void main(String[] args) 
		{
			int Size, i;
			Scanner sc = new Scanner(System.in);
		 
			System.out.print(" Please Enter Number of elements in an array : ");
			Size = sc.nextInt();	
			
			int [] a = new int[Size];
			int [] b = new int[Size];
			int [] Addition = new int[Size];
			int [] Subtraction = new int[Size];
			int [] Multiplication = new int[Size];
			int [] Division = new int[Size];
			float [] Module = new float[Size];
			
			System.out.print(" Please Enter " + Size + " elements of an Array  : ");
			for (i = 0; i < Size; i++)
			{
				a[i] = sc.nextInt();
			}   
			System.out.print(" Please Enter " + Size + " elements of an Array  : ");
			for (i = 0; i < Size; i++)
			{
				b[i] = sc.nextInt();
			}  
			for(i = 0; i < Size; i++)
			{
				Addition [i]= a[i] + b[i];
			    Subtraction [i]= a[i] - b[i];
			    Multiplication [i]= a[i] * b[i];
			    Division [i] = a[i] / b[i];
			    Module [i] = a[i] % b[i]; 
			}
			System.out.println("\nAdd\t Sub\t Multi\t Div\t Mod");
			for (i = 0; i < Size; i++)
			{
				System.out.print(Addition[i] + " \t ");
				System.out.print(Subtraction[i] + " \t ");
				System.out.print(Multiplication[i] + " \t ");
				System.out.print(Division[i] + " \t ");
			    System.out.print(Module[i]+ " \t ");
			    System.out.print("\n");
			}
		}
	
}
