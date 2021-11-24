package LearnJava;

public class Array {

	public static void main(String[] args) {
		//AccessModifier ac=new AccessModifier();
		
		int[] i=new int[3];
		
		i[0]=12;
		i[1]=123;
		i[2]=234;
		
		System.out.println(i.length);
		System.out.println(i[1]);

		for(int z=0;z<i.length;z++)
        {
			System.out.println(" "+i[z]);
        }
	}

}
