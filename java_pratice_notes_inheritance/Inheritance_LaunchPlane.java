package java_pratice_notes_inheritance;
class Plane{
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
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("passenger plane is flies at low heights");
	}
	void carrypassenger() {
		System.out.println("passenger plane carry the passengers");
	}
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("cargo plane flies at medium heights");
	}
	void carrycargo() {
		System.out.println("cargo plane carry the goods");
	}
}
class FighterPlane extends Plane{
	void fly(){
		System.out.println("fighter plane flies at high heights");
	}
	void carryarms() {
		System.out.println("fighterplane carry the arms and ammunitions");
	}
}
public class Inheritance_LaunchPlane {
	public static void main(String[] args) {
		PassengerPlane pp= new PassengerPlane();
		CargoPlane cp= new CargoPlane();
		FighterPlane fp= new FighterPlane();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carrypassenger();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carrycargo();
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryarms();
	}

}
//in the above program because of inheritance we have reused a part of code multiple times. 
