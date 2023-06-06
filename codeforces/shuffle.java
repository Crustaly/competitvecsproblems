/*
 Time: 14:20
 Num Submissions: 1
 Learnt: Think simple, fully walk yourself through the problem and see connections between the chronological nature of the problem
 Time Complexity: O(N)
 Rating: 1300
*/

import java.util.*;

public class shuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int m = sc.nextInt();
			int L=x;
			int R=x;
			for(int i =0;i<m;i++) {
				int l=sc.nextInt();
				int r=sc.nextInt();

				if((l<=L&&r>=R)||(l<=R&&l>=L)||(r>=L&&r<=R)) {
					L=Math.min(l, L);
					R=Math.max(r, R);
				}
			}
			System.out.println(R-L+1);
		}
	}
}