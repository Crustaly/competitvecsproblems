import java.util.*;
import java.lang.*;
import java.io.*;
public class arrayDivision {
static long m;
static long [] nums;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

  int n =sc.nextInt();
     m=sc.nextInt();
    
     nums = new long[n];
    long l=0;
    long h=0;
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextLong();
    	h+=nums[i];
    }
    
 
    while(l<h) {
    	long mid =(h+l)/2;
    	if(works(mid)) {
    		h=mid;
    	}
    	else {
    	l=mid+1;
    	}
    	}
  
System.out.println(l);

  }
  static boolean works (long k) {
	  int use=0;
	  for(long i :nums) {
		  if(i>k) {
			  return false;
		  }
		  
	  }
	  long curr =0;
	  for(long i :nums) {
		  if(curr+i<=k) {
			  curr+=i;
		  }
		  else {
			  curr=i;
			  use++;
		  }
	  }
	  
	  return use<m;
  }

}







