import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class hps {
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(new File("hps.in"));
	    FileWriter file = new FileWriter("hps.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		int [] p =new int [n+1];
		int [] h =new int [n+1];
		int [] s =new int [n+1];
		sc.nextLine();
		for(int i =0;i<n;i++) {
			p[i+1]=p[i];
			h[i+1]=h[i];
			s[i+1]=s[i];
			String st =sc.nextLine();
			if(st.equals("S")) {
				s[i+1]++;
			}
			
			if(st.equals("P")) {
				p[i+1]++;
			}
			if(st.equals("H")) {
				h[i+1]++;
			}
		}
		int max =0;
		for(int i =1;i<n+1;i++) {
			max = Math.max(max, h[i]+p[n]-p[i]);
			max = Math.max(max, s[i]+p[n]-p[i]);
			max = Math.max(max, s[i]+h[n]-h[i]);
			max = Math.max(max, p[i]+h[n]-h[i]);
			max = Math.max(max, p[i]+s[n]-s[i]);
			max = Math.max(max, h[i]+s[n]-s[i]);
		}
		System.out.println(max);
		output.write(String.valueOf(max));
		output.close();
	}
}