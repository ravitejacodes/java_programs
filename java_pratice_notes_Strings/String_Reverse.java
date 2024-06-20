package java_pratice_notes_Strings;

public class String_Reverse {
	public static void main(String[] args) {
		 String s1="ramu";
	        char[] cstr=s1.toCharArray();
	        int i=0;
	        int j=cstr.length-1;
	        char temp;
	        while(i<j){
	            for( i=0;i<cstr.length-1;i++){
	                for(j=cstr.length-1;j>=0;j--){
	                    temp=cstr[i];
	                    cstr[i]=cstr[j];
	                    cstr[j]=temp;
	                }
	            }
	        }
	    String revstr=String.valueOf(cstr);
	    }
	}


