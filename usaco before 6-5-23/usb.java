import java.util.*;
import java.lang.*;
import java.io.*;
public class usb{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c= sc.nextInt();
    int total= a+b+c;
    
    
    int n = sc.nextInt();
    //arraylist of usb and ps/2
    //run while loop for usb size, if empty and still usb, subtract
    //also if out of 
    List<Integer> usb = new ArrayList<>();
    List<Integer> ps = new ArrayList<>();
    for(int i =0;i<n;i++) {
    	int cost =sc.nextInt();
    	String type = sc.next();
    	if(type.equals("USB")) {
    		usb.add(cost);
    	}
    	else{
    		ps.add(cost);
    	}
    }
    Collections.sort(ps);
    Collections.sort(usb);
    
    long cost = 0;
    for(int i =0;i<a;i++) {
    	
    	if(usb.isEmpty()) {
    		
    		total-=a-i;
    		break;
    	}else {
   
    	cost+=usb.get(0);
    	usb.remove(0);
    	}
    	
    }
    for(int i =0;i<b;i++) {
    	if(ps.isEmpty()) {
    	
    		total-=b-i;
    		break;
    	}else {
    		
    	cost+=ps.get(0);
    	ps.remove(0);
    	}
    }

    ps.addAll(usb);
   Collections.sort(ps);
    for(int i =0;i<c;i++) {
    
    	if(ps.isEmpty()) {
    		
    		total-=c-i;
    		break;
    	}
    	else {
        	cost+=ps.get(0);
        	ps.remove(0);
        	}
    	
    }
    
  

System.out.println(total+" "+cost);
  


}
}



