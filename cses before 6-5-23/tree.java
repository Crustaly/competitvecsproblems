import java.util.*;
import java.lang.*;
import java.io.*;
public class tree {
	static boolean []visited;
	static  ArrayList<ArrayList<Integer>>adj;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    	}
    for(int i =0;i<n;i++) {
    	int a=sc.nextInt()-1;

    	adj.get(a).add(i);
 
    	adj.get(i).add(a);
    }
    visited=new boolean [n];
    int trees =0;
    for(int i =0;i<n;i++) {
    	for(int j:adj.get(i)) {
    		if(!visited[j]) {
    			dfs(j);
    			
    			trees++;
    		}
    	}
    }
    System.out.println(trees);




  }
 static void dfs(int node) {
	 if(visited[node]) {
		 return;
	 }
visited[node]=true;

for(int i:adj.get(node)) {
	dfs(i);
}
 }


}



