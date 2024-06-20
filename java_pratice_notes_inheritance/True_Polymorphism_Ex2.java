package java_pratice_notes_inheritance;
  class animals{
	 void eat() {
		 System.out.println("animal is eating");
	 }
	 void food() {
		 System.out.println("animals eat both plants& flesh");
	 }
	 void sleep() {
		 System.out.println("animal is sleeping");
	 }
	 
}
  class Tiger extends animals{
	  void eat() {
			 System.out.println("tiger is eating");
		 }
		 void food() {
			 System.out.println("tiger eat  flesh");
		 }
		 void sleep() {
			 System.out.println("tiger is sleeping");
		 }

	  
	  
  }
  class Deer extends animals{
	  void eat() {
			 System.out.println("Deer is eating");
		 }
		 void food() {
			 System.out.println("Deer eat both  plants& flesh");
		 }
		 void sleep() {
			 System.out.println("Deer is sleeping");
		 }

	  
  }
  class Monkey extends animals{
	  void eat() {
			 System.out.println("Monkey is eating");
		 }
		 void food() {
			 System.out.println("Monkey eats only veg");
		 }
		 void sleep() {
			 System.out.println("Monkey is sleeping");
		 }
	  
  }
  class WildAnimals{
	  void habits(animals ref ) {
		 ref.eat();
		 ref.food();
		 ref.sleep();
		 }
  }
  
  
public class True_Polymorphism_Ex2 {
	public static void main(String[] args) {
		Tiger t= new Tiger();
		Deer d= new Deer();
		Monkey m= new Monkey();
		
		WildAnimals wa=new WildAnimals();
		wa.habits(t);
		wa.habits(d);
		wa.habits(m);
		
	}

}
