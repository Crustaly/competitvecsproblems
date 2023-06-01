import java.util.*;
import java.lang.*;
import java.io.*;
public class bipartite {
static ArrayList<ArrayList<Integer>> adj;
static boolean works;
static boolean [] visited;
static byte [] colors;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<n-1;i++) {
    	int a =sc.nextInt()-1;
    	int b =sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    visited = new boolean [n];
    colors = new byte[n];
    
    int ans =0;
    
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(!adj.get(i).contains(j)) {
    			adj.get(i).add(j);
    			adj.get(j).add(i);
    			works= true;
    			Arrays.fill(visited, false);
    			Arrays.fill(colors, (byte)0);
    			dfs(i,false);
    			if(works) {
    				ans++;
    			}
    			else {
    				adj.get(i).remove(Integer.valueOf(j));
        			adj.get(j).remove(Integer.valueOf(i));
    			}
    		}
    	}
    }



    System.out.println(ans);

  }
  static void dfs(int node, boolean col) {
	  if(col==true&&colors[node]==2) {
		  works=false;
		  return;
	  }
	  if(col==false&&colors[node]==3) {
		  works=false;
		  return;
	  }
	  if(visited[node]) {
		  return;
	  }
	 
	 
	  visited[node]=true;
 if(col==true) {
		  colors[node]=3;
		  for(int i :adj.get(node)) {
			  dfs(i,false);
		  }
	  }
 if(col==false) {
	  colors[node]=2;
	  for(int i :adj.get(node)) {
		  dfs(i,true);
	  }
 }

  }


}



