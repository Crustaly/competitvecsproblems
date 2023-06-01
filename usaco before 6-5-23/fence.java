import java.util.*;
import java.lang.*;
import java.io.*;
public class fence {
static ArrayList<ArrayList<Integer>> adj;
static int [][]coords;
static boolean visited[];
static int x1,x2,y1,y2;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("fenceplan.in"));
    FileWriter file = new FileWriter("fenceplan.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    coords=new int [n][2];
    for(int i =0;i<n;i++) {
    	coords[i][0]=sc.nextInt();
    	coords[i][1]=sc.nextInt();
    }
    for(int i =0;i<m;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    int ans=Integer.MAX_VALUE;
    visited=new boolean [n];
    for(int i =0;i<n;i++) {
    	if(!visited[i]) {
    		x1=Integer.MAX_VALUE;
    		x2=0;
    		y1=Integer.MAX_VALUE;
    		y2=0;
    		dfs(i);
    		ans=Math.min(ans, (x2-x1)*2+(y2-y1)*2);
    	}
    }



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static void dfs(int node) {
	  visited[node]=true;
	  x1=Math.min(x1, coords[node][0]);
	  x2=Math.max(x2, coords[node][0]);
	  y1=Math.min(y1, coords[node][1]);
	  y2=Math.max(y2, coords[node][1]);
	  for(int i :adj.get(node)) {
		  if(!visited[i]) {
			  dfs(i);
		  }
	  }
  }


}



