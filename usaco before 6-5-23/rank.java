import java.util.*;
import java.lang.*;
import java.io.*;
public class rank{
static ArrayList<ArrayList<Integer>> adj;
static boolean [] visited;
static boolean works;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<m;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	int aw = sc.nextInt();
    	int bw=sc.nextInt();
    	if(aw>bw) {
    		adj.get(a).add(b);
    	}
    	else {
    		adj.get(b).add(a);
    	}
    }
    
    int ans=0;
    for(int i =0;i<n;i++) {
    	works=false;
    	visited=new boolean [n];
    	dfs(i,i);
    	if(works) {
    		ans++;
    	}
    }



    System.out.println(ans);


  }
  static void dfs(int node,int start) {
	  
visited[node]=true;
	  for(int i:adj.get(node)) {
		  if(i==start) {
			  works=true;
		  }
		  if(!visited[i]) {
	  dfs(i,start);
		  }
	  }
	  return ;
  }
  }






