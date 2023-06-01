import java.util.*;
import java.lang.*;
import java.io.*;
public class paint {

  public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner(new File("paintbarn.in"));
	    FileWriter file = new FileWriter("paintbarn.out");
	    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    
    int [][] grid= new int[1001][1001];
    
    int x1 =0;
    int y1=0;
    int x2=0;
    int y2=0;
    for(int i =0;i<n;i++) {
    	x1=sc.nextInt();
    	y1=sc.nextInt();
    	x2=sc.nextInt();
    	y2= sc.nextInt();
    	grid[x1][y1]++;
    	grid[x2][y2]++;
    	grid[x1][y2]--;
    	grid[x2][y1]--;
    }
    int ans = 0;
    for(int i =0;i<1001;i++) {
    	for(int j=0;j<1001;j++) {
    		if(i>0) {
    			grid[i][j]+=grid[i-1][j];
    		}
    		if(j>0) {
    			grid[i][j]+=grid[i][j-1];
    		}

    		if(i>0&&j>0) {
    			grid[i][j]-=grid[i-1][j-1];
    		}
    		if(grid[i][j]==m) {
    			ans++;
    		}
    	}
    }



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



