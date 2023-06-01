import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class cow {
	  public static void main(String[] args) throws IOException{
		 //   Scanner sc = new Scanner(System.in);
		   Scanner sc = new Scanner(new File("outofplace.in"));
		    FileWriter file = new FileWriter("outofplace.out");
		    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		int [] cows = new int [n];
		int [] sort = new int [n];
		int loc =-1;
		int act =0;
		boolean big  = true;

		for(int i=0;i<n;i++) {
			cows[i]=sc.nextInt();
			sort[i]=cows[i];
		}
		Arrays.sort(sort);
		HashSet<Integer> dif = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			if(cows[i]!=sort[i])dif.add(cows[i]);
		}
		System.out.println(dif.size()-1);
	output.write(String.valueOf(dif.size()-1));
	output.close();
	}
}