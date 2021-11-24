package Set1JavaAssignment;

public class Q35ValidateIPAddress {
	/*
	 * 35.validate the ip address in the form a.b.c.d where a,b,c,d must be between
	 * 0and 255 if validated return 1 else return 2
	 */

	public static void main(String[] args) {
		int a = 10, b = 267, c = 23, d = 32;
		String a1 = "", b1 = "", c1 = "", d1 = "";
		if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
			a1 = Integer.toString(a);
			b1 = Integer.toString(b);
			c1 = Integer.toString(c);
			d1 = Integer.toString(d);
			String result = a1 + "." + b1 + "." + c1 + "." + d1;
			System.out.println("Valid IP address:" + result);

			System.out.println("1");
		} else {
			System.out.println("Ip address is not valid");
			System.out.println("-1");
		}

	}

}
