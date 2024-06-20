package gqt.constructer;

 class Dog{
  private String Name;
	private String Color;
	 private int Cost;
	 Dog(String name,String color,int cost){
		Name=name;
	    Color=color;
	    Cost=cost;
	    
	}
	void display(){
		System.out.println(Name);
		System.out.println(Color);
		System.out.println(Cost);
		
	}
}

public class LaunchDog {

	public static void main(String[] args) {
		Dog d= new Dog("charlie","white",15000);
		d.display();
	}

}
