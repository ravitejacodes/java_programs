package java_pratice_notes_inheritance;
class Animal{
}
class Tiger1 extends Animal{
	
}
class Exmps1{
	Animal display(){
		System.out.println("parent class");
		Animal a= new Animal();
		return a;
		}
}
class Exmps2 extends Exmps1{
	Tiger1 dispaly() {
		System.out.println("child class");
		Tiger1 t= new Tiger1();
		return t;
	}
}

public class Method_Overriding {
	public static void main(String[] args) {
		Exmps2 e=new Exmps2();
		e.dispaly();
	}
	
}
