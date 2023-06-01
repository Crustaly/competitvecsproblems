import java.util.*;
import java.lang.*;
import java.io.*;
public class subordinates {
static ArrayList<ArrayList<Integer>> adj;
static int [] ans;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   
    int n =sc.nextInt();
    adj = new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    ans = new int [n];
    for(int i =0;i<n-1;i++) {
    	int a=sc.nextInt()-1;
    	adj.get(a).add(i+1);
    }
    
    dfs(0,-1);
    for(int i =0;i<ans.length;i++) {
    	System.out.println(ans[i]-1);
    }


  }
  static void dfs(int node, int par) {
	  ans[node]=1;
	  for(int i :adj.get(node)) {
		  if(i!=par) {
			  dfs(i,par);
			  ans[node]+=ans[i];
		  }
	  }
  }


}



