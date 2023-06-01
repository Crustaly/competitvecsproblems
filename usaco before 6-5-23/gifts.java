import java.util.*;
import java.lang.*;
import java.io.*;
public class gifts {
static ArrayList<ArrayList<Integer>> adj ;
static boolean [] visited;
static int n; 
static boolean [][] reachable;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
    reachable = new boolean [n][n];
    visited =new boolean [n];
    int [] ans = new int [n];
    adj = new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<>());
    }
    for(int i =0;i<n;i++) {
    	boolean works = true;
    	for(int k=0;k<n;k++) {
    		int a =sc.nextInt(); 	
    		if(works) {
    		adj.get(i).add(a-1);
    		}
    		if(a-1==i) {
    			works = false;
    		}
    	}
    }
    for(int i =0;i<n;i++) {
    	dfs(i,i);
    }

    for(int i =0;i<n;i++) {
    	for(int j:adj.get(i)) {
    		if(reachable[j][i]) {
    			System.out.println(j+1);
    			break;
    		}
    	}
    }
   
    	
    

  }
  static void dfs(int source, int node) {
	  if(reachable[source][node]) {
		  return;
	  }
	  reachable[source][node]=true;
	  for(int i: adj.get(node)) {
		   dfs(source,i);
	  }
  }
 	
  }
