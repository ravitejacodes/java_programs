package java_pratice_notes_inheritance;



abstract class Planee{
	 abstract	void takeoff();
	 abstract	void land();
	 abstract	void fly();
	
}
class PassengerPlanee extends Planee{
	void takeoff(){
		System.out.println("Passengerplane is taking off");
	}
	void land() {
		System.out.println("Passengerplane is landing");
	}
	
	void fly() {
		System.out.println("passenger plane is flies at low heights");
	}
	void carrypassenger() {
		System.out.println("passenger plane carry the passengers");
	}
}
class CargoPlanee extends Planee{
	void takeoff(){
		System.out.println("Cargoplane is taking off");
	}
	void land() {
		System.out.println("Cargoplane is landing");
	}
	
	void fly() {
		System.out.println("cargo plane flies at medium heights");
	}
	void carrycargo() {
		System.out.println("cargo plane carry the goods");
	}
}
class FighterPlanee extends Planee{
	void takeoff(){
		System.out.println("Fighterplane is taking off");
	}
	void land() {
		System.out.println("Fighterplane is landing");
	}
	
	void fly(){
		System.out.println("fighter plane flies at high heights");
	}
	void carryarms() {
		System.out.println("fighterplane carry the arms and ammunitions");
	}
}
class Airport{
	void permit(Planee ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
		
	}
}


public class Abstract_LaunchPlane {
	public static void main(String[] args) {
		PassengerPlanee pp = new PassengerPlanee();
		CargoPlanee cp= new CargoPlanee();
		FighterPlanee fp= new FighterPlanee();
		Airport a= new Airport();
		a.permit(pp);
		a.permit(cp);
		a.permit(fp);
		
	}

}
