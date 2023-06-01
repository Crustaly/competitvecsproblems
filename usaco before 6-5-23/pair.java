import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class pair {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	    //Scanner sc = new Scanner(new File("pairup.in"));
	    FileWriter file = new FileWriter("pairup.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		int [][] cows = new int [n][2];
		for(int i =0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			cows[i][0]=a;
			cows[i][1]=b;
		}
		Arrays.sort(cows, (int [] e1, int []e2) -> e1[1]-e2[1]);
		int l =0;
		int r =n-1;
		long max =0;
		while(l<r) {
			max = Math.max(cows[l][1]+cows[r][1],max);
			int min = Math.min(cows[r][0],cows[l][0]);
			cows[l][0]-=min;
			cows[r][0]-=min;
			if(cows[l][0]==0)l++;
			if(cows[r][0]==0)r--;
		}
		System.out.println(max);
		output.write(String.valueOf(max));
		output.close();
	}
}