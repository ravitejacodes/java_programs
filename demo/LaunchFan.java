package demo;



class Fan{
	int noofwings;
	String color;
	int cost;
	
	void rotate() {
		System.out.println("the fan is rotating");
	}
	void control_speed() {
		System.out.println("fan speed is controlling");
	}
	void stop() {
		System.out.println("stopping fan");
		
	}
}

public class LaunchFan {
	public static void main(String[] args) {
		Fan  d = new Fan();
		d.rotate();
		d.control_speed();
		d.stop();
	}

}
