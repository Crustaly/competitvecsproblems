import java.util.*;
import java.lang.*;
import java.io.*;
public class good {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int finAns=0;
  
    for(int i =0;i<n;i++) {
    	  int ans = Integer.MAX_VALUE;
    	String s =sc.next();
    	for(int j=0;j<=9;j++) {
    		for(int k=0;k<=9;k++) {
    		ans=Math.min(ans,s.length()-solve(j,k,s));
    		}
    	}
   finAns+=ans;
    }

System.out.println(finAns);

  }
  static int solve(int j, int k, String s) {
	  int target =j;
	  int count =0;
	  for(int i =0;i<s.length();i++) {
		  if(s.charAt(i)-'0'==target) {
			  count++;
			  if(target==j) {
				  target = k;
			  }
			  else {
				  target=j;
			  }
		  }
	  }
	  if(j!=k&&count%2==1) {
		  count--;
	  }
	  return count;
  }
}