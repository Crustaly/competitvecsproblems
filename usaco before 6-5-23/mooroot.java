import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class mooroot {
	static ArrayList<ArrayList<Triple<Integer, Integer, Integer, Boolean>>> adj;
	static int [] times, layover;
	static int n,m;
	public static void main(String[] args) {
		Kattio sc = new Kattio(System.in, System.out);
		
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		adj = new ArrayList<ArrayList<Triple<Integer, Integer, Integer, Boolean>>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Triple<Integer, Integer, Integer, Boolean>>());
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int time1= sc.nextInt();
			int place =sc.nextInt()-1
			int time2 = sc.nextInt();
			Triple<Integer, Integer, Integer, Boolean>b = new Triple(time1,place, time2, false);
			for(Triple k:adj.get(a)) {
				if(k.getK()==place&&k.getS()<time2) {
					
				}
			}
			adj.get(a).add(b);
		}
		times = new int [n];
		Arrays.fill(times, -1);
		
		times[0]=0;
		layover= new int [n];
		for(int i=0;i<n;i++) {
			layover[i]=sc.nextInt();
		}
		for(int i =0;i<adj.get(0).size();i++) {
			dfs(i,0);
		}
		for(int i=0;i<times.length;i++) {
			output.write(String.valueOf(times[i]+"\n"));
		}
		output.close();
	}
	static void dfs(int index, int from) {
		if(adj.get(from).get(index).getVis()) {
			return;
		}
		adj.get(from).get(index).visited(true);
		if(times[adj.get(from).get(index).getV()]==-1) {
			times[adj.get(from).get(index).getV()] = adj.get(from).get(index).getS();
		}
		else {
			times[adj.get(from).get(index).getV()]=Math.min(adj.get(from).get(index).getS(), times[adj.get(from).get(index).getV()]);
		}
		for(int i=0;i<adj.get(adj.get(from).get(index).getV()).size();i++) {
			
			if((adj.get(adj.get(from).get(index).getV()).get(i).getK()>=layover[adj.get(from).get(index).getV()]+adj.get(from).get(index).getS())) {
				
				dfs(i, adj.get(from).get(index).getV());
			}
		}
	}
	static class Triple<K, V, S, vis> {
		
		int K ;
		int V ;
		int S;
		boolean vis;

		public Triple(int K, int V, int S, boolean vis) {
			this.K= K;
			this.V= V;
			this.S= S;
			this.vis=vis;
		}
		public void visited(boolean v) {
			this.vis = v;
		}
		public int getK() {
			return K;
		}
		public int getV() {
			return V;
		}
		public int getS() {
			return S;
		}
		public boolean getVis() {
			return vis;
		}
		public String toString() {
			return K+" "+V+" "+S+" "+" "+vis;
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

