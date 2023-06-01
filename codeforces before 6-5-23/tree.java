import java.util.*;

public class tree {
	static ArrayList<ArrayList<Integer>> adj;
	static int [] levels; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		levels = new int [n];
		adj = new ArrayList<ArrayList<Integer>> ();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=1;i<n;i++) {
			int a = sc.nextInt()-1;
			adj.get(a).add(i);
			adj.get(i).add(a);
		}
		dfs(0,-1,0);
		int count =0;
		for(int i:levels) {
			if(i%2==1)count++;
		}
		System.out.println(count);
	}
	static void dfs(int node, int par, int len) {
		levels[len]++;
		for(int i :adj.get(node)) {
			if(i!=par) {
				dfs(i,node,len+1);
			}
		}
	}
}
