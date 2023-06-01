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

public class inter {
	static long poo;
	static int n;
	static int [] nums;
	static long [] psum;
	public static void main(String[] args) throws IOException{
		Kattio sc = new Kattio(System.in, System.out);
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			n =sc.nextInt();
			int lo =1;
			int hi = n;
			nums = new int [n];
			psum = new long [n+1];
			psum[0]=0;
			for(int i =0;i<n;i++) {
				nums[i]=sc.nextInt();
				psum[i+1]=psum[i]+nums[i];
			}
			
			
			while(lo<hi){
				int mid = (lo+hi)/2;
				output.write("? "+(mid));
				
				for(int k=1;k<=mid;k++) {
					output.write(" "+k);
				}
				output.write("\n");
				output.flush();
				poo = sc.nextLong();
				if(works(mid)){
				hi=mid;
				}
				else{
				lo=mid+1;
				}
				}
				output.write("! "+lo+"\n");
				output.flush();
		}
		}
	
		static boolean works(int a) {
			long ret = psum[a];
			if(poo>ret) {
				return true;
			}
			return false;
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