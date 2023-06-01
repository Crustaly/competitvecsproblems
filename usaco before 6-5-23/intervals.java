import java.util.*;
import java.lang.*;
import java.io.*;
public class intervals{
static  long ans;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
  
    ans =(long)0;
    int [] nums = new int [n];
    for(int i=0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    check(nums);

    nums = reverse(nums, n);
    check(nums);
    System.out.println(ans);

  }
  static void check(int [] nums) {
	  Stack<Integer> stack = new Stack<Integer>();
	  for(int i =nums.length-1;i>=0;--i) {
		  while(!stack.empty()&&nums[stack.peek()]<nums[i]) {
			  stack.pop();
		  }
		 if(!stack.empty()) {
			  ans+=stack.peek()-i+1;
		  }
		  stack.push(i);
		  
	  }
  }

  static int [] reverse(int a[], int n)
  {
      int[] b = new int[n];
      int j = n;
      for (int i = 0; i < n; i++) {
          b[j - 1] = a[i];
          j = j - 1;
      }
      return b;
}
}