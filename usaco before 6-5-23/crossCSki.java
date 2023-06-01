import java.util.*;
import java.lang.*;
import java.io.*;
public class crossCSki {
	static int [][] grid ;
	static int r,c,px,py,pc,fc;
	static boolean [][] point ,vis;
	
  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("ccski.in"));
    FileWriter file = new FileWriter("ccski.out");
    BufferedWriter output = new BufferedWriter(file);
    r =sc.nextInt();
    c =sc.nextInt();
    grid = new int [r][c];
    point= new boolean[r][c];
    
    int m=0;
    int l=Integer.MAX_VALUE;
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		grid[i][j]=sc.nextInt();
    		m=Math.max(m,grid[i][j]);
    		l=Math.min(l,grid[i][j]);
    	}
    }
    pc=0;
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		if(sc.nextInt()==1) {
    			point[i][j]=true;
    			pc++;
    			px=i;
    			py=j;
    		}
    		else {
    			point[i][j]=false;
    		}
    	}
    }
    vis= new boolean [r][c];
    int lo=0;
    int hi=m-l;
    while(lo<hi) {
    	int mid = (lo+hi)/2;
    	if(works(mid)) {
    		hi=mid;
    	}
    	else {
    		lo=mid+1;
    	}
    }
    System.out.println(lo);
    output.write(String.valueOf(lo));
    output.close();
  }
static boolean works(int d) {
	fc=0;
	Arrays.fill(vis, false);

	flood(d,grid[px][py],px, py);
	
    return pc==fc;
    
}
static void flood(int d, int b,int x, int y) {
	
	if(x<0||y<0||x>=r||y>=c||vis[x][y]||Math.abs(grid[x][y]-b)>d) {
		
		return;

	}

	vis[x][y]=true;
	if(point[x][y]) {
		fc++;
	}
	flood(d, grid[x][y],x,y+1);
	flood(d, grid[x][y],x,y-1);
	flood(d, grid[x][y],x+1,y);
	flood(d, grid[x][y],x-1,y);
	
}
}





