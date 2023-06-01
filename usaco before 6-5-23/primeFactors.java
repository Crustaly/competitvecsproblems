import java.util.*;
import java.lang.*;
import java.io.*;
public class primeFactors {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   
   r_n(n);


  
  }
  static void d(int n)
  {
	  
	  if(n==1) {
		  System.out.println( "*");
	  }   
	  else {
		  d(n-1);
		  for(int i =0;i<n;i++) {
			  System.out.print("*");
		  }
		  System.out.println();
		  d(n-1);
	  }

  }
  static void r_n(int n) {
	  String ans = "";
	  
	  for(int i =0;i<n;i++) {
		  ans+="*";
		  
	  }
	  System.out.println(ans);
	 d(n-1);
	  System.out.println(ans);
  }


}



