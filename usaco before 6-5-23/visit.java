import java.util.*;
import java.lang.*;
import java.io.*;
public class visit {
static int [] adj;
static int [] value ;
static int [] visited;
static int [] backtrack;
static long ans;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    visited=new int [n];
    ans =0;
    value = new int [n];	
    adj=new int [n];
    backtrack = new int [n];
    for(int i =0;i<n;i++) {
    	adj[i]=sc.nextInt()-1;
    	value[i]=sc.nextInt();
    	ans+=value[i];
    }
    for(int i =0;i<n;i++) {
    	if(visited[i]==0) {
    		dfs(i,-1);
    	}
    }
    



    System.out.println(ans);

  }
  static void dfs(int node, int parent) {
	  if(visited[node]==2) {
		  return;
	  }
	  if(visited[node]==1) {
		  //backtrack in the cycle
		  int min = value[node];
		  int next=parent;
		  while(next!=node) {
			  min=Math.min(value[next], min);
			  next = backtrack[next];
		  }
		  ans-=min;
		  return;
	  }
	  visited[node]=1;
	  backtrack[node]=parent;
	  dfs(adj[node], node);
	  visited[node]=2;
	  
  }
}