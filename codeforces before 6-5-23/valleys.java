import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class valleys {
	static int n;
	static int [] nums;
	public static void main(String[] args) {
		Kattio sc = new Kattio (System.in, System.out);
		int ts = sc.nextInt();
		for(int t =0;t<ts;t++) {
			n=sc.nextInt();
			nums = new int [n];
			for(int i=0;i<n;i++) {
				nums[i]=sc.nextInt();
			}
			if(solve()) {
				System.out.println("YeS");
			}
			else {
				System.out.println("nO");
			}

			}
		}
	static boolean solve() {
		int count =0;
		int l=0;
		int r=0;
			
			while(l<=r) {
				
					if((l==0||nums[l]<nums[l-1])&&(r==n-1||nums[r]<nums[r+1])) {
						count++;
						if(count>=2)return false;
					}
					if(l==n-1) {
						break;
					}
				if(r!=n-1&&nums[l]==nums[r+1]) {
					r++;
				}
				else {
				 l=Math.max(l+1, r);
				 r=l;
				}
				
			}
		
		if(count==1){
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

	
