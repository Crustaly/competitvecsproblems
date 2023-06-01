import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class viss {
	static ArrayList<ArrayList<Integer>> adj;
	static int [] comp;
	static boolean [] visited;
	static char [] cs;
	public static void main(String[] args) throws IOException{
	    //Scanner sc = new Scanner(System.in);
	    Scanner sc = new Scanner(new File("milkvisits.in"));
	    FileWriter file = new FileWriter("milkvisits.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		int m = sc.nextInt();
		comp = new int [n];
		visited = new boolean [n];
		adj = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		cs= sc.next().toCharArray();
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		int c = 0;
		for(int i =0;i<n;i++) {
			if(!visited[i]) {
				dfs(i, c, cs[i]);
				c++;
			}
		}
		for(int i =0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			char d = sc.next().charAt(0);
			if(comp[a]!=comp[b]||cs[b]==d) {
			
				output.write(String.valueOf(1));
			}
			else {
		
				output.write(String.valueOf(0));
			}
		}
		output.close();
	}
	static void dfs(int node, int c, char poo) {
		comp[node]=c;
		visited[node]=true;
		for(int i:adj.get(node)) {
			if(!visited[i]&&poo==cs[i]) {
				dfs(i,c,poo);
			}
			
		}
	}
}