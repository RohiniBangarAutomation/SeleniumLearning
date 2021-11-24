package Set2JavaAssignments;

/*11)  input={"1","2","3","4"}
output=10
ie,if string elements are nos,add it.
input={"a","b"}
output=-1;
*/
public class Q11addstringElements {

	public static void main(String[] args) {
		String arr[] = { "5", "8", "9", "10" };
		int sum = 0;
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			for (int j = 0; j < s1.length(); j++) {
				char c = s1.charAt(j);
				if (Character.isDigit(c))
					b = true;
				else {
					b = false;
					break;
				}
			}
			if (b == true) {
				sum = sum + Integer.parseInt(s1);
			}
			else {
				sum	 = -1;
				System.out.println("String elements are not numbers");
				break;
			}
			
				

			}
		System.out.println("sum of elements:"+sum);

		}
	
	}
