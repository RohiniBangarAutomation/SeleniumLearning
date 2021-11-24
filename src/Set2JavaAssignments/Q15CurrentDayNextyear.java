package Set2JavaAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q15CurrentDayNextyear {
	//15)What will be the DAY of current date in next year

	public static void main(String[] args) {
		Date d=new Date();

		Date d1=new Date();
		d1.setYear(d.getYear()+1);
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		String s=sdf.format(d1);
		System.out.println("DAY of current date in next year is:"+s);
	}
	

}
