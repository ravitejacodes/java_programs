package java_pratice_notes_Strings;
class Dog{
	String name;
	String color;
	int  cost;
	static int count;
	Dog(){
		++count;
	}
	Dog(String name,String color,int cost){
		this.name=name;
		this.color=color;
		this.cost=cost;
		
	}
	
}

public class Static_Launch_Dog {
public static void main(String[] args) {
	System.out.println("no. of dog objects are : "+ Dog.count);
	Dog d1= new Dog();
	System.out.println("no. of dog objects are : "+Dog.count);
	Dog d2= new Dog();
	System.out.println("no. of dog objects are : "+Dog.count);
	Dog d3= new Dog("charile","brown",15000);
	System.out.println("no. of dog objects are : "+Dog.count);
	
}
}
