import java.util.*;
import java.lang.*;
import java.io.*;
public class trees {

  public static void main(String[] args){
	  
    Scanner sc = new Scanner(System.in);
  
    int n =sc.nextInt();
    int m =sc.nextInt();
    int [][] psum = new int [n+1][n+1];
    String line = "";
    for(int i=0;i<n;i++) {
    	line=sc.next();
    	
    	for(int j =0;j<n;j++) {
    		if(line.charAt(j)=='*') {
    			psum[i+1][j+1]++;
    		}
    	}
    }
    int pxs[][]=new int [n+1][n+1];
    for(int i =1;i<n+1;i++) {
    	for(int j=1;j<n+1;j++) {
    		pxs[i][j]=pxs[i-1][j]+
    		pxs[i][j-1]
    		-pxs[i-1][j-1]
    		+psum[i][j];
    	}
    }

    int a = 0;
    int b=0;
    int A=0;
    int B=0;
    int ans = 0;
    for(int i =0;i<m;i++) {
 
    	a=sc.nextInt();
    	b=sc.nextInt();
    	A=sc.nextInt();
    	B=sc.nextInt();
    	
    	ans=pxs[A][B]
    	-pxs[a-1][B]
    	-pxs[A][b-1]
    	+pxs[a-1][b-1];


        System.out.println(ans);
    	
    	
    }
    }



  
  }





