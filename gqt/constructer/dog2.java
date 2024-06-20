 package gqt.constructer;

 class Dog1{
 private String Name;
	private String Color;
	 private int Cost;
	

	void display(){
		System.out.println(Name);
		System.out.println(Color);
		System.out.println(Cost);
		
	}
}

public class dog2 {

	public static void main(String[] args) {
		Dog1 d= new Dog1();
		d.display();
	}

}

/* if the programmer has not included any constructer in a class,
 * then java complier will include a default constructer[zero parametrized] 
 */

