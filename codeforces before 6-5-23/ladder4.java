import java.util.*;
import java.io.*;
public class ladder4 {
static HashMap<Integer,ArrayList<Integer>> adj;
static int [] index;
static int max =0;
static TreeSet<Integer> visited;
  public static void main(String[] args){
    Kattio sc = new Kattio();

    int n =sc.nextInt();
    index = new int [2*n];
    int count =0;
   
    adj = new HashMap<Integer,ArrayList<Integer>>();

    for(int i =0;i<n;i++) {
    	int a = sc.nextInt();
    	int b =sc.nextInt();
        if(!adj.containsKey(a)) {
        	adj.put(a,new ArrayList<Integer>());
        }
        if(!adj.containsKey(b)) {
        	adj.put(b,new ArrayList<Integer>());
        }
        adj.get(a).add(b);
        adj.get(b).add(a);
   
    }
    visited = new TreeSet<Integer>();
    		
    

    if(adj.get(1)==null) {
    	System.out.println(1);
    }
    else {
    	dfs(1);
        System.out.println(max);
        
    }


  }
static void dfs(int node) {
    max=  Math.max(node, max);
	visited.add(node);
	for(int i: adj.get(node)) {
		if(!visited.contains(i)) {
			dfs(i);
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



