import java.util.*;
import java.lang.*;
import java.io.*;
public class robot{
static int [] ans;
static int [][] instructions1;
static int [][] instructions2;
static int xgoal, ygoal; 
static int n;
static ArrayList<Integer> unox;
static ArrayList<Integer> unoy;
static ArrayList<Integer> unosize;
static ArrayList<Integer> dosx;
static ArrayList<Integer> dosy;
static ArrayList<Integer> dossize;
  public static void main(String[] args) throws IOException{
    Kattio sc = new Kattio(System.in,System.out);
    n =sc.nextInt();
    ans = new int [n];
    xgoal = sc.nextInt();
    ygoal = sc.nextInt();
    unox= new ArrayList<Integer>();
    unoy= new ArrayList<Integer>();
    dosx= new ArrayList<Integer>();
    dosy= new ArrayList<Integer>();
    unosize= new ArrayList<Integer>();
    dossize= new ArrayList<Integer>();
    unox.add(0);
    unoy.add(0);
    dosx.add(0);
    dosy.add(0);
    dossize.add(0);
    unosize.add(0);
    if(n%2==0) {
    instructions1 = new int [n/2][2];
    instructions2 = new int [n/2][2];
    for(int i =0;i<n/2;i++) {
    	instructions1[i][0]=sc.nextInt();
    	instructions1[i][1]=sc.nextInt();
    }
    for(int i =0;i<n/2;i++) {
    	instructions2[i][0]=sc.nextInt();
    	instructions2[i][1]=sc.nextInt();
    }
    for(int i =0;i<n;i++) {
    
    	subset(i+1, 0,0,n/2,instructions1,unox, unoy, unosize,0,0);
    	
    }
    for(int i =0;i<n;i++) {
    
    	subset(i+1, 0,0,n/2,instructions2,dosx, dosy,dossize,0,0);

    }
    }
    else {
    	 instructions1 = new int [n/2+1][2];
    	 instructions2 = new int [n/2][2];
    	 for(int i =0;i<n/2+1;i++) {
    	    	instructions1[i][0]=sc.nextInt();
    	    	instructions1[i][1]=sc.nextInt();
    	    }
    	    for(int i =0;i<n/2;i++) {
    	    	instructions2[i][0]=sc.nextInt();
    	    	instructions2[i][1]=sc.nextInt();
    	    }
    	    for(int i =0;i<n;i++) {
    	    
    	    	subset(i+1, 0,0,n/2+1,instructions1,unox, unoy,unosize,0,0);
    	    	
    	    }
    	    for(int i =0;i<n;i++) {
    	    
    	    	subset(i+1, 0,0,n/2,instructions2,dosx, dosy,dossize,0,0);
    	    	
    	    }
    }
    for(int i=0;i<unox.size();i++) {
    	for(int j=0;j<dosx.size();j++) {
    		 if(unox.get(i)+dosx.get(j)==xgoal&&unoy.get(i)+dosy.get(j)==ygoal) {
    			 ans[unosize.get(i)+dossize.get(j)-1]++;
    		 }
    }
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