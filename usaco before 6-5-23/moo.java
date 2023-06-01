import java.util.*;
import java.lang.*;
import java.io.*;
public class moo {
static int single,doub;
static int [][] grid;
static int n;
static boolean [][] vis;
static int current;
  public static void main(String[] args) throws IOException{
	  BufferedReader r = new BufferedReader(new FileReader("multimoo.in"));
	  FileWriter file = new FileWriter("multimoo.out");
	  BufferedWriter output = new BufferedWriter(file);
    
    n =Integer.parseInt(r.readLine());
    grid = new int [n][n];
    vis=new boolean [n][n];
    HashSet<Integer> cows = new HashSet<Integer>();
    for(int i=0;i<n;i++) {
    	String [] s = r.readLine().split(" ");
    	for(int j=0;j<n;j++) {
    		grid[i][j]=Integer.parseInt(s[j]);
    		cows.add(grid[i][j]);
    	}
    }
    single=0;
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(!vis[i][j]) {
    			current=0;
    			floodfill(grid[i][j],grid[i][j], i, j);
    			single=Math.max(current, single);
    		}
    	}
    }
    int doub =0;
    loop: for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(doub == n*n) {
    			break loop;
    		}
    		if(j>0&&grid[i][j-1]!=grid[i][j]) {
    			vis = new boolean [n][n];
    			current=0;
    			floodfill(grid[i][j-1],grid[i][j], i, j);
    			doub=Math.max(current, doub);
    		}
    	}
    }
    output.write(single+"\n");
    output.write(doub+"\n");
    output.close();

  }
  static void floodfill(int cow1, int cow2, int x, int y) {
	  if(x<0||x>=n||y<0||y>=n||vis[x][y]) {
		  return; 
	  }
	  if(cow1!=grid[x][y]&&cow2!=grid[x][y]) {
		  return;
	  }
	  current++;
	  vis[x][y]=true;
	  floodfill(cow1, cow2,x+1,y);
	  floodfill(cow1, cow2,x-1,y);
	  floodfill(cow1, cow2,x,y+1);
	  floodfill(cow1, cow2,x,y-1);

	  
  }
  }