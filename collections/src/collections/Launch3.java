package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Launch3 {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.add(2,100);
		System.out.println(al);
		ArrayList<Integer> al1= new ArrayList();
		al1.add(11);
		al1.add(22);
		al1.add(33);
		al1.add(44);
		al1.add(55);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
		al.addAll(4,al1);
		System.out.println(al);
	}
}
