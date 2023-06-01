import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class lifeguards {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("lifeguards.in"));
	    FileWriter file = new FileWriter("lifeguards.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		int [][] lifeguards = new int [n*2][3];
		int [] alone = new int [n];
		int total = 0;
		//time, index, thing
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			lifeguards[2*i][0]=a;
			lifeguards[2*i][1]=i;
			lifeguards[2*i][2]=1;
			lifeguards[2*i+1][0]=b;
			lifeguards[2*i+1][1]=i;
			lifeguards[2*i+1][2]=-1;
		}
		Arrays.sort(lifeguards,(int[] num1,int[] num2)->Integer.compare(num1[0],num2[0]));
		
		HashSet<Integer> active = new HashSet<Integer>();
		int previous=0;
		for(int i=0;i<n*2;i++) {
			 if(active.size()>=1) {
				 //subtracting wrong :(
				 total+=lifeguards[i][0]-previous;
			 }
			 if(active.size()==1) {
				 for(int j:active) {
					 alone[j]=lifeguards[i][0]-previous; 
				 }
			 }
			 if(lifeguards[i][2]==1) {
				 active.add(lifeguards[i][1]);
			 }
			
			 if(lifeguards[i][2]==-1) {
				 active.remove(lifeguards[i][1]);
			 }
			 
			 previous = lifeguards[i][0];
		}
		
		int ans = 0;
		for(int i =0;i<n;i++) {
			ans = Math.max(ans, total-alone[i]);
		}
		System.out.println(ans);
		output.write(String.valueOf(ans));
		output.close();
	}
}
/*
3
5 9
1 4
3 7
*/