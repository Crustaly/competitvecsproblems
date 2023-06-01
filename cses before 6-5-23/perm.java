import java.io.*;
import java.util.*;

public class perm {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		if(n==3||n==2)System.out.println("NO SOLUTION");
		else {
			for(int i =2;i<=n;i+=2)output.write(String.valueOf(i+" "));
			for(int i =1;i<=n;i+=2)output.write(String.valueOf(i+" "));
			
			
		}
		output.flush();
	}
}