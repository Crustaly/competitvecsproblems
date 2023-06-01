import java.util.*;
import java.lang.*;
import java.io.*;
public class soulmat {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    for(int i =0;i<n;i++) {
    	long a = sc.nextLong();
    	long b = sc.nextLong();
 
    	System.out.println(solve(a,b));
    	
    }
   }
  static long solve(long a, long b) {
	  if(a==b) {
		  return 0;
	  }
	  else if(a>b) {
		  if(a%2==1) {
			  a+=1;
			  return solve(a/2, b)+2;
		  }
		  else {
			  return solve(a/2, b)+1;
		  }
	  }
	  else if(a>b/2){
		  if(a%2==1) {
			  a+=1;
			  return solve(a*2, b)+2;
		  }
		  else {
			  return solve(a*2, b)+1;
		  }
	  }
  }
}