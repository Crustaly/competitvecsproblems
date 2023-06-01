import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class vis {
	static int [][] vals;
	static ArrayList<ArrayList<Integer>> adj;
	static String s;
	  public static void main(String[] args) throws IOException{
		    Scanner sc = new Scanner(System.in);
		  //  Scanner sc = new Scanner(new File("milkvisits.in"));
		  //  FileWriter file = new FileWriter("milkvisits.out");
		    //BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		int m = sc.nextInt();
		s = sc.next();
		vals = new int [n+1][3];
		adj = new ArrayList<ArrayList<Integer>>();
		// how to get the one before the first?

		//[0]=the one before
		//[1]=num of g
		//[2]=num of h
		for(int i =0;i<n+1;i++) {
			adj.add(new ArrayList<Integer>());
		} 
		for(int i =0;i<n-1;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			adj.get(a).add(b);
			adj.get(b).add(a);
					}
		dfs(1,0);
		for(int i =0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			char c = sc.next().charAt(0);
			int num =0;
			if(c=='H') {
			num = vals[b][2]-vals[vals[a][0]][2] ;
			}
			else {
				num = vals[b][1]-vals[vals[a][0]][1];
			}
		
			if(num>0) {
				//output.write(String.valueOf(1));
				System.out.println(1);
			}
			else {
				//output.write(String.valueOf(0));
				System.out.println(0);
			}
		}
		//output.close();
	}
	static void dfs(int node, int p) {
		vals[node][0]=p;
		vals[node][1]=vals[p][1];
		vals[node][2]=vals[p][2];
		if(s.charAt(node-1)=='H') {
			vals[node][2]+=1;
			}
		else {
			vals[node][1]+=1;
		}
		for(int i :adj.get(node)) {
			if(i!=p) {
				dfs(i,node);
			}
		}
	}
}