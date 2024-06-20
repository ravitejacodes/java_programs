package arrays_prgms;
import java.util.Scanner;

public class class_prgms {

    public static void main(String[] args) {
        int a[][]= new int[3][4];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                System.out.println("Enter the marks of student " + j + " in class " + i);
                a[i][j]=sc.nextInt();    
            }
        }
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                System.out.println("Marks of student " + j + " in class " + i + ": " + a[i][j]);
            }
        }
        sc.close();
    }
}
