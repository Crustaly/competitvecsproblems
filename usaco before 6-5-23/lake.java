import java.util.*;
import java.lang.*;
import java.io.*;
public class lake{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    		
    int [][] lake = new int [n][m];
    
    for(int i =0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		lake[i][j]=sc.nextInt();
    	}
    }
   int [] di= {-1,-1,-1,0,0,1,1,1};
   int [] dj= {-1,0,1,-1,1,-1,0,1};
   int ans =0;
    for(int i =0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		for(int k=0;k<8;k++) {
    			if(i+di[k]>=n||j+dj[k]>=m||i+di[k]<0||j+dj[k]<0) {
    				continue;
    			}
    			if(lake[i+di[k]][j+dj[k]]==lake[i][j]) {
    				ans=Math.max(ans, lake[i][j]);
    			}
    		}
    	}
    }



    System.out.println(ans);

  }


}



