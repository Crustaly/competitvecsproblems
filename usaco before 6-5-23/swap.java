import java.util.*;
import java.lang.*;
import java.io.*;
public class swap{

static int [][] swap ;
static ArrayList<Integer> loc;
static ArrayList<HashSet<Integer>> ans;
static boolean [] visited;
static HashSet<Integer> set;
static HashMap<Integer, Integer> ids;
static int [] ret;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();
    int m =sc.nextInt();
   
    swap = new int [m][2];
    loc = new ArrayList<Integer>();
    ans = new ArrayList<HashSet<Integer>>();

    
    for(int i =0;i<n;i++) {
    	loc.add(i);
    	ans.add(new HashSet<Integer>());
    	ans.get(i).add(i);
    }

    for(int i =0;i<m;i++) {
    	swap [i][0]=sc.nextInt()-1;
    	swap [i][1]=sc.nextInt()-1;
    }
    
	 for(int i =0;i<m;i++) {
		  ans.get(loc.get(swap[i][0])).add(swap[i][1]);
		  ans.get(loc.get(swap[i][1])).add(swap[i][0]);
		  Collections.swap(loc, swap[i][0],swap[i][1]);
	 }

	 visited = new boolean[n];
	 ret = new int [n];
	 ids = new HashMap<Integer, Integer>();
	 set = new HashSet<Integer>();
	 int id = 0;
	 for(int i=0;i<n;i++) {
		 if(!visited[i]) {
			 set.clear();
			 dfs(i, id);
			 ids.put(id, set.size());
			 id++;
		 }
	 }
	 for(int i =0;i<n;i++) {
		 System.out.println(ids.get(ret[i]));
	 }
			  
  }
  static void dfs(int node, int id) {
	  visited[node]=true;
	  ret[node]=id; 
	  set.addAll(ans.get(node));
		  if(!visited[loc.get(node)]) {
			  dfs(loc.get(node),id);
		  }
	  }
  
	 
	}

