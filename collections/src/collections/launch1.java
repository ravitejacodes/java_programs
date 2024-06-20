package collections;

import java.util.ArrayList;

public class launch1 {
public static void main(String[] args) throws InterruptedException {
	ArrayList al= new ArrayList();
	al.add(10);
	al.add(20.5f);
	al.add('A');
	al.add(true);
	System.out.println(al);
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	System.out.println(al.get(2));
	System.out.println(al.get(3));
	
}
}
