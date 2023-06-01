import java.util.*;
import java.lang.*;
import java.io.*;
public class wormholeSort {
static ArrayList<ArrayList<Integer>> adj;
static int[] visited;
static int [] locs;
static int n,m;
static int [][] data;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("wormsort.in"));
    FileWriter file = new FileWriter("wormsort.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    m =sc.nextInt();
    //count of index has to be equal to count of current value at index
    // if value is same as idnex, guaranteed that count works
    locs = new int [n];
    for(int i =0;i<n;i++) {
    	locs[i]=sc.nextInt()-1;
    }
    boolean allE=true;
     for(int i =0;i<n;i++) {
    	 if(locs[i]!=i) {
    		 allE=false;
    	 }
     }
     if(allE) {
    	 System.out.println(-1);
     }
     else {
  
    data=new int [m][3];
    int r=0;
    for(int i =0;i<m;i++) {
    	data[i][0]=sc.nextInt()-1;
    	data[i][1]=sc.nextInt()-1;
    	data[i][2]=sc.nextInt();
    	r=Math.max(r, data[i][2]);
    }
    int l=0;
    while(l<r) {
    	int mid=(l+r+1)/2;
    	if(works(mid)) {
    		l=mid;
    	}
    	else {
    		r=mid-1;
    	}
    }

   
    System.out.println(l);
    

    output.write(String.valueOf(l));

    output.close();
  }
  }
  static boolean works(int size) {
	  adj=new ArrayList<ArrayList<Integer>>();
	  for(int i =0;i<n;i++) {
		  adj.add(new ArrayList<Integer>());
	  }
	  for(int i =0;i<m;i++) {
		  if(data[i][2]>=size) {
			  adj.get(data[i][0]).add(data[i][1]);
			  adj.get(data[i][1]).add(data[i][0]);
		  }
	  }
	  int num=1;
	  visited=new int [n];
	  for(int i =0;i<n;i++) {
		  if(visited[i]==0) {
		  dfs(i,num);
		  num+=69;
		  }
	  }
	  for(int i =0;i<n;i++) {
		  if(visited[i]!=visited[locs[i]]) {
			  return false;
		  }
	  }
	
	  return true;
  }
  static void dfs(int node, int count) {
	  visited[node]=count;
	  for(int i:adj.get(node)) {
		  if(visited[i]==0) {
			  dfs(i,count);
		  }
	  }
  }


}



