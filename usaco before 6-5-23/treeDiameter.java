import java.util.*;
import java.lang.*;
import java.io.*;
public class treeDiameter {
static ArrayList<ArrayList<Integer>> adj;
static boolean [] visited;
static int currDist,e;
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
    currDist=0;
    e=0;
    visited=new boolean [n];
    dfs(0,-1,0);
    currDist=0;
    dfs(e,-1,0);
    System.out.println(currDist);


  }
  static void dfs(int node, int parent, int distance) {
	  if(distance>currDist) {
		  currDist=distance;
		  e=node;
	  }
	 for(int i :adj.get(node)) {
		 if(i!=parent) {
			 dfs(i,node,distance+1);
		 }
	 }
	
  }

}



