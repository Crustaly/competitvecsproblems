import java.util.*;
import java.io.*;
public class milkVisits {
	static ArrayList<ArrayList<Integer>>adj;
	static char [] breed;
	static int g,h;
	static boolean works ;
	static boolean [] visited;
	static BufferedWriter output;
	static int [] comps;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("milkvisits.in"));
		FileWriter file = new FileWriter("milkvisits.out");
		output = new BufferedWriter(file);
		int n = sc.nextInt();
		int m = sc.nextInt();
		adj = new  ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		breed = sc.next().toCharArray();
		for(int i =0;i<n-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(b).add(a);
			adj.get(a).add(b);
		}
		comps = new int [n];
		int tit =0;
		for(int i =0;i<n;i++) {
			if(comps[i]==0) {
				tit++;
				dfs(i,tit);
			} 
		}
		for(int i=0;i<m;i++) {
			int a =sc.nextInt()-1;
			int b =sc.nextInt()-1;
			char c=sc.next().charAt(0);
			if(breed[a]==c||comps[a]!=comps[b]) {
				output.write("1");

			}
			else 
				{output.write("0");

				}
				
		}
		
		output.close();
		
	}
	static void dfs(int i, int tit) {
	comps[i]=tit;
	for(int j:adj.get(i)) {
		if(breed[i]==breed[j]&&comps[j]==0) {
			dfs(j,tit);
		}
	}
	
}
}
