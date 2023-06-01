import java.util.*;
import java.lang.*;
import java.io.*;
public class comfy {
static boolean [][] grid;
static int [][] adj;
static int ans =0;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();

    grid = new boolean [3000][3000];
    adj = new int [3000][3000];
    for(int i =0;i<n;i++) {
    	ans--;
    	add(sc.nextInt()+1000, sc.nextInt()+1000);
    	System.out.println(ans);
    }


  }
  static void add(int x, int y) {
	  if(!grid[x][y]) {
		  grid[x][y]=true;
		  ans++;
		  if(adj[x][y]==3) {
			  add(x-1, y);
			  add(x+1, y);
			  add(x, y+1);
			  add(x, y-1);
		  }
		 for(int [] dir : new int [][] {{x - 1, y}, {x + 1, y}, {x, y - 1}, {x, y + 1}}) {
			 int u = dir[0];
			 int v = dir[1];
			 adj[u][v]++;
			 if(grid[u][v]&&adj[u][v]==3) {
				
	                    for (int[] another : new int[][]{{u - 1, v}, {u + 1, v}, {u, v - 1}, {u, v + 1}}) {
	                        int w = another[0];
	                        int z = another[1];
	                        add(w, z);
	                    }
			 }
		 }
		  
	  }


	
	  
  }
  
}