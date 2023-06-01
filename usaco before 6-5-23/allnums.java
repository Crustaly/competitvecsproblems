import java.util.*;
import java.lang.*;
import java.io.*;
public class allnums {
static int n,m;
static int [] nums;
static boolean [] a;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

  m =sc.nextInt();
    nums = new int [m];
    for(int i=0;i<m;i++) {
    	nums[i]=sc.nextInt();
    }

     n =sc.nextInt();
     a =new boolean [m];
     recursion(0,0);



  }
  static void recursion(int i , int picked) {
	  if(i==m) {
		  if(picked==n) {		
				 process(a);		  
		  }
		  return;
		
		
	  }
	  for(int p=1;p>=0;p--) {
		  if(p==0) {
			  a[i]=false;
		  }
		  else a[i]=true;

		  recursion(i+1,picked+p);
		  
	  }
  }
  static void process(boolean [] a) {
	  String subset = "";
	  for(int i=0;i<a.length;i++) {
		  if(a[i]) {
			  subset+=nums[i];
		  }
	  }
	  System.out.println(subset);
  }


}



