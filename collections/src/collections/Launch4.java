package collections;

import java.util.LinkedList;

public class Launch4 {
	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> l1= new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		l1.add(2,1000);
		System.out.println(l1);

}
}