import java.util.*;
import java.lang.*;
import java.io.*;
public class cdNuts {

  public static void main(String[] args) throws IOException{
	  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
   
   
    while(true) {
    String [] nums = sc.readLine().split(" ");
    int n =Integer.parseInt(nums[0]);
    int m =Integer.parseInt(nums[1]);
    if(n==0&&m==0) {
    	break;
    }
    HashSet<Integer> cd = new HashSet<Integer>();
    for(int i =0;i<n+m;i++) {
    	cd.add(Integer.parseInt(sc.readLine()));
    }
    System.out.println(n+m-cd.size());
    }



  }
  
}
