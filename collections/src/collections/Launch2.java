package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Launch2 {
	public static void main(String[] args) throws InterruptedException {
		ArrayList <Integer>   al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("for- loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("for-each");
		for(int x:al) {
			System.out.println(x);
		}
		System.out.println("iterator-loop");
		Iterator <Integer> itr1=al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("list iterator-loop");
		ListIterator <Integer> litr1=al.listIterator();
		
		while(litr1.hasNext()) {
			System.out.println(litr1.next());
		}
		System.out.println("list iterator-reverse");
		ListIterator <Integer> litr2=al.listIterator(al.size());
		while(litr2.hasPrevious()) {
			System.out.println(litr2.previous());
		}
	}

}
