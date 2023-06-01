import java.util.*;
import java.lang.*;
import java.io.*;
public class rocsk{
static ArrayList<ArrayList<Integer>> adj;
static int [] quiet;
static boolean [] visited; 
static int [] ans;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    quiet = new int [n];
    for(int i =0;i<n;i++) {
    	quiet[i]=sc.nextInt();
    }
    ans = new int [n];
    adj = new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    Arrays.fill(ans, Integer.MAX_VALUE);
    for(int i =0;i<m;i++) {
    	int a =sc.nextInt();
    	int b=sc.nextInt();
    	adj.get(b).add(a);
    	for(int j:adj.get(a)) {
    		adj.get(b).add(j);
    	}
    }
    for(int i =0;i<n;i++) {
    visited = new boolean [n];
    dfs(i,i);
    
    }
    for(int i:ans) {
    	System.out.println(i);
    }
   
    	
    }
static void dfs(int root,int node) {
    if(visited[node]) {
    	return;
    }
    visited[node]=true;
    if(quiet[node]<ans[root]) {
    	ans[root]=node;
    }
    for(int i:adj.get(node)) {
    	dfs(root,i);
    }
}
}



