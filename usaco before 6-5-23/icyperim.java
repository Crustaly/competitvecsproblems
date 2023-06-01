import java.util.*;
import java.lang.*;
import java.io.*;
public class icyperim {
    static char [][] grid ;
    static int n;
    static boolean [][] visited;
    static int temparea, tempperi;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("perimeter.in"));
    FileWriter file = new FileWriter("perimeter.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
     grid = new char [n][n];
     visited = new boolean[n][n];
     sc.nextLine();
    for(int i =0;i<n;i++) {
    		grid[i]=sc.nextLine().toCharArray();
    }
    int peri = 0;
    int area =0;
    for(int i =0;i<n;i++) {
    	for(int j =0;j<n;j++) {
    		if(!visited[i][j]&&grid[i][j]=='#') {
    			temparea = 0;
    			tempperi=0;
    			floodfill(i,j);
    			if(temparea>area) {
    				peri = tempperi ;
    				area = temparea ;
    			}
    			else if(temparea==area&&tempperi<peri) {
    				peri = tempperi;
    			}
    		}
    	}
    }
 



System.out.println(area+" "+peri);
    output.write(String.valueOf(area+" "+peri));

    output.close();
  }
static void floodfill(int x, int y) {
	
	if(x>=n||x<0) {
		tempperi++;
	}
	if(y>=n||y<0) {
		tempperi++;
	}
	if(y<n&&y>=0&&x<n&&x>=0&&grid[x][y]!='#') {
		tempperi++;
	}
	if(x>=n||x<0||y>=n||y<0||visited[x][y]||grid[x][y]!='#') {
		return;
	}
	temparea++;
	visited[x][y]=true;
	floodfill(x+1,y);
	floodfill(x-1,y);
	floodfill(x,y-1);
	floodfill(x,y+1);
}

}



