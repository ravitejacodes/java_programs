package java_pratice_notes_Strings;

public class String_ComapareRef {
public static void main(String[] args) {
	String s1= new String("sindhu");
	String s2= new String("sindhu");
	String s3="supraja"; 
	String s4= "supraja";
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	System.out.println(s3.equals(s4));
	System.out.println(s3==s4);
	
}
}
