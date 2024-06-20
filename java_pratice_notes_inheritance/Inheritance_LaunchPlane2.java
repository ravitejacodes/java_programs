package java_pratice_notes_inheritance;
class Plane1{
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
class PassengerPlanepp extends Plane1{
	void fly() {
		System.out.println("passenger plane is flies at low heights");
	}
	void carrypassenger() {
		System.out.println("passenger plane carry the passengers");
	}
}
class CargoPlanecp extends Plane1{
	void fly() {
		System.out.println("cargo plane flies at medium heights");
	}
	void carrycargo() {
		System.out.println("cargo plane carry the goods");
	}
}
class FighterPlanefp extends Plane1{
	void fly(){
		System.out.println("fighter plane flies at high heights");
	}
	void carryarms() {
		System.out.println("fighterplane carry the arms and ammunitions");
	}
}
public class Inheritance_LaunchPlane2 {
	public static void main(String[] args) {
		PassengerPlanepp pp= new PassengerPlanepp();
		CargoPlanecp cp= new CargoPlanecp();
		FighterPlanefp fp= new FighterPlanefp();
		Plane1 ref;
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		((PassengerPlanepp)(ref)).carrypassenger();
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		((CargoPlanecp)(ref)).carrycargo();
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
	((FighterPlanefp)(ref)).carryarms();
		}

}
//in the above program because of inheritance we have reused a part of code multiple times. 
