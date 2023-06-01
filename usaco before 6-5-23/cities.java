import java.util.*;
import java.lang.*;
import java.io.*;
public class cities{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();

    String [] input = new String [n];
    
    for(int i =0;i<n;i++) {
    	String a=sc.next();
    	String b=sc.next();
    	input[i]=a.substring(0,2)+b;
    }
    
    Arrays.sort(input);

    long count=0;
    
    for(int i =0;i<n;i++) {
    	String f=input[i].substring(2,4)+input[i].substring(0,2);
    
    	if(f.equals(input[i])){
    		continue;
    	}
    	int ub=upperbound(f, input);
    	int lb=lowerbound(f, input);
    	count+=ub-lb;
    		
    	
    }
    
    	
System.out.println(count/2);


   
  }
  static int upperbound(String a, String [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a.compareTo(arr[mid])>=0) {
			  
			  l=mid+1;
			  
		  }
		  else {
			  r=mid;
		  }
		 
	  }
	  return l;
  }
  static int lowerbound(String a, String [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a.compareTo(arr[mid])<=0) {
			  r=mid;
			  
		  }
		  else {
			  l=mid+1;
		  }
		 
	  }
	  return l;
  }


}




