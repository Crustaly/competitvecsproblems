import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class bridge {
	static ArrayList<ArrayList<Integer>> adj;
	static boolean [] vis;
	static int poop;
	public static void main(String[] args) {
		Kattio sc = new Kattio(System.in, System.out);
		int n = sc.nextInt();
		int m =sc.nextInt();
		vis = new boolean [n];
		ArrayList<Integer> ans = new ArrayList<Integer>();
		adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i =0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		poop = 0;
		for(int i=0;i<n;i++) {
			if(!vis[i]) {
				dfs(i);
				ans.add(poop);
			}
		}
		System.out.println(ans.size()-1);
		for(int i =1;i<ans.size();i++) {
			System.out.println(ans.get(0)+1+" "+(ans.get(i)+1));
		}
	}
	static void dfs(int node) {
		vis[node]=true;
		poop = node;
		for(int i:adj.get(node)) {
			if(!vis[i])dfs(i);
		}
	}
	 static class Kattio extends PrintWriter {
		    private BufferedReader r;
		    private StringTokenizer st;
		    // standard input
		    public Kattio() { this(System.in, System.out); }
		    public Kattio(InputStream i, OutputStream o) {
		        super(o);
		        r = new BufferedReader(new InputStreamReader(i));
		    }
		    // USACO-style file input
		    public Kattio(String problemName) throws IOException {
		        super(problemName + ".out");
		        r = new BufferedReader(new FileReader(problemName + ".in"));
		    }
		    // returns null if no more input
		    public String next() {
		        try {
		            while (st == null || !st.hasMoreTokens())
		                st = new StringTokenizer(r.readLine());
		            return st.nextToken();
		        } catch (Exception e) { }
		        return null;
		    }
		    public int nextInt() { return Integer.parseInt(next()); }
		    public double nextDouble() { return Double.parseDouble(next()); }
		    public long nextLong() { return Long.parseLong(next()); }
		}
}