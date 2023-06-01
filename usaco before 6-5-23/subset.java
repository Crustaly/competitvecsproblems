import java.util.*;
import java.lang.*;
import java.io.*;
public class subset{

  public static void main(String[] args) throws IOException{
    Kattio sc = new Kattio(System.in, System.out);
    String s = sc.next();
    String t= sc.next();
    int [] counts = new int [18];
    int [] countt = new int [18];
    boolean [][] same = new boolean[18][18];
 
    for(int i =0;i<s.length();i++) {
   	counts[s.charAt(i)-'a']++;    	
   }
    for(int i =0;i<t.length();i++) {   	
       	countt[t.charAt(i)-'a']++;
       }
   
    for(int i =0;i<18;i++) {
    	for(int j =i+1;j<18;j++) {
    		 StringBuilder str = new StringBuilder();
    		for(int k =0;k<s.length();k++) {
    			if(s.charAt(k)==i+'a') {
    				str.append((char)i+'a');
    			}
    			if(s.charAt(k)==j+'a') {
    				str.append((char)j+'a');
    			}
    		}
    		
    		StringBuilder pp = new StringBuilder();
    		for(int k =0;k<t.length();k++) {
    			if(t.charAt(k)==i+'a') {
    				pp.append((char)i+'a');
    			}
    			if(t.charAt(k)==j+'a') {
    				pp.append((char)j+'a');
    			}
    		}
    		same[i][j] = str.toString().equals(pp.toString());
    	}
    }
    int q=sc.nextInt();
    for(int i =0;i<q;i++) {
    	boolean works =true;
    	String ca = sc.next();

    	for(int j=0;j<ca.length();j++) {
    		if(counts[ca.charAt(j)-'a']!=countt[ca.charAt(j)-'a']) {
    			works = false; 
    			break;
    		}
    	}
    	for(int j =0;j<ca.length();j++) {
    		for(int k=j+1;k<ca.length();k++) {
    		
    		
    			if(!same[ca.charAt(k)-'a'][ca.charAt(j)-'a']&&!same[ca.charAt(j)-'a'][ca.charAt(k)-'a']) {
    				works = false;
    				break;
    			}
    		}
    		
    	}
    	if(works) {
    		System.out.print("Y");
    	}
    	else {
    		System.out.print("N");
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