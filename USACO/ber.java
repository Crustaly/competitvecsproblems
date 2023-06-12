/*
Time: a VERY LONG time 
Num Submissions: 2
Learnt: Array bounds cause ! error, look for simple and idealistic patterns
Time Complexity: O(N)
Rating: USACO Silver 
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class ber {
	public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner(new File("berries.in"));
	    FileWriter file = new FileWriter("berries.out");
	    BufferedWriter output = new BufferedWriter(file);
	    
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] b = new int [n];
		for(int i =0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		ArrayList<Integer> bas = new ArrayList<Integer>();
		long ans =0;
		for(int i=1;i<1000;i++) {
			bas.clear();
			long sum = 0;
			for(int j=0;j<n;j++) {
				for(int l=0;l<b[j]/i;l++) {
					bas.add(i);
				}
				if(b[j]%i!=0)bas.add(b[j]%i);
			}
			 Collections.sort(bas, Collections.reverseOrder());

			 for(int j=k/2;j<k;j++) {
				 if(j<bas.size())sum+=bas.get(j);
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
		output.write(String.valueOf(ans));
		output.close();
	}
	
}