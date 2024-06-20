package overloading_numeric_type;

class Addition2{
	float add(float x ,int y) {
		System.out.println("first add method");
		return x+y;
	}
	float add(int x ,float y) {
		System.out.println("second add method");
		return x+y;
	}
	
}

public class LaunchAddition2 {

	public static void main(String[] args) {
		Addition2 ad =new Addition2();
		System.out.println(ad.add(10,20));
		
	}

}
//error-The method add(float, int) is ambiguous for the type Addition2
//Note:: whenever there are multiple  methods supporting the numeric type promotion ,
// the compiler will give an error as it results in ambiguity;
