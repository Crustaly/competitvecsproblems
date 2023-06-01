import java.util.*;
import java.lang.*;
import java.io.*;
public class notime {

  public static void main(String[] args) throws IOException{
    Kattio sc = new Kattio (System.in, System.out);

    int n =sc.nextInt();
    int q =sc.nextInt();
    String s = sc.next();
    int [] prefix = new int [n+1];
    int [] suffix = new int [n+1];
    Stack<Integer> strokes = new Stack<Integer>();
    for(int i =0;i<s.length();i++) {
    	prefix[i+1]+=prefix[i];
    	int stroke =s.charAt(i)-'A';
    	if(strokes.empty()||stroke>strokes.peek()) {
    		strokes.add(stroke);
    		prefix[i+1]++;
    	}
    	else if(stroke<strokes.peek()) {
    		boolean found = false;
    		while(!strokes.empty()&&stroke<strokes.peek()) {
    			strokes.pop();
    			if(!strokes.empty()&&stroke==strokes.peek()) {
    				found=true; 
    				break;
    			}
    		}
    		if(!found) {
    			strokes.add(stroke);
    			prefix[i+1]++;
    		}
    	}
    }
    strokes.clear();
    for(int i =s.length();i>0;i--) {
    	suffix[i-1]+=suffix[i];
    	int stroke =s.charAt(i-1)-'A';
    	if(strokes.empty()||stroke>strokes.peek()) {
    		strokes.add(stroke);
    		suffix[i-1]++;
    	}
    	else if(stroke<strokes.peek()) {
    		boolean found = false;
    		while(!strokes.empty()&&stroke<strokes.peek()) {
    			strokes.pop();
    			if(!strokes.empty()&&stroke==strokes.peek()) {
    				found=true; 
    				break;
    			}
    		}
    		if(!found) {
    			strokes.add(stroke);
    			suffix[i-1]++;
    		}
    	}
    }


    for(int i =0;i<q;i++) {
    	int x= sc.nextInt();
    	int y =sc.nextInt();
    	System.out.println(prefix[x-1]+suffix[y]);
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



