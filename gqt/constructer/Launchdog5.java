package gqt.constructer;

	 class Dog11{
	  private String Name;
		private String Color;
		 private int Cost;
		 Dog11(String name,String color,int cost){
			this();
			
			this.Name=name;
		    this.Color=color;
		    this.Cost=cost;
		    
		}
		 Dog11(){
			Name="rocky";
			Color="orange";
			 Cost=10200;
		 }
		 
		void display(){
			System.out.println(Name);
			System.out.println(Color);
			System.out.println(Cost);
			
		}
	}

	public class Launchdog5 {

		public static void main(String[] args) {
			Dog11 d= new Dog11("charlie","white",15000);
			Dog11 d1= new Dog11();
			d.display();
			d1.display();

	}
	}

