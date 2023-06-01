import java.util.*;
import java.lang.*;
import java.io.*;
public class money {
static ArrayList<ArrayList<Integer>> adj;
static int [] money;
static int sum;
static boolean [] visited;
static int n;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
    int m =sc.nextInt();
    adj  =new ArrayList<ArrayList<Integer>> ();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    money = new int [n];
    for(int i =0;i<n;i++) {
    	money[i]=sc.nextInt();
    }
    
    for(int i =0;i<m;i++) {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    visited = new boolean [n];
    boolean works = true;
    for(int i =0;i<n;i++) {
    	if(!visited[i]) {
    		sum =0;
    		dfs(i);
    		if(sum!=0) {
    			works = false;
    		}
    	}
    }
  
    
    if(works) System.out.println("POSSIBLE");
    else System.out.println("IMPOSSIBLE");

  }
  static void dfs(int node) {
	  sum+=money[node];
	  visited[node]=true;
	  for(int i:adj.get(node)) {
		  if(!visited[i]) {
			  dfs(i);
		  }
	  }
  }
}