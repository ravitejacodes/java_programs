package demo;

class dog {
	String name;
	String colour;
	int Cost;
	void bark() {
		System.out.println("barking");
	}
	void sleep() {
		System.out.println("sleeping");
	}
	void eat() {
		System.out.println("eating");
	}
}
 
 public class LaunchDog
 {
	 public static void main(String[] args) {
		dog d= new dog();
		d.bark();
		d.sleep();
		d.eat();
	}
 }
