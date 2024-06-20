package demo;

public class DataTypeRange {

	public static void main(String[] args) {
		byte a=112;
		System.out.println(a);
		a=127;
		System.out.println(a);
		a=-128;
		System.out.println(a);
		a=12;//-129 overflow occurs where range is -128 to 127
		System.out.println();
	}

}
