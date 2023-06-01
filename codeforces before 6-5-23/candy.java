import java.util.*;
import java.lang.*;
import java.io.*;
public class candy {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int k =sc.nextInt();
    long lo =-1;
    long hi =n+1;
	    while(hi-lo>1){
	    	long mid = (lo+hi)/2;
	    	if((((n-mid)*(n-mid+1))/2) - mid>k){
	    	lo=mid;
	    	}
	    	else{
	    	hi = mid;
	    	}
	    	}

	    System.out.println(hi);

  }

}
