import java.util.*;
import java.lang.*;
import java.io.*;
public class factory{
static int m;
static int [] machs ;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    m =sc.nextInt();
    machs = new int [n];
    for(int i =0;i<n;i++) {
    	machs[i]=sc.nextInt();
    }   
    long l=1;
    long h=Long.MAX_VALUE/2;
    while(l<h) {
    	long mid = (l+h)/2;
    	if(works(mid)) {
    		h=mid;
    	}
    	else {
    	l=mid+1;
    	}
    	}

    System.out.println(l);
    }
static boolean works (long t) {
	int total=0;
	for(int i:machs) {
		total+=Math.floor(t/i);

	}

	
	return total>=m;
}


}



