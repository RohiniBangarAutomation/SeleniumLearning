package Set1JavaAssignment;

import java.util.HashMap;
import java.util.Set;

public class Q16hashmapexam {

	public static void main(String[] args) {
//		16. HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
//		input:{12:90,35:90,33:90,56:88}
//		output:avg of(90+90) =90
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(12, 90);
		map.put(35, 90);
		map.put(33, 90);
		map.put(56, 88);
		map.put(57, 88);
		Set<Integer> var = map.keySet();
		int sum = 0,avg=0;
		for(int odd:var)
		{
			if(odd%2==1)
			{
				sum=sum+odd;
				avg=sum/3;
			}
		}
		System.out.println("sum:"+sum);
		System.out.println(avg);

	}

}
