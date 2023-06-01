import java.util.*;

public class cowtag {
static ArrayList<ArrayList<Integer>>adj;
static long ans ;
static boolean [] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		adj = new ArrayList<ArrayList<Integer>>();
		
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		long a =1;
		ans =0;
		for(int i =0;i<n-1;i++) {
			int s = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(s).add(b);
			adj.get(b).add(s);
		}
		visited = new boolean [n];
		dfs(0);
		System.out.println(ans);
	}
	static void dfs(int node) {
		visited[node]=true;
		int children = adj.get(node).size();
		if(node==0)children++;
	
		long a =1;
		while(a<children) {
			ans++;
			a*=2;
		}
		for(int i :adj.get(node)) {
			if(!visited[i]) {
				ans++;
				dfs(i);
			}
		}
	}
}