package LearnJava;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);
  
    System.out.println("Enter value of a:");
    int a=s.nextInt();
 
    System.out.println("Enter value of b:");
    int b=s.nextInt();
    
    ScannerExample obj=new ScannerExample();
    obj.add(a,b);
    obj.sub(a,b);
    obj.mult(a,b);
    obj.div(a,b);
    obj.mod(a,b);
    

	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println("Addition is:"+c);
}
public void sub(int a,int b)
{
	int c=a-b;
	System.out.println("substraction is:"+c);
}
public void mult(int a,int b)
{
	int c=a*b;
	System.out.println("Multiplication is:"+c);
}
public void div(int a,int b)
{
	int c=a/b;
	System.out.println("Division is:"+c);
}
public void mod(int a,int b)
{
	int c=a%b;
	System.out.println("modulus of a and b is:"+c);
}
}
