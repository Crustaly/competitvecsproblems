import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class weight {
	static ArrayList<ArrayList<Integer>>adj;
	static HashMap<String, Integer> weights;
	static boolean workeroni;
	public static void main(String[] args) {
		
		Kattio sc = new Kattio(System.in, System.out);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			boolean works = true;
			workeroni= true;
			adj = new ArrayList<ArrayList<Integer>>();
			weights = new HashMap<String, Integer>();
			String [] order = new String [n];
			for(int i =0;i<n;i++) {
				adj.add(new ArrayList<Integer>());
			}
			for(int i=0;i<n-1;i++) {
				int a = sc.nextInt()-1;
				int b =sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
			StringBuilder s = new StringBuilder();
			s.append(String.valueOf(a));
			s.append(String.valueOf(b));
			order[i]=String.valueOf(s);
			}
			if(adj.get(0).size()>2) {
				works=false;
			}
			for(int i =1;i<n;i++) {
				if(adj.get(i).size()>2) {
					works=false;
				}
			}
			if(works) {
				dfs(-1,0,2);
				if(workeroni) {
				for(int i =0;i<n-1;i++) {
					System.out.print(weights.get(order[i])+" ");
				}
				System.out.println();
				}
				else {
					System.out.println(-1);
				}
			}
			else{
				System.out.println("-1");
			}
		}
	}
		static void dfs(int par, int cur, int val) {
			StringBuilder s = new StringBuilder();
			s.append(String.valueOf(par));
			s.append(String.valueOf(cur));
			weights.put(String.valueOf(s), val);
			StringBuilder w = new StringBuilder();
			w.append(String.valueOf(cur));
			w.append(String.valueOf(par));
			weights.put(String.valueOf(w), val);
			int value = 5-val;
			int kids =0;
			for(int i:adj.get(cur)) {
				if(i!=par) {
					dfs(cur, i, value);
					value = 5-value;
					kids++;
				}
			}
			if(kids>1&&cur!=0) {
				workeroni=false;
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

	
