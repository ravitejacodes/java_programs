package java_pratice_notes_Strings;

public class Mutable_Strings_prgm1 {
	public static void main(String[] args) {
		String s1= new String("sindhu");
		String s2=new String("sindhu");
		System.out.println(s1.equals(s2));//compares the values
		System.out.println(s1==s2);//compares the references
		StringBuffer sb1= new StringBuffer("sindhu");
		StringBuffer sb2= new StringBuffer("sindhu");
		System.out.println(sb1.equals(sb2));//compares the references
		System.out.println(sb1==sb2);//compares the references
		//String class overwrite the equals() method[equals method compares the references]to compare only the values of String;
		//StringBuffer class does not overwrite the equals() method so, it compares the references; 
		
		System.out.println(sb1.toString().equals(sb2.toString()));//to compare values of StringBuffer we  make use of toString() method 
	}

}
