import java.util.*;
import java.lang.*;
import java.io.*;
public class millionare {
static boolean [][] visited;
static int [] []grid;
static boolean work;
static int n,m;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
    m =sc.nextInt();
    grid = new int [n][m];
    for(int i =0;i<n;i++) {
    	 for(int j =0;j<m;j++) {
    		 grid[i][j]=sc.nextInt();
    	 }
    }
    
    int lo =0;
    int hi = (int)1e9;
    while(lo<hi) {
    	int mid = (lo+hi)/2;
    	work = false;
        visited = new boolean [n][m];
    	works(0,0,mid, grid[0][0]);
  
    	if(work) {
    	hi=mid;	
    	}
    	else {
    		lo=mid+1;
    		}
    	
    	}
    

    System.out.println(lo);

  }
  static void works(int x, int y, int lad, int prevHeight) { 
	  if(x==n-1&&y==m-1) {
		  work = true;
		  return;
	  }
	  if(x<0||x>=n||y<0||y>=m||visited[x][y]||grid[x][y]-prevHeight>lad) {
		  return;
	  }
	  visited[x][y]=true;
	  works(x+1,y,lad,grid[x][y]);
	  works(x-1,y,lad,grid[x][y]);
	  works(x,y+1,lad,grid[x][y]);
	  works(x,y-1,lad,grid[x][y]);
	  
  }
}