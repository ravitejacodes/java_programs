package Method_Overloading;

class Addition2{
	float add(int x, float y) {
		return x+y;
	}
	void  add(int x, float y) {
		return x+y;
	}
}
public class LaunchAddition2 {

	public static void main(String[] args) {
		Addition2 ad= new Addition2();
		System.out.println(ad.add(10,20.5f ));
		
	}

}
//error-Duplicate method add(int, float) in type Addition2
//Duplicate method add(int, float) in type Addition2