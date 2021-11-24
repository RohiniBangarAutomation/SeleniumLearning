package Set2JavaAssignments;

/*2) input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2*/

public class Q2Rajdev {
	public static void main(String[] args) {
		String search = "GeniusRajkumarDev";
		String s1 = "Raj";
		String s2 = "Dev";
		int n = searchString(search, s1, s2);
		if (n == 1)
			System.out.println(s1 + " s1 comes before s2 " + s2);
		else
			System.out.println(s2 + " s2 comes before s1 " + s1);
	}

	public static int searchString(String search, String s1, String s2) {
		int n = 0;
		int n1 = search.indexOf(s1);
		System.out.println("indexOf s1:" + search.indexOf(s1));
		int n2 = search.indexOf(s2);
		System.out.println("indexOf s2:" + search.indexOf(s2));
		if (n1 < n2)
			n = 1;
		else
			n = 2;

		return n;
	}

}
