package Method_Overloading;
//method overloading  refers to having multiple methods with the same name.
//In method overloading .Nothing is overloaded.it's a "Virtual Polymorphism".
class Addition{
	int add(int x,int y) {
		System.out.println("method-1");
		return x+y;
	}
	float add(int x,float y) {
		System.out.println("method-2");
		return x+y;
	}
	float add(float x,int y) {
		System.out.println("method-3");
		return x+y;
	}
	float add(float x,float y) {
		System.out.println("method-4");
		return x+y;
	}
	int add(int x,int y, int z) {
		System.out.println("method-5");
		return x+y+z;
	}
	float add(int x,float y, float z) {
		System.out.println("method-6");
		return x+y+z;
	}
	float add(int x,int y, float z) {
		System.out.println("method-7");
		return x+y+z;
	}
	float add(int x,float y, int z) {
		System.out.println("method-8");
		return x+y+z;
	}
	float add(float x,int y, int z) {
		System.out.println("method-9");
		return x+y+z;
	}
	}

public class Launch {
	public static void main(String[] args) {
		Addition ad = new Addition();
		System.out.println(ad.add(10f, 20,90));
	}

}
