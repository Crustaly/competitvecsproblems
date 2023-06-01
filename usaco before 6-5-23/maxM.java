import java.util.*;
import java.lang.*;
import java.io.*;
public class maxM{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    int [] nums = new int [n];
    for(int i = 0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    Arrays.sort(nums);
    long lo = 0;
    long hi =(int) 2e9-1;
    long mid = 0;
    while(lo<hi) {
    	mid = lo + (hi - lo + 1) / 2;
    	if(works(m,nums,mid)) {
    		lo=mid;
    	}
    	else {
    		hi=mid-1;
    	}
    }
    System.out.println(lo);
  




  }
  static boolean works (int need, int [] n, long test) {
	  long a = 0;
	  for(int i =(n.length-1)/2;i<n.length;i++) {
		  a+=Math.max(0, test-n[i]);
	  }
	  return a<=need;
  }


}



