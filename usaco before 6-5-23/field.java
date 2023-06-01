import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class field {
	public static void main(String[] args) {
		Kattio sc = new Kattio(System.in, System.out);
		int c = sc.nextInt();
		int n =sc.nextInt();
		ArrayList<String> cows= new ArrayList<String>();
		TreeSet<Integer>skip = new TreeSet<Integer>();
		int [] ans = new int [n];
		for(int i =0;i<n;i++) {
			cows.add(sc.next());
		}
		for(int i =0;i<n;i++) {
	
			ArrayList<Integer> m = new ArrayList<Integer>();
			int max = 0;
			for(int j=i+1;j<n;j++) {
				int dif =0;
				for(int k =0;k<c;k++) {
					if(cows.get(i).charAt(k)!=cows.get(j).charAt(k)) {
					dif++;
					}
				}
				if(dif>max) {
					m.clear();
					m.add(j);
					max = dif;
				}
				else if(dif==max) {
					m.add(j);
				}
				//give max to all in m and also i
			}
			for(int b:m) {
				ans[b]=Math.max(max, ans[b]);
			}
			m.clear();
			ans[i]=Math.max(max, ans[i]);

		}
		for(int i:ans) {
			System.out.println(i);
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