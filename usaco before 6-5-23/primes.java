import java.util.*;
import java.lang.*;
import java.io.*;
public class primes{
static int [] primes= {1,3,7,9};
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i:prime(n)) {

    	System.out.println(i);
    }

  }
  static ArrayList<Integer> prime(int i ){
	  if (i==1) {
		  ArrayList<Integer> ones = new ArrayList<Integer>();
		  ones.add(2);
		  ones.add(3);
		  ones.add(5);
		  ones.add(7);
		 
	  return ones;
	  }
	  ArrayList<Integer> arr =new ArrayList<Integer>();
	  for(int j:prime(i-1)) {
		  for(int k:primes) {
			  int n= j*10+k;
			  if(ifprime(n)) {
				  arr.add(n);
			  }
		  }
	  }
	  return arr;
	  
	  }
  static boolean ifprime(int i ) {
	  for(int l=2;l<=Math.sqrt(i);l++) {
		  if(i%l==0) {
			  return false;
		  }
	  }
	  return true;
  }
  }






