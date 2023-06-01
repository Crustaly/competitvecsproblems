import java.util.*;
import java.lang.*;
import java.io.*;
public class acorns {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int [][] acorns = new int [n][2];
    for(int i =0;i<n;i++) {
    	for(int j=0;j<2;j++) {
    		acorns[i][j]=sc.nextInt();
    	}
    }
    Arrays.sort(acorns,(a,b)->(a[ 0]-b[0]));
    
    int [] dp = new int [n];
    dp[0]=1;
    for(int i =1;i<n;i++) {
    	int max=0;
    	for(int j=0;j<=i;j++) {
    		if(acorns[j][1]<acorns[i][1]) {
    		max =Math.max(dp[j], max);

    	}
    	}

    	dp[i]=1+max;
System.out.println(Arrays.toString(dp));
    }


    int max=0;
   for(int i =0;i<n;i++) {
	   max=Math.max(dp[i], max);
   }
System.out.println(max);
  }


}



