/*
Time: 26:44 (UNFOCUSED)
Num Submissions: 1
Learnt: Don't forget about edge case where stuff ends at the upper bound
Time Complexity: O(N)
Rating: 1000
*/

import java.util.*;

public class va {
	static long ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t =0;t<ts;t++) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int k = sc.nextInt();
			int [] nums = new int [n+1];
			for(int i =0;i<n;i++) {
				nums[i]=sc.nextInt();
			}
			nums[n] = Integer.MAX_VALUE;
			ans =0;
			int hull =-1;
			//what is a hull idk
			for(int i =0;i<n+1;i++) {
				if(nums[i]>k&&hull!=-1) {
					check(i,hull,q);
					//kill the chain
					hull=-1;
				}
				if(hull==-1&&nums[i]<=k) {
					hull = i;
				}
			}
			System.out.println(ans);
		}
	}
	static void check(int r, int l, int k) {
		int dif = r-l; 
		if(dif<k)return;
		for(int i =k;i<=dif;i++) {
			ans+=dif - i+1;
		}
	}
}