import java.util.Scanner;

public class Triangle {
	 public static void main(String[] args) {
		float base ;
		float height;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base of the triangle");
		base= sc.nextFloat();
		System.out.println(" enter the height of the triangle");
		height=sc.nextFloat();
		float area =areaofTriangle( base, height) ;
		System.out.println(" area of the triangle is :"+area);
	}

	static float areaofTriangle(float base, float height) {
		float area=0.5f*base*height;
		return area;
	}
 	 
 }
 
