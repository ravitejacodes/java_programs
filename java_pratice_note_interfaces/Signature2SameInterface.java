package java_pratice_note_interfaces;
 interface cal1{
	 void add();
	 void sub();
	 void display();
 }
  interface cal2{
	  void mul();
	  void div();
	  void display();
  }
  
  class mycall implements cal1,cal2{
	   public void add(){
		  int a=10;
		  int b=20;
		  int c=a+b;
	  System.out.println("add cal1: "+c);
		 
	  }
	   public void sub() {
		   int a=10;
		   int b=20;
		   int c=a-b; 
		   System.out.println("sub cal1 : "+c);
	   }
	   
	   public void mul() {
		   int a=10;
		   int b=20;
		   int c=a*b; 
		   System.out.println("mul cal1 : "+c);
	   }
	   public void div() {
		   int a=10;
		   int b=20;
		   int c=a/b; 
		   System.out.println("div cal1 : "+c);
	   }
	   
	   public  void display() {
		   System.out.println("display - cal1");
	   }
  }

public class Signature2SameInterface {
 public static void main(String[] args) {
	mycall mc= new mycall();
	mc.add();
	mc.sub();
	mc.mul();
	mc.div();
	mc.display();
}
}
