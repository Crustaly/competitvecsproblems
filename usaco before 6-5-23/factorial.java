import java.util.*;
import java.lang.*;
import java.io.*;
public class factorial{
static int n;
static int m;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   
     n =sc.nextInt();
     m=sc.nextInt();
    
    
p(1);
 
  }
 
  static void p(int l) {
	  if(l>n) {
	  return;
	  }
	  p(l+1);
	  for(int i =m;i>m-l;i--) {
		  System.out.print(i+" ");
	  }
	  System.out.println();
  }


}



