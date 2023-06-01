import java.util.*;
import java.lang.*;
import java.io.*;
public class flood {
static boolean [][]visit;
static char [][]grid;
static int area,perimeter,tarea, tperimeter;
static int n;
static int [] dirx = {0,0,1,-1};
static int [] diry = {1,-1,0,0};
  public static void main(String[] args) throws IOException{
   Scanner sc = new Scanner(System.in);
   // Scanner sc = new Scanner(new File("perimeter.in"));
    FileWriter file = new FileWriter("perimeter.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    grid = new char [n][n];
    visit = new boolean [n][n];
    for(int i =0;i<n;i++) {
       grid[i]=sc.next().toCharArray();
    }
    int area =0;
    int perimeter=0;
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(grid[i][j]=='#'&&!visit[i][j]) {
    		    tarea=0;
    		    tperimeter=0;
    			floodfill(i,j);
    			if(tarea>area) {
    				area=tarea;
    				perimeter=tperimeter;
    			}
    			else if(tarea==area&&tperimeter<perimeter) {
    				area=tarea;
    				perimeter=tperimeter;
    			}
    		}
    	}
    }
    System.out.println(area+" "+perimeter);
    output.write(String.valueOf(area+" "+perimeter));

    output.close();
}
  static void floodfill(int i ,int j) {
	  if(i<0||j<0||i>=n||j>=n||grid[i][j]!='#') {
		  tperimeter++;
	      return;
	  }
	  if(visit[i][j]) {
		  return;
	  }
	  tarea++;
	  visit[i][j]=true;
	  floodfill

		  
  }


}



