import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class moobuzz {
	static int n;
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(new File("moobuzz.in"));
	    FileWriter file = new FileWriter("moobuzz.out");
	    BufferedWriter output = new BufferedWriter(file);
		 n = sc.nextInt();
		long lo =0;
		long hi =Long.MAX_VALUE/2;
		while(lo<hi) {
			long mid = (lo+hi)/2;
			if(works(mid)) {
				hi = mid;
			}
			else {
				lo = mid+1;
			}
		}
		System.out.println(lo);
		output.write(String.valueOf(lo));
		output.close();
	}
	static boolean works(long mid) {
		long num = mid-(mid/3)-(mid/5)+(mid/15);
		
		if(num<n) {
			return false;
		}
		return true; 
	}
}