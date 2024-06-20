package arrays_prgms;

public class reversearray {

		    public static void main(String[] args) {
		        int num = 9;
		        String binary = Integer.toBinaryString(num);
		        int count = 0;
		        for (char c : binary.toCharArray()) {
		            if (c == '1') {
		                count++;
		            }
		        }
		        System.out.println("The binary representation of " + num + " is " + binary + " and it contains " + count + " ones.");
		    }
		

		
	}


