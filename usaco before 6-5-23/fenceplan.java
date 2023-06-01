import java.util.*;
import java.lang.*;
import java.io.*;
public class fenceplan {
static int [][] grid;
static ArrayList<ArrayList<Integer>> adj;
static int n,m;
static boolean [] visited;
static int x1,x2,y1,y2;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("fenceplan.in"));
    FileWriter file = new FileWriter("fenceplan.out");
    BufferedWriter output = new BufferedWriter(file);
 
    n =sc.nextInt();
    grid= new int [n][2];
    m =sc.nextInt();
    visited = new boolean [n];
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<n;i++) {
    	grid[i][0]=sc.nextInt();
    	grid[i][1]=sc.nextInt();
    }
    for(int i =0;i<m;i++) {
    int a =sc.nextInt()-1;
    int b=sc.nextInt()-1;
    adj.get(a).add(b);
    adj.get(b).add(a);
    }
    int ans = Integer.MAX_VALUE;
    for(int i=0;i<n;i++) {
    	if(!visited[i]) {
    	x1=Integer.MAX_VALUE;
    	y1=Integer.MAX_VALUE;
    	x2 = 0;
    	y2 =0;
    	dfs(i);
    	ans=Math.min(ans, (x2-x1)*2+(y2-y1)*2);
    	}
    }

    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
static void dfs(int node) {
	if(visited[node]) {
		return;
	}
	visited[node]=true;
	x1 = Math.min(grid[node][0], x1);
	y1 = Math.min(grid[node][1], y1);
	x2 = Math.max(grid[node][0], x2);
	y2 = Math.max(grid[node][1], y2);
	for(int i:adj.get(node)) {
		dfs(i);
	}
}

}



