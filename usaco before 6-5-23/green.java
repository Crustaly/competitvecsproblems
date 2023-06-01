import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class green {
	static int [][] pfx ;
	public static void main(String [] args) {
		Kattio sc = new Kattio(System.in, System.out);
		int n = sc.nextInt();
		int [][] below = new int [n][n+1];
		int [][] atmost = new int [n][n+1];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				below[i][j+1] = below [i][j];
				atmost[i][j+1] = atmost [i][j];
				int a = sc.nextInt();
				if(a<100) {
					below[i][j+1]+=1;
				}
				if(a<=100) {
					atmost[i][j+1]+=1;
				}
			}
		}
	
		  long answer = 0;
	        for (int x1 = 0; x1 < n; x1++) {
	            for (int x2 = x1 + 1; x2 <= n; x2++) {
	                int y1 = -1;
	                int y2 = -1;
	                for (int y0 = 0; y0 < n; y0++) {
	                    while (y1 < n && (y1 < y0 || atmost[y1][x2] - atmost[y1][x1] == 0)) {
	                        y1++;
	                    }
	                    while (y2 < n && (y2 < y0 || below[y2][x2] - below[y2][x1] == 0)) {
	                        y2++;
	                    }
	                    answer += y2 - y1;
	                }
	            }
	        }
	        System.out.println(answer);
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
