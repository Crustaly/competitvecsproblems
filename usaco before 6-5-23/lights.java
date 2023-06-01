import java.util.*;
import java.lang.*;
import java.io.*;
public class lights{
static boolean [][] lit,visited;
static ArrayList<Pair>[][] switches;
static int n, litRooms;
static int[] dirX = {0, 1, 0, -1};
static int[] dirY = {-1, 0, 1, 0};
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("lightson.in"));
    FileWriter file = new FileWriter("lightson.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    int m =sc.nextInt();
    lit=new boolean [n][n];
    switches = new ArrayList[n][n];
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		switches[i][j]=(new ArrayList<Pair>());
    	}
    }
    for(int i =0;i<m;i++) {
    	int a =sc.nextInt()-1;
    	int b =sc.nextInt()-1;
    	int c =sc.nextInt()-1;
    	int d =sc.nextInt()-1;
    	switches[a][b].add(new Pair(c,d));
    }
    litRooms =0;
    visited=new boolean [n][n];
    lit[0][0]=true;
    dfs(0,0);



    System.out.println(litRooms+1);

    output.write(String.valueOf(litRooms+1));

    output.close();
  }
  static class Pair{
	  public int x,y;
	  public Pair(int a, int b) {
		  x=a;
		  y=b;
	  }
  }
  static void dfs(int x, int y) {
	  if(x<0||y<0||y>n-1||x>n-1||visited[x][y]||!lit[x][y]) {
		  return;
	  }
	  if (!checkConnected(x, y) && !(x == 0 && y == 0)) {
			return;
		}
	  visited[x][y]=true;
	  
	  for(int i =0;i<switches[x][y].size();i++) {
		  
		  int roomX = switches[x][y].get(i).x;
		  int roomY = switches[x][y].get(i).y;
		  if(!lit[roomX][roomY]) {
			  litRooms++;
		  }
		  lit[roomX][roomY]=true;
		  dfs(roomX,roomY);
	  }
	  dfs(x+1,y);
	  dfs(x,y+1);
	  dfs(x-1,y);
	  dfs(x,y-1);

	  
  }
	public static boolean checkConnected(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int newX = x + dirX[i];
			int newY = y + dirY[i];
			if (newX < 0 || newY < 0 || newX > n- 1 || newY > n - 1) {
				continue;
			}
			if (visited[newX][newY]) {
				return true;
			}
		}

		return false;
	}


}



