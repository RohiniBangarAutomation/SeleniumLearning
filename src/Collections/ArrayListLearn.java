package Collections;

import java.util.ArrayList;

public class ArrayListLearn {

	public static void main(String[] args) {
		
		// ArrayList is a class which is used to store object dynamically
		// In this we dont need to mention the length of arraylist,instead of this
		// its length increase when new obj is added & shrinks when obj is removed

		// arraylist never stores the primitive values
		// all values stored in arraylist are objects

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(15);
		list.add("Hello");
		list.add(true);
		list.add(10.5);
		System.out.println(list);
		list.set(2, "Class");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		//list.removeAll(list);
		System.out.println(list);
		list.clone();
		System.out.println(list);
		System.out.println(list.indexOf(10.5));
	}

}
