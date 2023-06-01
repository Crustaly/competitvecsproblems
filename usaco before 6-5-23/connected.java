import java.util.*;
import java.lang.*;
import java.io.*;
public class connected {
static ArrayList<ArrayList<Integer>>adj;
static boolean [] visited;
static int s,b;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    for(int cas=0;cas<t;cas++) {
    	
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	if(cas==11) {
    		System.out.println(n+" "+m);
    	}
    	adj=new ArrayList<ArrayList<Integer>>();
    	for(int i =0;i<n;i++) {
    		adj.add(new ArrayList<Integer>());
    	}
    	for(int i =0;i<m;i++) {
    		int a=sc.nextInt()-1;
    		int b=sc.nextInt()-1;
    		adj.get(a).add(b);
    		adj.get(b).add(a);
    	}
    	List<Pair> comps=new ArrayList<Pair>();
    	int start=0;
    	int end=0;
    	visited=new boolean [n];
    	for(int i =0;i<n;i++) {
    		if(!visited[i]) {
    			s=n;
    			b=0;
    			dfs(i);
    			comps.add(new Pair(s,b));
    			if(s==0) {
    				start=b;
    			}
    			if(b==n-1) {
    				end=s;
    			}
  		}
    	}
    	int ans=n;

 

    	for(Pair i:comps) {
    		int d1=Math.max((i.a-start),0);
    		d1*=d1;
    	    int d2=Math.max((end-i.b),0);
    	    d2*=d2;
    		ans=Math.min(ans,d1+d2);
    	}
    	
    	 System.out.println(ans);
    }
   

  }static class Pair{
	  int a,b;
	  public Pair(int c,int d) {
		  a=c;
		  b=d;
	  }
  }
  static void dfs(int node) {
	  if(node>b) {
		  b=node;
	  }
	  if(node<s) {
		  s=node;
	  }
	  visited[node]=true;
	  for(int i:adj.get(node)) {
		  if(!visited[i]) {
			  dfs(i);
		  }
	  }
  }


}



