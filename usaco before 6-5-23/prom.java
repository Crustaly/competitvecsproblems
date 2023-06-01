import java.util.*;
import java.lang.*;
import java.io.*;
public class prom {
	 static ArrayList<Character> ppl;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    
    int m =sc.nextInt();
   
    for(int poo=0;poo<m;poo++) {
    	ppl = new ArrayList<>();
    	  int n=sc.nextInt();
    	String s=sc.next();
    	for(int i=0;i<n;i++) {
    	ppl.add(s.charAt(i));
    	}
    	if(n%2==1) {
    		System.out.println("illegal");
    		continue;
    	}
    	boolean works = true;
    	
    	while(ppl.size()>0) {
    		int p = ppl.size();
        	removeC();

        	if(ppl.size()==p&&ppl.size()!=0) {

        		works=false;
        		break;
        	}
    	}
    	System.out.println ( works ? "legal" : "illegal");
    
    	
    	
    }
    }
    

  
static  void removeC() {
	
	for(int i =0;i<ppl.size()-1;i++) {
		
	   if(ppl.get(i)=='>'&&ppl.get(i+1)=='<') {
	
		   ppl.remove(i);
		   ppl.remove(i);
	
		   i--;
	   }
   }

}


}



