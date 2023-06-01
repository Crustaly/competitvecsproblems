import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class grassplant {
	static ArrayList<ArrayList<Integer>>adj;
	public static void main(String[] args) throws IOException {
		
		 Scanner sc = new Scanner(new File("planting.in"));
		    FileWriter file = new FileWriter("planting.out");
		    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		adj = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i =0;i<n-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		int max=0;
		for(int i =0;i<n;i++) {
			max = Math.max(max, adj.get(i).size());
		}
		output.write(String.valueOf(max+1));
		output.close();
	}
}