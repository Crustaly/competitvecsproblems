import java.util.*;
import java.lang.*;
import java.io.*;
public class ruler {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    for(int i =0;i<n;i++) {
    	System.out.print('*');
    }
    System.out.println();
    d_n(n-1);
    for(int i =0;i<n;i++) {
    	System.out.print('*');
    }
  

  }
  static void d_n(int p) {

	  if(p==1) {
		  System.out.println('*');
		  return;
	  }
	  
	  d_n(p-1);
	  for(int i =0;i<p;i++) {
		  System.out.print('*');
	  }
	  System.out.println();
	  	  d_n(p-1);
  }


}



