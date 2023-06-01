import java.util.*;
import java.lang.*;
import java.io.*;
public class left{
static int [][] grid;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("leftout.in"));
    FileWriter file = new FileWriter("leftout.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    boolean found= false;
    grid = new int [n][n];
    for(int i=0;i<n;i++) {
    	String s =sc.next();
    	for(int j =0;j<n;j++) {
    		if(s.charAt(j)=='L') {
    			grid[i][j]=1;
    		}
    		else {
    			grid[i][j]=2;
    		}
    	}
    }
    int oc =0;
    int tc =0;

    	
    loop: for(int i =0;i<n-1;i++) {
    	int ja=0;
    	if(grid[i][0]==1) oc++;
        if(grid[i][0]==2) tc++;
        if(grid[i+1][0]==1) oc++;
        if(grid[i+1][0]==2) tc++;
    	for(int j =0;j<n-1;j++) {
    		if(grid[i][j+1]==1)oc++;
    		if(grid[i][j+1]==2)tc++;
    		if(grid[i+1][j+1]==1)oc++;
    		if(grid[i+1][j+1]==2)tc++;
    		if(j-1>=0 &&grid[i][j-1]==1) oc--;
    		if(j-1>=0 &&grid[i][j-1]==2) tc--;
    		if(j-1>=0 &&grid[i+1][j-1]==1) oc--;
    		if(j-1>=0 &&grid[i+1][j-1]==2) tc--;
    	    ja=j;
    		if((tc==3&&oc==1)||(oc==3&&tc==1)) {
    			found = true;
    			output.write(i+1 +" "+(j+1));
    	
    			break loop;
    		}
    	}
    	oc=0;
    	tc=0;
    }
    if(!found) {
    	output.write(String.valueOf(-1));
    	System.out.println(-1);
    }
    output.close();

  }
}