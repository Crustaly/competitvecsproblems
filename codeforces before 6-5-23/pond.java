import java.util.*;
import java.lang.*;
import java.io.*;
public class pond{
static boolean bin [][];
static int [][] grid;
static int n,k;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    n =sc.nextInt();
    k =sc.nextInt();
    int r=0;
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		grid[i][j]=sc.nextInt();
    		r=Math.max(r,grid[i][j]);
    	}
    }
    int l=0;
    while(l<r) {
    	int mid = (l+r)/2;
    	make(mid);
    	if(works) {
    		r=mid;
    	}
    	l=mid+1;
    }
    	
    


    System.out.println(ans);

  }
  static void make(int m) {
	  for(int i =0;i<n;i++) {
		  for(int j=0;j<n;j++) {
			  if(grid[i][j]>k) {
				  bin[i][j]=true;
			  }
		  }
	  }
  }static boolean works {
	  for(int i =0;i<n;i++) {
		  
	  }
  }


}



