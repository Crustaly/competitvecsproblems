import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class cowdance{
	static int n;
	static int [] cows;
	static long t;
	public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner(new File("cowdance.in"));
	    FileWriter file = new FileWriter("cowdance.out");
	    BufferedWriter output = new BufferedWriter(file);
		n = sc.nextInt();
		t = sc.nextLong();
		cows = new int [n];
		for(int i =0;i<n;i++) {
			cows[i]=sc.nextInt();
		}
		int lo =0;
		int hi = n+1;
		while(lo<hi) {
			int mid = (lo+hi)/2;
			if(works(mid)) {
				hi=mid;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(lo);
		output.write(String.valueOf(lo));
		output.close();
	}
	static boolean works(int mid) {
		long time =0;
		PriorityQueue<Long> p = new PriorityQueue<Long>();
		for(int i =0;i<n;i++) {
			if(p.size()<mid) {
				p.add((long)cows[i]);
			}
			else {
				p.add(cows[i]+p.poll());
			}
		}
		for(int i=0;i<mid-1;i++) {
			p.poll();
		}
		return p.poll()<=t;
		
	}
}