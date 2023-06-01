import java.util.*;

public class twobarns {
	static ArrayList<ArrayList<Integer>> adj;
	static boolean [] visited;
	static int [] connect;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t =0;t<ts; t++) {
			int n =sc.nextInt();
			int m =sc.nextInt();
			adj = new ArrayList<ArrayList<Integer>>();
			for(int i =0;i<n;i++) {
				adj.add(new ArrayList<Integer>());
			}
			for(int i =0;i<m;i++) {
				int a =sc.nextInt()-1;
				int b =sc.nextInt()-1;
				adj.get(a).add(b);
				adj.get(b).add(a);
			}
			connect = new int [n];
			visited = new boolean [n];
			int comp =1;
			for(int i =0;i<n;i++) {
				if(!visited[i]) {
					dfs(i,comp);
					comp++;
				}
			}
			
			boolean [] con = new  boolean [n-1];
		
			
			int curComp=-1;
			int end=0;
			for(int i =0;i<n-1;i++) {
				if(connect[i]==0||connect[i+1]==0) {
					con[i]=false;
					end = i;
				}
				else if(connect[i]!=connect[i+1]) {
					con[i]=false;
					end = i;
				}
				else if(connect[i]==connect[i+1]) {
					con[i]=true;
				}
			}
			end++;
	
			int start =-100;
			long ans =Long.MAX_VALUE/2;
			boolean found = false;
			for(int i =0;i<n-1;i++) {
				if(con[i]==false&&start==-100) {
					start= i;
				}
				if(con[i]==false) {
				found = true;
				long left = i-start;
				long right = end-i;
				left*=left;
				right*=right;
				ans = Math.min(ans, left+right);
				}
				}
			if(!found) {
				ans =0;
			}
			System.out.println(ans);
			
				
			}
		}
	
	static void dfs(int node, int comp) {
		visited[node]=true;
		for(int i:adj.get(node)) {
			if(!visited[i]) {
				connect[i]=comp;
				connect[node]=comp;
				dfs(i,comp);
			}
		}
	}
}