package demo;

class Book3{
	private int pageNumber;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int x) {
			pageNumber = x;
			if (x>0) {
				pageNumber=x;
			}
			else {
				System.out.println("invalid pagenumber");
				
			}
	}
}

public class LaunchBook3 {

	public static void main(String[] args) {
		Book3 b = new Book3();
		b.setPageNumber(100);
		System.out.println(b.getPageNumber());
		
		

	}

}
