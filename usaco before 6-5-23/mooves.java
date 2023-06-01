import java.util.*;
import java.io.*;
public class mooves {
static boolean [][] pos;
static int [] cows;
static int [] group;
static int n;
static ArrayList<ArrayList<Integer>> adj; 
static ArrayList<HashSet<Integer>> groups;
static ArrayList<HashSet<Integer>> nodes;
  public static void main(String[] args) throws IOException{
  
	  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	  PrintWriter out=new PrintWriter(System.out);
	  String [] inp = sc.readLine().split(" ");
    n =Integer.parseInt(inp[0]);
    int k  =Integer.parseInt(inp[1]);
    cows = new int [n];
    groups = new ArrayList<HashSet<Integer>>();
    group = new int [n];
  
   nodes=  new ArrayList<HashSet<Integer>>();
    for(int i =0;i<n;i++) {
    	cows[i]=i;
    	nodes.add(new HashSet<Integer>());
    	nodes.get(i).add(i);
    }

    for(int i=0;i<k;i++) {
    	inp = sc.readLine().split(" ");
    	swap(Integer.parseInt(inp[0])-1, Integer.parseInt(inp[1])-1);
    }
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i=0;i<n;i++) {
    	if(i!=cows[i]) {
    		adj.get(cows[i]).add(i);
    	}
    }
    int index=1;
    for(int i=0;i<n;i++) {
    	if(group[i]==0) {
    		groups.add(new HashSet<Integer>());
    		dfs(i,index);
    		index++;
    	}
    }
    for(int i =0;i<n;i++) {
    	out.println(groups.get(group[i]-1).size());
    }
    out.flush();

  }
  static void dfs(int node, int gr) {
	  group[node]=gr;
	  groups.get(gr-1).addAll(nodes.get(node));
	  for(int i:adj.get(node)) {
		  if(group[i]==0) {  
			  dfs(i,gr);
		  }
	  }
	  
  }
  static void swap (int a, int b) {
	  int fil = cows[a];
	  cows[a]=cows[b];
	  cows[b]=fil;
	  nodes.get(cows[a]).add(b);
	  nodes.get(cows[b]).add(a);

  }
}