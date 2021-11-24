package Test;

public class Test {

	public static void main(String[] args) {
		Bathroom b=new Bathroom();
		b.setMirrors(3);
		House h=new House(b);
		h.color();
		System.out.println(h.b.getMirrors());

	}

}
