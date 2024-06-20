package java_pratice_notes_Strings;

public class String_Intern_method {
public static void main(String[] args) {
	String s1="sai";
	String s2=s1.concat(" Sindhuri");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s2.intern());//reference..?
	System.out.println(s1);

}
}
