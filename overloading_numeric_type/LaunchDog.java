package overloading_numeric_type;

class Dog11{
	 String name;
	 String color;
	 int cost;
	 static int count;
	 
	
	public void setData(String x, String y, int z) {
		name= x;
		color=y;
		cost =z;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
	
	class LaunchDog{
		public static void main(String[] args) {
			Dog11 d =new Dog11();
			count=count+1;
			d.setData("charile","brown",10000);
			d.display();
			System.out.println(count);
		}
	}
	
}
