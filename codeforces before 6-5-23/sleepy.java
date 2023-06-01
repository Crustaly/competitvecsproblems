import java.util.*;

public class sleepy {
	static ArrayList<ArrayList<Integer>> adj;
	static boolean [][] visited;
	static boolean [] cycle;
	static boolean [] out;
	static boolean tie;
	static boolean win;
	static ArrayList<Integer> ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		out = new boolean [n];
		ans = new ArrayList<Integer>();
		visited = new boolean [n][2];
		adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		cycle = new boolean [n];
		for(int i =0;i<n;i++) {
			int a = sc.nextInt();
			for(int j=0;j<a;j++) {
				int b =sc.nextInt();
				adj.get(i).add(b-1);
				out[i]=true;
			}
		}
		int s = sc.nextInt()-1;

		dfs(s,1);
	
		if(tie&&!win) {
			System.out.println("Draw");
		}
		else if(!win) {
			System.out.println("Lose");
		}
	}
	static void dfs(int node, int o) {

		visited[node][o]=true;
		cycle[node]=true;
		ans.add(node+1);
		if(o==0&&!out[node]) {
			System.out.println("Win");
			for(int i:ans) {
				System.out.print(i+" ");
				win = true;
			}
		}
		for(int i:adj.get(node)) {
			if(cycle[i]) {
				tie = true;

			}
			if(!visited[i][(1-o)]&&!win) {
				dfs(i, (1-o));
				
			}
		}
		cycle[node]=false;
		ans.remove(ans.size()-1);
		        
	}
}