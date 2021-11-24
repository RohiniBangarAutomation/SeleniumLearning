package Set1JavaAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10ans {

//		10. arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student
	// who has scored max marks(total of three)
//		input:{"arun#12#12#12","deepak#13#12#12"}
//		output:deepak
	public static void main(String args[]) {
		HashMap<Integer, List<String>> Student = new HashMap<Integer, List<String>>();
		List<String> student1 = new ArrayList<String>();
		List<String> student2 = new ArrayList<String>();

		List<String> eachValue = new ArrayList<String>();
		String name = "";
		int temp = 0;
		int total = 0;
		student1.add("arun");
		student1.add("12");
		student1.add("12");
		student1.add("12");

		student2.add("deepak");
		student2.add("13");
		student2.add("12");
		student2.add("12");

		Student.put(1, student1);
		Student.put(2, student2);

		for (Map.Entry m : Student.entrySet()) {// key and its value combined into one class
			eachValue = (List<String>) m.getValue();
			total = Integer.parseInt(eachValue.get(1)) + Integer.parseInt(eachValue.get(2))
					+ Integer.parseInt(eachValue.get(3));
			if (total > temp) {
				temp = total;
				name = eachValue.get(0);
			}
		}
		System.out.println("Name of The Student is : " + name + " and highest Marks  is : " + total);
	}
}
