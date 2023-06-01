import java.util.*;
import java.lang.*;
import java.io.*;
public class cowOp{

  public static void main(String[] args) throws IOException{
    Kattio sc = new Kattio(System.in, System.out);

    String s = sc.next();
    int n = s.length();
    int q = sc.nextInt();
    
    int [] c = new int [n+1];
    int [] o = new int [n+1];
    int [] w = new int [n+1];
    for(int i =0;i<n;i++) {
        c[i+1]=c[i];
        o[i+1]=o[i];
        w[i+1]=w[i];
    	if(s.charAt(i)=='C') {
    		c[i+1]++;
    	}
    	if(s.charAt(i)=='O') {
    		o[i+1]++;
    	}
    	if(s.charAt(i)=='W') {
    		w[i+1]++;
    	}
    }
    for(int i=0;i<q;i++) {
    	int st =sc.nextInt();
    	int e =sc.nextInt();
    	int ccount = c[e]-c[st-1];
    	int ocount = o[e]-o[st-1];
    	int wcount = w[e]-w[st-1];
    	if((ccount+wcount)%2==1&&(ocount+wcount)%2==0) {
    		System.out.print('Y');
    	}
    	else {
    		System.out.print('N');
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