import java.util.*;
import java.lang.*;
import java.io.*;
public class rang {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [][] range = new int [n][n];
    int [] ans = new int [n];
    for(int i =0;i<n;i++) {
    	for(int j=i;j<n;j++) {
    		range[i][j]=sc.nextInt();
    	}
    }

    for(int i =n-2;i>=0;i--) {
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	boolean works = true;
    	ans[i]= ans[i+1]+ range[i][i+1];
    	for(int j=i;j<n;j++) {

    		min = Math.min(min, ans[j]);
    		max= Math.max(max, ans[j]);
    		int diff = max -min;
    		if(diff!=range[i][j]) {
    			works = false;
    			break;
    		}
    	}
    	if(!works) {
    		ans[i]=ans[i+1]- range[i][i+1];
    	}
    }

    
    for(int i=0;i<ans.length;i++) {
    	System.out.print(ans[i]);
    	if(i<ans.length-1) {
    		System.out.print(" ");
    	}
    }
  }
}