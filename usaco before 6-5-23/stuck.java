import java.util.*;
import java.lang.*;
import java.io.*;
public class stuck{
static boolean []stopped;
static ArrayList<ArrayList<Integer>> adj;
static boolean []visited;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    ArrayList <Integer> east = new ArrayList<Integer>();
    ArrayList <Integer> north = new ArrayList<Integer>();
    adj=new ArrayList<ArrayList<Integer>>();

    stopped = new boolean [n];
    visited = new boolean [n];
    Arrays.fill(visited, false);
    System.out.println(ans);

  }
  static void dfs(int node) {
	  if(visited[node]) return;
	  visited[node]=true;
	  for(int i: adj.get(node)) {
		  dfs(i);
	  }
	  
  }


}



