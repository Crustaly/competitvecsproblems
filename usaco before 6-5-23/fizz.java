import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class fizz {
	public static void main(String[] args) throws IOException{
		  Scanner sc = new Scanner(new File("moobuzz.in"));
		    FileWriter file = new FileWriter("moobuzz.out");
		    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		long lo =0;
		long hi =Long.MAX_VALUE/2;
		while(lo<hi) {
			long mid = (lo+hi)/2;
			if(check(n,mid)) {
				hi = mid;
			}
			else {
				lo = mid+1;
			}
		}
		output.write(String.valueOf(lo));
		output.close();
	}
	static boolean check(long target, long value) {
		if(value - value/3 - value/5+value/15 >=target) {
			return true;
		}
		else {
			return false;
		}
	}
}