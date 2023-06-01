import java.util.*;
import java.lang.*;
import java.io.*;
public class popo {
static long n;
  public static void main(String[] args) throws IOException{
	    //Scanner sc = new Scanner(new File("moobuzz.in"));
	  Scanner sc = new Scanner(System.in);
	    FileWriter file = new FileWriter("moobuzz.out");
	    BufferedWriter output = new BufferedWriter(file);
	    n =sc.nextLong();
	    long lo= 0;
	    long hi = 100000000000000L;
	    
	    while(lo<hi) {
	    	long mid = (lo+hi)/2;
	    	if(check(mid)) {
	    		hi=mid;
	    	}
	    	else {
	    		lo=mid+1;
	    	}
	    }
   
    System.out.println(lo);
    output.write(String.valueOf(lo));

    output.close();
  }
  static boolean check(long k) {
	  return (k-k/3-k/5+k/15>=n);
  }
}