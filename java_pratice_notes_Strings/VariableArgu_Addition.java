package java_pratice_notes_Strings;

public class VariableArgu_Addition {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	add(a,b);
	add(a,b,c);
	add(a,b,c,d);
	
}
static void add(int...a) {
	int sum=0;
	for(int x:a) {
		sum+=x;
	}
	System.out.println(sum);
}
}
