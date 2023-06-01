import java.util.*;
import java.lang.*;
import java.io.*;
public class noThanks {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] nums = new int [n+1];
    long sum =0;
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    nums[n]= Integer.MAX_VALUE;
    Arrays.sort(nums);
    boolean inSequence = true;
    int min = nums [0];
    for(int i =0;i<n;i++) {
    	if(nums[i]+1!=nums[i+1]) {
    		sum+=min;
    		min = nums[i+1];
    	}

    }



    System.out.println(sum);

  }
}