import java.util.*;
import java.lang.*;
import java.io.*;
public class barnTree{
static ArrayList<ArrayList<Integer>> adj;
static ArrayList<Integer> uno;
static ArrayList<Integer> dos;
static ArrayList<Long> tres;
static long [] values ;
static long goal;
static long [] subtrees;
  public static void main(String[] args) throws IOException{
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out=new PrintWriter(System.out);
    uno= new ArrayList<Integer>();
    dos= new ArrayList<Integer>();
    tres= new ArrayList<Long>();
    String s = sc.readLine();
    int n = Integer.parseInt(s);
    adj = new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    goal=0;
    values = new long [n];
    String [] str = sc.readLine().split(" ");
    for(int i =0;i<n;i++) {
    	values[i]=Long.parseLong(str[i]);
    	goal += values[i];
    }
    goal/=n;
    for(int i =0;i<n-1;i++) {
    	str = sc.readLine().split(" ");
    	int a =Integer.parseInt(str[0]);
    	int b =Integer.parseInt(str[1]);
    	adj.get(a-1).add(b-1);
    	adj.get(b-1).add(a-1);
    }
    subtrees = new long [n];
   dfs(0,0);
   dfs2(0,0);
    out.write(String.valueOf(uno.size()+"\n"));
    for(int i =0;i<uno.size();i++) {
    	out.write(String.valueOf(uno.get(i)+1+" "));
    	out.write(String.valueOf(dos.get(i)+1+" "));
    	out.write(String.valueOf(tres.get(i)+"\n"));
    }
    out.flush();
  }
  static void dfs(int node, int parent) {
	  subtrees[node]+=values[node]-goal;
	  	  for(int i:adj.get(node)) {
		  if(i!=parent) {
			  dfs(i,node);
			  subtrees[node]+=subtrees[i];
		  }
	  }
  }
  static void dfs2(int node, int par) {
	  //going to bottom that is big
	  //calc ans by moving the extra up
	  for(int i:adj.get(node)) {
		  if(i!=par) {
			  if(subtrees[i]>=0) {
				  dfs2(i,node);
			  }
			  if(subtrees[i]>0) {
			      System.out.println(uno.size()+ "here :D");
				  uno.add(i);
				  dos.add(node);
				  tres.add(subtrees[i]);
			  }
		  }
	  }
	  //moving extra down
	  for(int i:adj.get(node)) {
		  if(i!=par&&subtrees[i]<0) {
			  uno.add(node);
			  dos.add(i);
			  tres.add(-subtrees[i]);
			  dfs2(i, node);
		  }
	  }
  }

}