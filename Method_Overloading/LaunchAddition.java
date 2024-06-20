package Method_Overloading;
/* In method overloading , the conflict in the method()called,will be resloved with the help of
 * 1. no. of . inputs
 * 2. the type of data
 * 3. order of the Datatype
 * 
 * In method_overloading,multiple methods  can have the same name, same no. of inputs,same datatype
 * however,the order of the input should be different
 * 
 * A return type has no rule to play in method_overloading (i.e if there are 2 methods with same name,
 * same no. of inputs,same datatypes and the same order with different return type then also
 * it is not accepted  by the compiler .this is because a Return type has no rule to play in method_overloading.
 *
 */
//#program 
class Addition{
	float add(int x, float y) {
		return x+y;
	}
	int add(int x, float y) {
		
		return x+y;
	}
}
public class LaunchAddition {

	public static void main(String[] args) {
		Addition ad =new Addition();
		System.out.println(ad.add(10,20f));

	}

}
//error- Duplicate method add(int, float) in type Addition
//Duplicate method add(int, float) in type Addition
