import java.util.*;
import java.lang.*;
import java.io.*;
public class chess{
static char grid [][];
static boolean visited [][];
static int n,m;
  public static void main(String[] args) throws IOException{
   Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("helpcross.in"));


    n =sc.nextInt();
    m =sc.nextInt();
    int count = 0;
    grid = new char [n][m];
    visited = new boolean [n][m];
    sc.nextLine();
    for(int i =0;i<n;i++) {
    		grid[i]=sc.nextLine().toCharArray();
    	
    }
    for(int i =0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		if(!visited[i][j]&&grid[i][j]=='G') {
    			count++;
    			floodfill(i,j);
    		}
    	}
    }
    System.out.println(count);

  }
  static void floodfill(int x, int y) {
	  if(x<0||x>=n||y<0||y>=m||visited[x][y]||grid[x][y]!='G') {
		  return;
	  }
	  visited[x][y]=true;
	  floodfill(x-1,y+2);
	  floodfill(x-2,y+1);
	  floodfill(x-2,y-1);
	  floodfill(x-1,y-2);
	  
	  floodfill(x+1,y+2);
	  floodfill(x+2,y+1);
	  floodfill(x+2,y-1);
	  floodfill(x+1,y-2);
  }


}



