import java.util.*;
import java.lang.*;
import java.io.*;
public class odd {

  public static void main(String[] args) throws IOException{
    Kattio sc = new Kattio(System.in, System.out);
    PrintWriter out=new PrintWriter(System.out);
    int q = sc.nextInt();
    for(int poo =0 ;poo<q;poo++) {
        int n =sc.nextInt();
        int m =sc.nextInt();
        int[] nums = new int [n+1];
        int odd =0;
        for(int i =1;i<=n;i++) {
        	nums[i]=sc.nextInt();
        	if(nums[i]%2==1) {
        		odd++;
        	}
        }
        boolean works = true;
        if(odd<m) {
        	works = false;
        }
        if(odd%2!=m%2) {
        	works = false;
        }
        if(works) {
        	int count =0;
        	out.write("YES\n");
        	for(int i =1;i<=n;i++) {
        		if(nums[i]%2==1&&count<m-1) {
        			count++;
        			out.write(String.valueOf(i+" "));
        		}
        	}
        	out.write(String.valueOf(n+"\n"));
        }
        else out.write("NO\n");
    }
    out.close();
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


