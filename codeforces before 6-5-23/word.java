import java.util.*;

public class word {
	static ArrayList<ArrayList<Integer>>adj;
	static boolean [] visited;
	static int c;
	static char [][] ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String b = sc.next();
		adj = new ArrayList<ArrayList<Integer>>();
		ans= new char [n][2];
		for(int i =0;i<26;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++) {
			adj.get(s.charAt(i)-'a').add(b.charAt(i)-'a');
			adj.get(b.charAt(i)-'a').add(s.charAt(i)-'a');
		}

		c=0;
		visited= new boolean[26];
		for(int i=0;i<26;i++) {
			if(!visited[i]&&adj.get(i).size()!=0) {
				dfs(i,i);
			}
		}
		System.out.println(c);
		for(int i =0;i<c;i++) {
			System.out.println(ans[i][0]+" "+ans[i][1]);
		}
	}
	static void dfs(int node, int par) {
		visited[node]=true;
		for(int i:adj.get(node)) {
			if(!visited[i]) {
				ans[c][0]=(char)(i+'a');
				ans[c][1]=(char)(par+'a');
				c++;
				dfs(i,par);
			}
		}
	}
}