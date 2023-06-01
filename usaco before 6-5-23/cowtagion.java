import java.util.*;
import java.lang.*;
import java.io.*;
public class cowtagion {
static ArrayList<ArrayList<Integer>> adj;
static boolean [] visited;
static int ans;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    adj = new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<n-1;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    ans=0;
    visited=new boolean [n];
    dfs(0);
    System.out.println(ans);


  }
  static void dfs(int node) {
	  int childs = adj.get(node).size();
      if(visited[0]!=true) {
    	  childs++;
      }
	  visited[node]=true;
	  
	  int two=1;
	  while(two<childs) {
		  ans++;
		  two*=2;
	  }
	  for(int i :adj.get(node)) {
		  if(!visited[i]) {
			  dfs(i);
			  ans++;
		  }
		  
	  }
	
  }

}



