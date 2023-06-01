import java.util.*;
import java.lang.*;
import java.io.*;
public class collect {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("rental.in"));
    int n =sc.nextInt();
    int [] nums = new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    TreeSet<Integer> set = new TreeSet<Integer>();
    for(int i =0;i<n;i++) {
    	if(set.lower(nums[i])==null) {
    		set.add(nums[i]);
    	}
    	else {
    		set.remove(set.lower(nums[i]));
    		set.add(nums[i]);
    	}
    }




    System.out.println(set.size());

  }


}



