import java.util.*;
import java.lang.*;
import java.io.*;
public class journey {
static ArrayList<ArrayList<Integer>> adj;
static int endlen,endnum;
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
    dfs(0,-1);
    System.out.print( (double)endlen/endnum);


  }
  static void dfs(int node,int parent) {
	  boolean found = false;
	  for(int i:adj.get(node)) {
		  if(i!=parent) {
			  found=true;
			  dfs(i,node);
			  endlen++;
		  }
	  }
	  if(!found) {
		  endnum++;
	  }

  }
  


}



