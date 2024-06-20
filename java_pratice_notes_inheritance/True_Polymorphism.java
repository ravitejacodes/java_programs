package java_pratice_notes_inheritance;
class Planes{
	void takeoff(){
		System.out.println("plane is taking off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class PassengerPlanes extends Planes{
	void fly() {
		System.out.println("passenger plane is flies at low heights");
	}
	
}
class CargoPlanes extends Planes{
	void fly() {
		System.out.println("cargo plane flies at medium heights");
	}
	
}
class FighterPlanes extends Planes{
	void fly(){
		System.out.println("fighter plane flies at high heights");
	}
}
class Airport1{
	void permit(Planes ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
		
	}
}

public class True_Polymorphism {
	public static void main(String[] args) {
		PassengerPlanes pp = new PassengerPlanes();
		CargoPlanes cp= new CargoPlanes();
		FighterPlanes fp= new FighterPlanes();
		Airport1 a= new Airport1();
		a.permit(pp);
		a.permit(cp);
		a.permit(fp);
		
	}
}


// in the above program we have used polymorphism where a parent type reference is pointing to the children objects
// these polymorphism is called true polymorphism & it is also called as run-time polymorphism
//polymorphism prompts code flexibility& loose coupling
//parent reference to child object is called loose coupling whereas child reference to parent object is tight coupling ...[incomplete sentence]
