import java.util.*;
import java.lang.*;
import java.io.*;
public class mootube {
	static ArrayList<ArrayList<edge>> adj;
	static int k,count;
	static boolean [] visited;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("mootube.in"));
    FileWriter file = new FileWriter("mootube.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int q =sc.nextInt();
    adj=new  ArrayList<ArrayList<edge>> ();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<edge>());
    }
    for(int i =0;i<n-1;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	int c=sc.nextInt();
    	adj.get(a).add(new edge(b,c));
    	adj.get(b).add(new edge(a,c));
    }
    for(int i =0;i<q;i++) {
    	k=sc.nextInt();
    	int b= sc.nextInt()-1;
    	visited=new boolean [n];
    	count=0;
    	dfs(b);
    	System.out.println(count-1);
    }
  }
  static class edge{
	  int t,w;
	  public edge(int a, int b) {
		  t=a;
		  w=b;
	  }
  }
  static void dfs(int node) {
	  visited[node]=true;
	  count++;
	  for(edge i:adj.get(node)) {
		  if(!visited[i.t]&&i.w>=k) {
			  dfs(i.t);
		  }
	  }
  }


}



