package java_pratice_notes_inheritance;
final class Demo{
	void dispaly() {
		System.out.println("i'm parent class");
	}
}
	class Demob2 {//extends Demo{
		void dispaly() {
			System.out.println("i'm child  class");
		
	}
	
}


public class Final_class {
	public static void main(String[] args) {
		Demob2 x= new Demob2();
		x.dispaly();
		
	}
		
	}

//The type Demob2 cannot subclass the final class Demo

	


