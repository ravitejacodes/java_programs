
public class Fact_recursion {
	public static void main(String[] args) {
		 int num=5;
	       int res=factorial1(num);
	        System.out.println(res);
	       
		
	
	  
   }
 static   int factorial1(int num){
      int  fact=1;
       fact= fact*factorial1(num-1);
       if(num==1){
           return 1;
       }
       return fact;
   }
  

}
