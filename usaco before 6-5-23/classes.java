import java.util.*;
import java.lang.*;
import java.io.*;
public class classes{
static ArrayList<ArrayList<Integer>> adj;
static boolean [] visited;
static boolean work;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    adj = new ArrayList<ArrayList<Integer>> ();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<m;i++) {
    	int a =sc.nextInt();    
    	int b =sc.nextInt();
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    visited = new boolean[n];
    work = true; 
    for(int i =0;i<n;i++) {
    	if(!visited[i]) {
    	    dfs(i, i, 0);
    	}
    }
    System.out.println(work);


  }
  static void dfs(int node, int parent, int cycle) {
	 
	  if(node==parent&&cycle==1) {
		  work =false;
		  return;
	  }
	  if(visited[node]) {
		  return;
	  }  
	  visited[node]=true;
	  for(int i:adj.get(node)) {
		  dfs(i, parent, 1);
	  }
	  
  }


}



