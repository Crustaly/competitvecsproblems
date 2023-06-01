import java.util.*;
import java.lang.*;
import java.io.*;
public class circular {

static int [] steps;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    
    int t =sc.nextInt();

    lastPrime = new int [4];
    steps = new int [max+1];
    
    composite= new boolean[max+1];
    makePrimes();
    calcSteps();
    for(int i =0;i<t;i++) {
        int minsteps = Integer.MAX_VALUE;
        int step =0;
        boolean johnwins = true;
    	int n=sc.nextInt();
    	 int [] rooms = new int [n];
    	 for(int j=0;j<n;j++) {
    		 rooms[j]=sc.nextInt();
    		 step = steps[rooms[j]]/2;
    		 if(step<minsteps) {
    			 minsteps = step;
    			 johnwins = rooms[j]%4!=0;  
    		 }
    	 }

    	    
    	    if(johnwins) {
    	    	System.out.println("Farmer John");
    	    }
    	    else {
    	    	System.out.println("Farmer Nhoj");
    	    }
    	 
    }




  }
  	static void makePrimes(){
  		for(int i =2;i<=max;i++) {
  			if(!composite[i]) {
  				for(int j=2*i;j<=max;j+=i) {
  					composite[j]=true;
  				}
  			}
  		}
  	}
  	static void calcSteps() {
  		for(int i =0;i<=max;i++) {
  			if(i%2==0) {
  				steps[i]=i/2;
  			}
  			else {
  				if(!composite[i]) {
  					lastPrime[i%4]=i;
  				}
  				steps[i]=1+ ((i- lastPrime[i%4])/2) ;
  			}
  		}
  		
  	}
}