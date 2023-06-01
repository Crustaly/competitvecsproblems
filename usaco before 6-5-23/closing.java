import java.util.*;
import java.lang.*;
import java.io.*;
public class closing {
static ArrayList<ArrayList<Integer>> adj;
static boolean [] visited;
static int n;
static boolean[] removed;
static int count ;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("closing.in"));
    FileWriter file = new FileWriter("closing.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    int m =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    visited = new boolean [n]; 
    for(int i =0;i<m;i++) {
    	int a =sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
  
    removed = new boolean [n]; 
  
    for(int i =0;i<n;i++) {
    	int close= sc.nextInt()-1;
    	Arrays.fill(visited,false);
    	
    	count =0;
    	for(int j =0;j<n;j++) {
    		if(!removed[j]) {
    			 dfs(j);
    			 break;
    		}
    	}

    	if(count==n-i) {
    		System.out.println("YES");
    	}
    	else {
    		System.out.println("NO");
    	}
    	removed[close]=true;
        
    }

    //output.write(String.valueOf(ans));

    //output.close();
  }
static void dfs(int node) {
	if(visited[node]||removed[node]) {
		return;
	}
	 count++;
	visited[node]=true;
	for(int i:adj.get(node)) {
			dfs(i);
	}

}

}



