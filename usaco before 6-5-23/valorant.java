import java.util.*;
import java.lang.*;
import java.io.*;
public class valorant {
static int [][] grid;
static int n,m;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
  
    int t =sc.nextInt();
    for(int c =0;c<t;c++) {
        n =sc.nextInt();
        m=sc.nextInt();
    	int hi =Math.min(n, m);
    	int lo=0;
    	grid = new int [n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			grid[i][j]=sc.nextInt();
    		}
    	}
    	while(lo<hi){
        	int mid = (lo+hi+1)/2;
        	if(check(mid)){
        	lo=mid;
        	}
        	else{
        	hi = mid-1;
        	}
        	}

        System.out.println(lo);

    }

  }
  static boolean check(int a) {
	  int [][] greater = new int [n+1][m+1];
	  for(int i =0;i<n;i++) {
		  for(int j =0;j<m;j++) {
			  if(grid[i][j]>=a) {
				  greater[i+1][j+1]++;
			  }
		  }
	  }
	  int [][] psum = new int [n+1][m+1];
	  for(int i =1;i<n+1;i++) {
		  for(int j =1;j<m+1;j++) {
			  psum[i][j]=greater[i][j]
						+ psum[i-1][j]
						+ psum[i][j-1]
						- psum[i-1][j-1];
		  }
		 }
	  for(int i =a;i<n+1;i++) {
		  for(int j =a;j<m+1;j++) {
			  int sum = psum[i][j]-psum[i][j-a]-psum[i-a][j]+psum[i-a][j-a];
	            if (sum == a * a) return true;
	  }
	  
  }
	  return false;
	  
  }
}