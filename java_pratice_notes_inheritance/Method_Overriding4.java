package java_pratice_notes_inheritance;

class Animal1{
}
class Tiger11 extends Animal1{
	
}
class Exmp11{
	Animal1 display(){
		System.out.println("parent class");
		Animal1 a= new Animal1();
		return a;
		}
}
class Exmp12 extends Exmp11{
	Tiger11 dispaly() {
		System.out.println("child class");
		Tiger11 t= new Tiger11();
		return t;
	}
}

public class Method_Overriding4 {
	public static void main(String[] args) {
		Exmp12 e=new Exmp12();
		e.dispaly();
	}
	
}
