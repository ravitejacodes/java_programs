package demo;
class Book {
	private int pageNumber;
	
}
public class LaunchBook2 {
   public static void main(String[] args) {
	Book b = new Book();
	b.pageNumber =100;
	System.out.println(b.pageNumber);//The field Book.pageNumber is not visible
    }								//private variables cannot be visible to access in another class 
}
