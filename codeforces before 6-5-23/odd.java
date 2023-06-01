import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class odd{
	public static void main(String[] args) {
		Kattio sc = new Kattio(System.in, System.out);
		int t = sc.nextInt();
		for(int ts = 0;ts<t;ts++) {
			int n =sc.nextInt();
			int q =sc.nextInt();
			long [] p = new long[n+1];
			for(int i=0;i<n;i++) {
				p[i+1]= p[i]+sc.nextLong();
			}
			for(int j=0;j<q;j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				boolean evenMid = true;
				int total = b-a+1;
				if(c%2==1&&total%2==1) {
					evenMid = false;
				}
				boolean evenSide = true;
				boolean evenSideR = true;
				if(p[a-1]%2==1)evenSide = false;
				if((p[n]-p[b])%2==1)evenSideR = false;
				if(evenMid&&evenSide&&evenSideR)System.out.println("nO");
				else if(!evenMid&&evenSide&&evenSideR)System.out.println("yES");
				else if(evenMid&&evenSide&&!evenSideR)System.out.println("yES");
				else if(evenMid&&!evenSide&&evenSideR)System.out.println("yES");
				else if(!evenMid&&!evenSide&&!evenSideR)System.out.println("yES");
				else System.out.println("nO");
			}
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