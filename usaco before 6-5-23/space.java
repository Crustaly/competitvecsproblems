import java.util.*;
import java.lang.*;
import java.io.*;
public class space {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int total = 0;
    int [][] grid= new int [n][n];
    int horiz = 0;
    int vert = 0;
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		grid[i][j]=sc.nextInt();
    	}
    }
    
    for(int i =0;i<n;i++) {
    	int o = 0;
    	for(int j=1;j<n;j+=2) {
    		o+=grid[i][j];
    	}
    	int t = 0;
    	for(int j=0;j<n;j+=2) {
    		t+=grid[i][j];
    	}
        horiz+=Math.max(o, t);
    }
    
    for(int i =0;i<n;i++) {
    	int o = 0;
    	for(int j=1;j<n;j+=2) {
    		o+=grid[j][i];
    	}
    	int t = 0;
    	for(int j=0;j<n;j+=2) {
    		t+=grid[j][i];
    	}
        vert+=Math.max(o, t);
    }



    System.out.println(Math.max(horiz, vert));

  }
}



