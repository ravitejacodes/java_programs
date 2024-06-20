package BillingHotel;


	import java.util.ArrayList;
import java.util.Scanner;
	class Bill{
	int itemId;
	int quantity;
	String itemName;
	int itemPrice;
	int subTotal;
	public Bill(int itemId,int quantity, String itemName, int itemPrice, int subTotal ) {
		this.itemId=itemId;
		this. quantity=quantity;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.subTotal=subTotal;
	}
	}

	public class BillingHotel {
		
		public static void main(String[] args) {
			String name= null;
			int itemId=0;
			String itemName= null;
			int quantity=0;
			String response = null;
			
			int itemPrice=0;
			int subTotal=0;
			int yes;
			
		System.out.println("welcome to hotel asians!");
		Scanner sc = new Scanner(System.in);
		System.out.println("dear customer,plese enter ur name");
		name = sc.nextLine();
		
		System.out.println("dear "+name+" below is the menu ");
		do {
		System.out.println("_______________________________________");
		System.out.println("Item ID     Item Name    Item price ");
		System.out.println("_______________________________________");
	    System.out.println("1            water         10"  );
	    System.out.println("2            pepsi         30"  );
	    System.out.println("3            pizza         50"  );
	    System.out.println("4            fries         60"  );
	    System.out.println("5            burger         75"  );
	    System.out.println("_______________________________________");
	    
	    
		System.out.println("enter the Item ID");
		while(response == "yes") {
		
		}
		
			switch(itemId) {
			case 1:
				itemName="water";
				itemPrice=10;
				subTotal=quantity*itemPrice;
				break;
			case 2:
				itemName="water";
				itemPrice=10;
				subTotal=quantity*itemPrice;
				break;
			case 3:
				itemName="water";
				itemPrice=10;
				subTotal=quantity*itemPrice;
			case 4:
				itemName="water";
				itemPrice=10;
				subTotal=quantity*itemPrice;
				break;
			case 5:
				itemName="water";
				itemPrice=10;
				subTotal=quantity*itemPrice;
				break;
			default:
				System.out.println("plss enter valid item id");
				break;
			}
			
			System.out.println("item name "+itemName+ "item price"+itemPrice+" qunatity "+quantity+"subtotal "+subTotal);
			ArrayList<Bill> newItem = new ArrayList<Bill>();
			
			Bill b = new Bill(itemId,quantity,itemName,itemPrice,subTotal);
			
			newItem.add(b);
			 System.out.println("do you want to order more (yes/no)"); 
			   response = sc.nextLine();
		
		}
		while(response.equals("yes")) ;
		
		
		
		}
	
	
	}
	