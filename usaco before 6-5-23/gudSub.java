import java.util.*;
import java.lang.*;
import java.io.*;
public class gudSub {
    static int r,c;
    static char [][] grid;
    static int [] xdir = {0,0,-1,1};
    static int [] ydir = {1,-1,0,0};
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
     r = sc.nextInt();
     c=sc.nextInt();
     grid = new char [r][c];
     for(int i =0;i<r;i++) {
         grid[i]=sc.next().toCharArray();
    	 }
     boolean works = true;
     for(int i =0;i<r;i++) {
    	 for(int j=0;j<c;j++) {
    		 if(grid[i][j]=='S') {
    			 if(!protecc(i,j)) {
    				 works=false;
    				 break;
    			 }
    		 }
    	 }
     }
     if(works) {
    	 System.out.println("Yes");
    	 for(int i =0;i<r;i++) {
        	 for(int j=0;j<c;j++) {
        		 System.out.print(grid[i][j]);
        	 }
        	 System.out.println();
    	 }
        	 }
     else {
    	 System.out.println("No");
     }
     }
     
  
     static boolean protecc(int x, int y) {
    	
    	 for(int i =0;i<4;i++) {
    		 if(x+xdir[i]<0||y+ydir[i]<0||x+xdir[i]>=r||y+ydir[i]>=c) {
    			 continue;
    		 }
    		 if(grid[x+xdir[i]][y+ydir[i]]=='W') return false;
    		 if(grid[x+xdir[i]][y+ydir[i]]=='.') grid[x+xdir[i]][y+ydir[i]]='D';
    	 }
    	 return true;
     }
     }
          
    





  






