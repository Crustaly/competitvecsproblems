import java.util.*;
import java.lang.*;
import java.io.*;
public class loan {
static long n,k,m;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("loan.in"));
    FileWriter file = new FileWriter("loan.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextLong();
    k =sc.nextLong();
    m =sc.nextLong();
    long low =1;
    long high = 3;
    
    while(low<high) {
    	long mid = (low+high+1)/2;
    	if(works(mid)) {
    		low=mid;
    	} 
    	else high = mid-1;
    }


    System.out.println(low);

    output.write(String.valueOf(low));

    output.close();
  }
static boolean works (long x) {
	long remaining_n=n;
	long y=0;
	long remaining_days =k;
	while(true){
		y=remaining_n/x;
		if(y<m) {
			return remaining_days*m>=remaining_n;
		}
		long g = (remaining_n-y*x)/y+1;
		remaining_days-=g;
		remaining_n-=g*y;
	
	if(remaining_n>0&&remaining_days<=0)return false;
	}
}

}



