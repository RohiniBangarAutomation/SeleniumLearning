

/*9. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11 */
package Set1JavaAssignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q9DiffBetweenDates {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = f.parse("2010-01-01");
		Date d2 = f.parse("2012-05-02");
		int n = differenceInMonths(d1, d2);
		System.out.println("Difference in Months from Given date is:" + n);
	}

	private static int differenceInMonths(Date d1, Date d2) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		int diff = 0;
		if (c2.after(c1)) {
			while (c2.after(c1)) {
				c1.add(Calendar.MONTH, 1);
				if (c2.after(c1)) {
					diff++;
				}
			}
		} else if (c2.before(c1)) {
			while (c2.before(c1)) {
				c1.add(Calendar.MONTH, -1);
				if (c1.before(c2)) {
					diff--;
				}
			}
		}
		return diff;
	}

}
