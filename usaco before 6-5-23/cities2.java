import java.util.*;
import java.lang.*;
import java.io.*;
public class cities2{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    
    int n =sc.nextInt();
    Map<String, Long> input = new HashMap<>();
    for(int i =0;i<n;i++) {
    	String a=sc.next();
    	String b=sc.next();
    	String key =a.substring(0,2)+b;
    	if(key!=b+b) {
    		if(!input.containsKey(key)) {
    			input.put(key, 0L);
    		}
    		input.put(key,input.get(key)+1);
    	}
    }
    	
    	long ans=0;
    	for(String i: input.keySet()) {

			String oppisite = i.substring(2) + i.substring(0, 2);
			if(input.containsKey(oppisite)) {
				
				ans+=input.get(i)*input.get(oppisite);
			}
    	}
    
    



    System.out.println(ans/2);


  }


}



