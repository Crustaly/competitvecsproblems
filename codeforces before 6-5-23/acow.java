import java.util.*;
import java.lang.*;
import java.io.*;
public class acow {
static int n,k,l;
static int [] papers;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
    k =sc.nextInt();
    l =sc.nextInt();
    papers =new int [n];
    for(int i=0;i<n;i++) {
    	papers[i]=sc.nextInt();
    }

    Arrays.sort(papers);
    papers = reverse(papers);
    int lo=0;
    int hi=n;
    
    while(lo<hi){
    	int mid = (lo+hi+1)/2;
    	if(check(mid)){
    		lo=mid;
    	}
    	else{
    		hi = mid-1;
    	}
    }

    System.out.println(hi);

  }
  static boolean check(int h) {
	 long need =0;
	 for(int i =0;i<h;i++) {
		 need+=Math.max(0,h-papers[i]);
	 }
	 if(need>(long)l*k) {
		 return false;
	 }
		  
	 if(papers[h-1]+k<h) {
		 return false;
	 }
	 return true;
	  }
  static int[] reverse(int[] array) {
      int[] newArray = new int[array.length];

      for (int i = 0; i < array.length; i++) {
          newArray[array.length - 1 - i] = array[i];
      }

      return newArray;
  }

  }
