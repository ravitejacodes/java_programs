package java_pratice_notes_Strings;

import java.util.Scanner;

public class PowerofTwo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check a number is power of 2 or not");
		int num=sc.nextInt();
		
		if(num%2==0) {
			int i=2;
			int count=0;
			while(i<=num) {
				if(i==num) {
					break;
				}
				else {
				i=i*2;
				System.out.println(i);
				count++;
			}
			
		}
			
		if(i==num) {
				System.out.println("given number is a power of 2 ");
				System.out.println("2*"+count);
				
			}
			else {
				System.out.println("given number is  not a power of 2 ");
				System.out.println(count);
			}
		
		sc.close();
	
		}
	}
	}
