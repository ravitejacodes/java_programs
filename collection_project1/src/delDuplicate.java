



import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class delDuplicate  {

	public static void main(String[] args) {
		String x="ENGINEERING";
		char y[]=x.toCharArray();
		int size=y.length;
		int i=0;
		Map<Character,Integer>hmap=new HashMap<>();
		while(i!=size) {
			if(hmap.containsKey(y[i])==false) {
				hmap.put(y[i], 1);
			}
			else {
				int oldval=hmap.get(y[i]);
				int newval=oldval+1;
				hmap.put(y[i], newval);
			}
			i++;
		}
		int maxval=0;
		char maxkey=' ';
		Set<Map.Entry<Character,Integer>> entryset=hmap.entrySet();
		for(Map.Entry<Character,Integer>data:entryset) {
			if(data.getValue()>maxval) {
				map.remove(maxval);
				map.remove(maxkey);			
			}
		}
        System.out.print(maxkey+" ");
        System.out.print(maxval+" ");
	}
	

}
