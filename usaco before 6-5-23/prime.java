import java.util.*;
import java.lang.*;
import java.io.*;
public class prime{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int poo =0;poo<n;poo++) {
    	int barns = sc.nextInt();
    	int [] cows = new int [barns];
    	for(int i =0;i<barns;i++) {
    		cows[i]=sc.nextInt();
    	}
    	boolean possible = false; 
    	for(int i =0;i<barns;i++) {
    		if(isPrime(cows[i])) {
    			possible = false;
    			break;
    		}
    		if(cows[i]==4||cows[i]==10) {
    			possible = true;
    		}

    	}
    	if(possible) {
    		System.out.println("Farmer Nhoj");
    	}
    	else {
    		System.out.println("Farmer John");
    	}
    }


  }
  static boolean makeFour(int a) {
	  if(a==4) {
		  return true;
	  }
	  for(int i=a;i>=a-6;i--) {
		  if(isPrime(i)) {
			  if(a-i==4) {
				  return true;
			  }
		  }
	  }
	  return false;
  }
  static boolean isPrime(int a)
  {
	  boolean prime =true;
	  if(a <= 1){
	  return false;
	  }
	  else{
	  for (int i = 2; i<= a/2; i++){
	  if ((a% i) == 0) {
		  	return false; 
	  }
	  }
	  return true;
	  }
}
  }