import java.util.*;
import java.lang.*;
import java.io.*;
public class sum2 {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    int [] nums =new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    boolean found=false;
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(int i =0;i<n;i++) {
    	if(map.containsKey(m-nums[i])) {
    		found=true;
    		System.out.println((i+1)+" "+(map.get(m-nums[i])));
    		break;
    	}
    	map.put(nums[i],i+1);
    }
    if(!found) {
    	System.out.println("IMPOSSIBLE");
    }



  }


}



