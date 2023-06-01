import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class e {
	public static void main(String[] args) throws IOException {
		Kattio sc = new Kattio (System.in, System.out);
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		int q = sc.nextInt();
		long [] vals = new long [n];
		for(int i =0;i<n;i++) {
			vals[i]=sc.nextLong();
		}
		int [] pars = new int [n];
		pars[0]=-1;
		for(int i=1;i<n;i++) {
			pars[i]= sc.nextInt()-1;
		}
		for(int i =0;i<q;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			long ans =0;
			while(a!=0&&b!=0) {
				ans+=vals[a]*vals[b];
				a=pars[a];
				b=pars[b];
			}
			long beg = vals[0]*vals[0];
			ans+=beg;
			output.write(String.valueOf(ans+"\n"));
			output.flush();
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