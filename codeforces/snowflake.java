/*
Time: an embarrassingly long time 
Num Submissions: 2 
Learnt: Think mathy, think simple
Time Complexity: O(N)
Rating: 1300
*/


import java.util.*;

public class snowflake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] degree = new int [n];
		for(int i =0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			degree[a]++;
			degree[b]++;
		}
		Arrays.sort(degree);
	
		int count=0;
		for(int i = 0;i<n;i++) {
			if(degree[i]==1)count++;
		}
		int x= m-count;
		 System.out.println(x+" "+count/x);
	}
	}
}