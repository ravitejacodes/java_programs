package java_pratice_notes_inheritance;

 class parent{
	void balanceAmountInTheAccount() {
		System.out.println("balance in the parent account is : 1000");
	}
 }
class child extends parent{
	@Override
	void balanceAmountInTheAccount() {
		System.out.println("balance in the child account is : 100000 ");
	}
	
}
	
	
	

public class Method_Overriding2 {
	public static void main(String[] args) {
		child c = new child();
		c.balanceAmountInTheAccount();
		
		
	}
	
}
