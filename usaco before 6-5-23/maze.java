import java.util.*;
import java.lang.*;
import java.io.*;
public class maze{
	static char [][] grid;
	static int n,m;
	static boolean [][] visited;
	static int gcount;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
  
    //count g's
    //make a box around b's, if box covers a, print no
    //flood fill to see if  the maze has all the g's
    for(int lll =0;lll<p;lll++) {
 	 n =sc.nextInt();
     m =sc.nextInt();
     grid = new char [n][m];
     visited = new boolean [n][m];

    	 for(int j=0;j<n;j++) {
    		 grid[j]=sc.next().toCharArray();
    	 }
    	 int gans =0;
    	 boolean works = true;
     for(int i =0;i<n;i++) {
    	 for(int j =0;j<m;j++) {
    		 if(grid[i][j]=='G') {
    			 gans++;
    		 }
    		 if(grid[i][j]=='B') {
    			 if(i>0&&i<n&&j>0&&j<m)
    				 //up
    			if(j<m-1) {
    				if(grid[i][j+1]!='G') 
    					grid[i][j+1]='#';		
    				else 
    					works = false;
    			}
    			if(j>0) {  			
        			if(grid[i][j-1]!='G') 
       				grid[i][j-1]='#';		
       				else 
       					works = false;		
    			}
    			//left
    			if(i>0) {
    				if(grid[i-1][j]!='G') 
    					grid[i-1][j]='#';		
    				else 
    					works = false;
    			}
    			if(i<n-1) {
    				if(grid[i+1][j]!='G') 
    					grid[i+1][j]='#';		
    				else 
    					works = false;
    			}
    		 }
    	 }
     }
  

    			boolean yay = false;
    			boolean edgeTouch = false;
    			gcount=0;
    		for(int i =0;i<n;i++) {
    			for(int j =0;j<m;j++) {
    				if(grid[i][j]!='#'&&grid[i][j]!='B'&&!visited[i][j]) {
    					
    					gcount=0;
    					
    					floodfill(i,j);
    		
    			
    					if(gcount==gans) {
    						
    						yay = true;
    						break;
    					}
    					
    				}
    				
   				}
   			}
    		if(visited[n-1][m-1]) {
    			edgeTouch = true;
    		}
    		
    		if((yay&&works&&edgeTouch)||(gans==0&&grid[n-1][m-1]=='#')) {
    			System.out.println("yEs");
    		}
    	
    		else {
    			System.out.println("nO");
    		}
     
    }

  
  }
  static void floodfill(int a , int b) {
	  if(a<0||a>=n||b<0||b>=m||grid[a][b]=='#'||visited[a][b]) {
//seperate the if and make boolean edgeTouch to pass case liek 5 or 4 
		  return;
	  }
	  visited[a][b]=true;

	  if(grid[a][b]=='G') {
		  
		  gcount++;
	  }
	  floodfill(a+1,b);
	  floodfill(a-1,b);
	  floodfill(a,b+1);
	  floodfill(a,b-1);
  }


}



