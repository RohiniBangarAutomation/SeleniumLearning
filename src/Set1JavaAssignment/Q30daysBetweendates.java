package Set1JavaAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//30. Find the number of days between two input dates.

public class Q30daysBetweendates {
	 public static void main(String[] args) {        
	        String date1 = "23-04-2021";
	        String date2 = "24-06-2021";
	        System.out.println("Days: " +daysBetweenDates(date1, date2));      
	    }
	    
	    public static int daysBetweenDates(String date1, String date2) {
	        int diffDays = 0;
	        try {
	            SimpleDateFormat dates = new SimpleDateFormat("dd-MM-yyyy");
	            Date d1 = dates.parse(date1);
	            Date d2= dates.parse(date2);
	            long diff = d1.getTime() - d2.getTime();
	            diffDays = (int) (diff / (24 * 60 * 60 * 1000));            
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        return Math.abs(diffDays);
	    }
	}

