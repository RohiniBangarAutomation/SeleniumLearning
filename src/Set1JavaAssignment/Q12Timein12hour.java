package Set1JavaAssignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*12.A time input is received as stirng. Find if the hour format is in 12 hour format. the suffix am/pm is case insensitive.
input:"09:36 am"
output:true*/

public class Q12Timein12hour {
	// 12-hour format using Regular Expression
	 
	    public static boolean isValidTime(String time)
	    {
	        String pattern
	            = "(1[012]|[1-9]):"
	              + "[0-5][0-9](\\s)"
	              + "?(?i)(am|pm)";
	 
	        // Compile the ReGex
	        Pattern compiledPattern
	            = Pattern.compile(pattern);
	 
	        // If the time is empty
	        // return false
	        if (time == null) {
	            return false;
	        }
	 
	        // Pattern class contains matcher() method
	        // to find matching between given time
	        // and regular expression.
	        Matcher m = compiledPattern.matcher(time);
	 
	        // Return if the time
	        // matched the ReGex
	        return m.matches();
	    }
	 
	   
	    public static void main(String args[])
	    {
	        String str= "13:36am";
	        System.out.println(isValidTime(str));

	    }
	}
	


