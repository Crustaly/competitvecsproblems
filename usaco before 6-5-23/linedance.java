import java.util.*;
import java.lang.*;
import java.io.*;
public class linedance {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    ArrayList<Integer> cows= new ArrayList<Integer>();
   String aod = "s";
   String rol = "r";
   int index=0;
    for(int i =0;i<n;i++) {
   
    		
    	aod = sc.next();


    	if(aod.equals("A")) {
    		rol=sc.next();
    		index++;

    		if(rol.equals("R")) {
    			cows.add(index);
    		}
    		else {
    			cows.add(0,index);
    		}

    }
    	else {
    		rol=sc.next();
    		String poo=sc.next();
    		int a = Integer.valueOf(poo);
    		if(rol.equals("R")) {
    			for(int p=0;p<a;p++) {
    				cows.remove(cows.size()-1);
    			}
    		}
    		
    		else {
    
    			for(int p=0;p<a;p++) {
    				cows.remove(0);
    			}
    		}
    		
        	
    	}
    	
    }

for(int i :cows)
System.out.println(i);
  }

}



