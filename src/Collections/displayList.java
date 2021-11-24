package Collections;

import java.util.ArrayList;

public class displayList {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(15);
		list.add("Hello");
		list.add(true);
		list.add(10.5);
		System.out.println(list.indexOf(true));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//for (Object obj : list) {
			//System.out.println(obj);

		//}
	}

}
