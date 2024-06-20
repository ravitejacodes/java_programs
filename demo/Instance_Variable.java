package demo;
 class Demo{
	 
	 int a;
	 float b;
	 String c;
	 boolean d;
 }

public class Instance_Variable {
	public static void main(String[] args) {
		Demo obj = new Demo();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	
		// if we don't intalize instance variables "default" values will be updated automatically!
	}

}
