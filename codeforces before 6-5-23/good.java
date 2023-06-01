import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class good {
	public static void main(String[] args) {
		Kattio sc = new Kattio(System.in, System.out);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n =sc.nextInt();
			int [] nums=  new int [n];
			for(int i =0;i<n;i++) {
				nums[i]=sc.nextInt();
			}
			int l=0;
			int r=0;
			int index = 0;
			int ans=0;
			while(l<=r) {
				index=1;
				if(l==n) {
					break;
				}
				while(r<=n-1&&nums[r]>=index) {
					ans++;
					r++;
					index++;
				}

				l++;
				r=l;
				index=0;
			
		}
			System.out.println(ans);
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
