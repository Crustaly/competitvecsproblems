import java.util.*;
import java.lang.*;
import java.io.*;
public class divideby2or3{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int [] nums = new int [n];
    int g =0;
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++) {
        g = gcd(g,nums[i]);	
    }
    int ans =0;
    for(int i =0;i<n;i++) {
    	while(nums[i]%2==0&&nums[i]/2>=g) {
    		nums[i]/=2;
    		ans++;
    	}
    	System.out.println(nums[i]);
    	while(nums[i]%3==0&&nums[i]/3>=g) {
    		nums[i]/=3;
    		ans++;
    	}
    	System.out.println(nums[i]);
     	System.out.println(g);
    	if(nums[i]!=g) {
    		ans = -1;
    		break; 
    	}
    }

    System.out.println(ans);
    


  }
  static int gcd(int n, int r) {
	  if(r==0)return n;
	  return gcd(r, n%r);
  }
}