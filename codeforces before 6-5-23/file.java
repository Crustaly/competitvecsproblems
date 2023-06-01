import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;
public class file {

  public static void main(String[] args) throws IOException{
      Scanner  sc= new Scanner(System.in);
      int n =sc.nextInt();
      double [] cans = new double [n];
      for(int i=0;i<n;i++) {
    	  cans[i]=sc.nextDouble();
      }
      Arrays.sort(cans);
      boolean works = true;
      double ans = Integer.MAX_VALUE;
      double balloon =1.0;
      for(int i =1;i<n+1;i++) {
    	  if(cans[i-1]>balloon) {
    		  works = false;
    	  }
    	  double poo  = (double) (double)cans[i-1]/balloon;
    	  ans = Math.min(ans, poo);
    	  balloon = balloon +1;
      }
      if(works) {
    	  System.out.println(ans);
      }
      else {
    	  System.out.println("impossible");
      }
    }
    


}