package collection_project1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
class employee{
	private int id;
	private String name;
	private int salary;
	public employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class emp {

	public static void main(String[] args) {
		int choice;
		String option;
		ArrayList <employee> empDetails= new ArrayList<>();
		do{
			
			Scanner sc=new Scanner(System.in);
			Scanner sc1=new Scanner(System.in);
			System.out.println("press 1: INSERT ");
			System.out.println("press 2: DISPLAY ");
			System.out.println("press 3: UPDATE ");
			System.out.println("press 4: SEARCH ");
			System.out.println("press 5: DELETE ");
			System.out.println("enter your choice");
			choice=sc.nextInt();	
			switch(choice) {
			case 1:
				System.out.println("enter the employee id");
				int id= sc.nextInt();
				System.out.println("enter the employee name");
				String name= sc1.nextLine();
				System.out.println("enter the employee salary");
				int salary= sc.nextInt();
				employee e1= new employee(id,name, salary);
				empDetails.add(e1);
				break;
			case 2:
				//display
				Iterator <employee>itr1=empDetails.iterator();
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}
				break;
			case 3:
				System.out.println("enter id of the employee to be updated");
				int id4=sc.nextInt();
				boolean status2=false;
				ListIterator<employee>litr=empDetails.listIterator();
				while(litr.hasNext()) {
					employee e=litr.next();
					if(id4==e.getId()) {
						System.out.println("enter the updated name");
						String name1=sc1.nextLine();
						System.out.println("enter the updated salary");
						int salary1=sc.nextInt();
						employee e2=new employee(id4,name1,salary1);
						litr.set(e2);
						status2=true;
						break;
					}
				}
				if(status2==false) {
					System.out.println("employee details not found");
				}
				break;
				//search
			case 4:
				System.out.println("enter the id of the employee to be search");
				int id2=sc.nextInt();
				boolean status=false;
				Iterator<employee>itr2=empDetails.iterator();
				while(itr2.hasNext()) {
					employee e=itr2.next();
					if(id2==e.getId()) {
						status=true;
						System.out.println(e);
						break;
					}
				}
				if(status==false) {
					System.out.println("employee details not found");
				}
				break;
				//delete
			case 5:
				System.out.println("enter the id of the employee to be deleted");
				int id3=sc.nextInt();
				boolean status1=false;
				Iterator<employee>itr3=empDetails.iterator();
				while(itr3.hasNext()) {
					employee e=itr3.next();
					if(id3==e.getId()) {
						status1=true;
						empDetails.remove(e);
						System.out.println("employee deleted successfully");
						break;
						
					}
				}
				if(status1==false) {
					System.out.println("employee details not found");
				}
				break;
				default:
			}
			System.out.println("would you like to continue(y/n)");
			option=sc.next();
		}while(option.equals("y"));
		

	}
}
