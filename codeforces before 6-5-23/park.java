import java.util.*;

public class park {
	static ArrayList<ArrayList<Integer>> adj ;
	static int count =0;
	static int m;
	static int [] cat;
	static int cats;
	static boolean [] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		m = sc.nextInt();
		adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		visited = new boolean [n];
		cat = new int [n];
		for(int i =0;i<n;i++) {
			cat[i]=sc.nextInt();
		}
		for(int i =0;i<n-1;i++) {
			int a =sc.nextInt()-1;
			int b =sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		dfs(0,0,-1,0);
		System.out.println(count);
	}
	static void dfs(int node, int cats, int par, int catMax) {
		visited[node]=true;
		if(cat[node]==1) {
			cats++;
		}
		if(cat[node]==0) {
			catMax = Math.max(cats, catMax);
			cats=0;
		}
		if(adj.get(node).size()==1) {
			catMax = Math.max(cats, catMax);
			if(catMax<=m&&visited[adj.get(node).get(0)]) {
				count++;
			}
		}
		for(int i: adj.get(node)) {
			if(i!=par) {
				dfs(i,cats,node,catMax);
			}
		}
	}
}