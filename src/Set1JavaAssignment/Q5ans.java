package Set1JavaAssignment;

import java.util.ArrayList;
import java.util.List;

public class Q5ans {

//	5.Given two arrayslist. retrieve the odd position elements form first input and even position elemetns from second list. 
//	put it into the new arraylist at the same positions from where they are retrieved from.
//	(consider 0th position as even position, and two lists are of same size)
//	input1:{12,1,32,3}
//	input2:{0,12,2,23}
//	output:{0,1,2,3}
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(32);
		list.add(3);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(0);
		list1.add(12);
		list1.add(2);
		list1.add(23);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
	for(int i=0;i<list.size();i++)
	{
		if(i%2==1)
		{
			list2.add(list.get(i));
			
		}
		if(i%2==0)
		{
			list2.add(list1.get(i));
			
		}
	}
	System.out.println(list2);
		
	}

}
