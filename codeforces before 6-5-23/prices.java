import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class prices {
	public static void main(String[] args) {
		Kattio sc = new Kattio(System.in, System.out);
		PrintWriter output = new PrintWriter(System.out);
		int n = sc.nextInt();
		int t = sc.nextInt();
		long [] prices = new long [n+1];
		ArrayList<Integer>p =new ArrayList<Integer>();
		for(int i =0;i<n;i++) {
			p.add(sc.nextInt());
		}
		Collections.sort(p);
		for(int i=0;i<n;i++) {
			prices[i+1]=p.get(i)+prices[i];
		}
		for(int ts = 0;ts<t;ts++) {
			int x =sc.nextInt();
			int y =sc.nextInt();
			output.write(String.valueOf(prices[n-x+y]-prices[n-x])+"\n");
		}
		output.close();
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

