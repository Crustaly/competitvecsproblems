import java.util.*;
import java.lang.*;
import java.io.*;
public class knights {
static boolean [][]visited; 
static char [][] grid;
static boolean works;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    grid = new char [5][5];
    visited = new boolean [5][5];
    for(int i =0;i<5;i++) {
      grid[i]= sc.nextLine().toCharArray();
    }
   works = true;
   int count =0;
    for(int i =0;i<5;i++) {
    	for(int j =0;j<5;j++) {
    		if(grid[i][j]=='k'){
    			count++;
    			 ff(i+2,j+1);
    			 ff(i-2,j+1);
    			 ff(i+2,j-1);
    			 ff(i-2,j-1);
    			 ff(i+1,j+2);
    			 ff(i-1,j+2);
    			 ff(i+1,j-2);
    			 ff(i-1,j-2);
    		}
    	}
    	}
    if(works&&count==9)  System.out.println("valid");
    else  System.out.println("invalid");
  
  }
  static void ff(int x, int y) {
	  if(x<0||x>=5||y<0||y>=5) {
		  return;
	  }
	  if(grid[x][y]=='k') {
		  works =false;
		  return;
	  }
	  else {
		  return;
	  }
  }
}