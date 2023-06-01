import java.util.*;

public class journey {
	static ArrayList<ArrayList<Integer>>adj;
	static double ans;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		count=0;
		ans=0;
		adj =new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		dfs(0,-1,1, 0);
		System.out.println(ans);
	}
	static void dfs(int node, int par, double prob, int len) {
		int below =0;
		if(node==0) {
			below = adj.get(node).size();
		}
		else {
			below = adj.get(node).size()-1;
		}
		for(int i:adj.get(node)) {
			if(i!=par) {
			dfs(i,node, prob/below, len+1);
			}
		}
		if(adj.get(node).size()==1) {
			ans+=(prob)*(len);
		}
	}
}