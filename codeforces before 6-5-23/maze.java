import java.util.*;
import java.lang.*;
import java.io.*;
public class maze {
static int [][] tic ;

static int n,bsx, bsy;
static char [][] grid;
static HashSet<Integer> count;
static boolean [][][] visited;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    tic = new int [3][3];
    n =sc.nextInt();
    visited= new boolean [n][3*n][20000] ;
    grid = new char [n][3*n];
    for(int i =0;i<n;i++) {
    	grid[i]=sc.nextLine().toCharArray();
    }
    for(int i =0;i<n;i++) {
    	for(int j =0;j<n*3 ;j+=3) {
    		if(grid[i][j]=='B') {
    			bsx=i;
    			bsy=j;
    		}
    }
    }
    dfs(bsx, bsy, 0);
    
    count=0;
    System.out.println(ans);

  }
  static void dfs(int x, int y, int path) {
	   if(x<0||y<0||x>=n||y>=3*n||visited[x][y][path]) {
		   return;
	   }
	   visited[x][y][path]=true;
	   if(grid[x][y]=='M'||grid[x][y]=='O') {
		   tic[grid[x][y+1]][grid[x][y+2]]=grid[x][y];
		   if(check(tic)) {
			   count.add(path);
		   }
	   }
	   if()
  }
  static boolean check(int [][] tic) {
	  for(int i =0;i<3;i++) {
	  if(tic[i][0]=='M'&&tic[i][1]=='O'&&tic[i][2]=='O') 
		  return true;  
	  if(tic[i][0]=='O'&&tic[i][1]=='O'&&tic[i][2]=='M') 
		  return true;  
	  if(tic[0][i]=='M'&&tic[1][i]=='O'&&tic[2][i]=='O') 
		  return true; 
	  if(tic[0][i]=='O'&&tic[1][i]=='O'&&tic[2][i]=='M') 
		  return true;
	  }
	  if(tic[0][0]=='O'&&tic[1][1]=='O'&&tic[2][2]=='M') 
		  return true;
	  if(tic[0][0]=='M'&&tic[1][1]=='O'&&tic[2][2]=='O') 
		  return true;
	  if(tic[2][0]=='O'&&tic[1][1]=='O'&&tic[0][2]=='M') 
		  return true;
	  if(tic[2][0]=='M'&&tic[1][1]=='O'&&tic[0][2]=='O') 
		  return true;
	  
	  return false;
  }
}