import java.util.*;
import java.lang.*;
import java.io.*;
public class soulmate{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int j=0;j<n;j++) {
    	long a =sc.nextLong();
    	long b =sc.nextLong();
    	
    	System.out.println(solve(a,b));
    }


  }
  static long solve( long a, long b) {
	  if(a==b) {
		  return 0;
	  }
	  
	  int extra=0;
  
	 	if(a>b) {
	 		if(a%2==1) {
	 			a++;
	 			extra++;
	 		}
	 		return solve(a/2,b)+1 +extra;
	 	}
	 	//a<b
    	else if(a<=b/2) {
    		if(b%2==1) {
	 			b--;
	 			extra++;
	 		}
	 		return solve(a, b/2)+1 +extra;
    	}
    	else {
    		long d = b-a;
    		if(d==3) {
    			  System.out.println(a+" "+b);
    		  }
    		if(a%2==1) {
    			extra++;
    			a++;
    		}
    		if(b%2==1) {
    			extra++;
    			b--;
    		}
    		long sss = solve(a/2, b/2)+2+extra;
 
    		if(d<sss) {
    			System.out.println(d);
    			return d;
    		}
    		else {
    			return sss;
    		}
    	
    	}
    	
  }
}