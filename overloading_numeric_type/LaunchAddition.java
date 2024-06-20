package overloading_numeric_type;
class Addition{
	float add(float x ,int y) {
		System.out.println("first add method");
		return x+y;
	}
	double add(float x ,double y) {
		System.out.println("second add method");
		return x+y;
	}
	
}

public class LaunchAddition {

	public static void main(String[] args) {
		Addition ad =new Addition();
		System.out.println(ad.add(10,20));
		
	}

}
