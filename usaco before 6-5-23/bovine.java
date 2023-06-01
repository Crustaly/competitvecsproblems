import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class bovine {
	static ArrayList<ArrayList<Integer>>adj;
	static boolean [] visited,cycle;
	static int id;
	static int [] ids;
	static HashMap<Integer, Integer>idVals;
	static int cycleCount,cycleSize;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	    //Scanner sc = new Scanner(new File("shuffle.in"));
	    FileWriter file = new FileWriter("shuffle.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		adj = new  ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++) {
			int a = sc.nextInt()-1;
			adj.get(i).add(a);
		}
		visited = new boolean [n];
		int ans =0;
		id =0;
		ids = new int [n];
		idVals =new  HashMap<Integer, Integer>();
		for(int i =0;i<n;i++) { 
			if(!visited[i]) {
				cycleCount=0;
				cycle = new boolean[n];
				dfs(i);

			}
		}
		for(int i =0;i<n;i++) {
			System.out.println(idVals.get(ids[i]));
		}

		
	}
	static void dfs(int node) {
		visited[node]=true;
		ids[node]=id;
		cycle[node]=true;
		cycleCount++;
		int u = adj.get(node).get(0);
		if(cycle[u]) {
			idVals.put(id,cycleCount);
			id++;
			cycleCount=0;
		}
//		else if(u==node) {
//			idVals.put(id,cycleCount);
//			id++;
//			cycleCount=0;
//		}
		else if(!visited[u]) {
			dfs(u);
		}
		}
	}

