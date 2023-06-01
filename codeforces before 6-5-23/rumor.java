import java.util.*;
public class rumor {
	static ArrayList<ArrayList<Integer>>adj;
	static int [] vals;
	static boolean [] visited;
	static int min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		vals = new int [n];
		for(int i =0;i<n;i++) {
			vals[i]=sc.nextInt();
		}
		adj=new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i =0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		visited = new boolean [n];
		int ans =0;
		min=0;
		for(int i =0;i<n;i++) {
			if(!visited[i]) {
				min = Integer.MAX_VALUE;
				dfs(i);
				ans+=min;
			}
		}
		System.out.println(ans);
		
		
	}
	static void dfs(int node) {
		visited[node]=true;
		min = Math.min(min, vals[node]);
		for(int i:adj.get(node)) {
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
}