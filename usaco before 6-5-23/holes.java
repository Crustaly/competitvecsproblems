
import java.util.*;
import java.lang.*;
import java.io.*;
public class holes {
static int n,b,ans;
static int [] h;
static boolean [] bin;


  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
    b=sc.nextInt();
    ans = Integer.MAX_VALUE;
    h=new int [n];
    for(int i =0;i<n;i++) {
    	h[i]=sc.nextInt();
    }
     bin=new boolean [n];
     recursion(0);
System.out.println(ans);


  }
  static void recursion(int i) {
	  if(i==n) {
		  int curr=0;
		 for(int k=0;k<n;k++) {
			 if(bin[k]==true) {
				 curr+=h[k];
		
			 }
			 
		 }
		 if(curr>=b) {
			 ans=Math.min(ans,curr-b);
		 }
		
		  return;
		
		
	  }
	  bin[i]=true;
	  recursion(i+1);
	  bin[i]=false;
	  recursion(i+1);
	  

		 
		  
	  }
  }







