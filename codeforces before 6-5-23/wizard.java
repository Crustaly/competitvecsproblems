import java.util.*;
public class wizard{
static ArrayList<ArrayList<Integer>>adj;
static long total;
static boolean[] visited;
static int [] values; 
static ArrayList<Integer>tooPoor;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    tooPoor = new ArrayList<Integer>();
    adj = new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<m;i++) {
    	int a = sc.nextInt()-1;
    	int b = sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    	
    }
    values = new int [n];
    for(int i =0;i<n;i++) {
    	values [i]=sc.nextInt();
    }
    visited= new boolean [n];
    total+=values[0];
    dfs(0);
    Collections.sort(tooPoor);
    int index =0;
    boolean works = true;
    while(works&&index<tooPoor.size()) {
    	if(total>tooPoor.get(index)) {
    		total+=tooPoor.get(index);
    		index++;
    	}
    	else {
    		works = false;
    	}
    }
    System.out.println(total);
    
  
  }
static void dfs(int node) {
	visited[node]=true;
	for(int i:adj.get(node)) {
		if(values[i]<total&&!visited[i]) {
			if(values[i]<total) {
			total +=values[i];
			}
			else {
				tooPoor.add(values[i]);
			}
			dfs(i);
		}
	}
}
}