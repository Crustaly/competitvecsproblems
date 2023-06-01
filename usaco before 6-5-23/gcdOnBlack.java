import java.util.*;
import java.lang.*;
import java.io.*;
public class gcdOnBlack {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int [] nums =new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    int [] prefixGCD = new int [n+1];
    int [] suffixGCD = new int [n+1];
    for(int i =1;i<=n;i++) {
    	prefixGCD[i] =gcd(prefixGCD[i-1],nums[i-1]);
    }

    for(int i =n-1;i>=0;i--) {
    	suffixGCD[i] =gcd(suffixGCD[i+1],nums[i]);
    }

    int ans = 0;
    for(int i =1;i<n+1;i++) {
    	ans=Math.max(ans,gcd(suffixGCD[i],prefixGCD[i-1]));
    }
    System.out.println(ans);



  }
  static int gcd(int a, int b){
	  if(b==0) {
		  return a;
	  }
	  else {
		  return gcd(b,a%b);
	  }
  }


}



