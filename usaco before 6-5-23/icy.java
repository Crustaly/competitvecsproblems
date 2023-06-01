import java.util.*;
import java.lang.*;
import java.io.*;
public class icy {
	static char [][] grid;
	static int n, peri, area;
	static boolean visited[][];
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   // Scanner sc = new Scanner(new File("perimeter.in"));
    FileWriter file = new FileWriter("perimeter.out");
    BufferedWriter output = new BufferedWriter(file);
     n =sc.nextInt();
   
    grid= new char [n+2][n+2];
   Arrays.fill(grid[0], 'c');
   Arrays.fill(grid[n+1], 'c');
   for(int i =0;i<n+2;i++) {
	   grid[i][0]='c';
	   grid[i][n+1]='c';
   }
   
    for(int i =1;i<n+1;i++) {
    	String line= sc.next();
    	for(int j=1;j<n+1;j++) {
    		grid[i][j]=line.charAt(j-1);
    	}
    }
    visited=new boolean [n][n];
    int a = 0;
    int p = 0;
    for(int i =1;i<n+1;i++) {
    	for(int j=1;j<n+1;j++) {
    		if(!visited[i-1][j-1]&&grid[i][j]=='#') {
    			floodfill(i ,  j);
    			if(area>a) {
    				a=area;
    				p=peri;
    			}
    			else if(area==a) {
    				if(peri<p) {
    					p=peri;
    				}
    			}
    			peri=0;
    			area=0;
    		}
    	}
    }
    



    System.out.println(a);
    System.out.println(p);
    output.write(String.valueOf(a));
    output.write(" ");
    output.write(String.valueOf(p));

    output.close();
  }
  static void floodfill(int a, int b) {
	  if(grid[a][b]!='#'||visited[a-1][b-1]) {
		  return;
	  }
	  area++;
	  visited[a-1][b-1]=true;
	  if(grid[a-1][b]!='#') {
		  peri++;
	  }
	  if(grid[a][b-1]!='#') {
		  peri++;
	  }
	  if(grid[a+1][b]!='#') {
		  peri++;
	  }
	  if(grid[a][b+1]!='#') {
		  peri++;
	  }
	  floodfill(a-1,b);
	  floodfill(a+1,b);
	  floodfill(a,b+1);
	  floodfill(a,b-1);
  }


}



