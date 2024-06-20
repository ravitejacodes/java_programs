package java_pratice_notes_Strings;

public class Mutable_Strings_prgm2 {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("sindhuri");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.append(" is a good girl");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
	}

}
