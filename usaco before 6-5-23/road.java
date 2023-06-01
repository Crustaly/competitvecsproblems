import java.util.*;
import java.lang.*;
import java.io.*;
public class road {
static boolean [] visited;
static ArrayList<ArrayList<Integer>> roads;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    roads= new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) roads.add(new ArrayList<Integer>());
    	
    for(int i =0;i<m;i++) {
    	int a =sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	roads.get(a).add(b);
    	roads.get(b).add(a);
    }
    visited = new boolean [n];
    int count =0;
    for(int i =0;i<n;i++) {
    	if(!visited[i]) {
    		dfs(i);
    		count++;
    	}
    }

    System.out.println(count-1);

  }
  static void dfs(int node) {
	  if(visited[node]) {
		  return;
	  }
	  visited[node]=true;
	  for(int poo:roads.get(node)) {
		  dfs(poo);
	  }
  }


}



