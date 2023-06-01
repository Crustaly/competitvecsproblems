import java.util.*;
import java.lang.*;
import java.io.*;
public class treeDist1{
static ArrayList<ArrayList<Integer>>adj;
static int a,b,dist;
static int [] dista,distb;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<n-1;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    a=0;
    dista=new int [n];
    distb=new int [n];
    dist=0;
    dfs(0,-1,0,-1);
    dist=0;
    dfs(a,-1,0,0);
    dist=0;
    dfs(a,-1,0,1);
    for(int i =0;i<n;i++) {
    	System.out.print(Math.max(dista[i],distb[i])+" ");
    }

  }
  static void dfs(int node,int parent,int len, int care) {
	  if(len>dist&&care!=1) {
		  dist=len;
		  a=node;
	  }
	  if(care==0) {
		  dista[node]=len;
	  }
	  if(care==1) {
		  distb[node]=len;
	  }

	  for(int i:adj.get(node)) {
		  if(i!=parent) {
			  dfs(i,node,len+1,care);
		  }
	  }
  }


}



