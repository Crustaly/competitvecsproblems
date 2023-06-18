import java.util.*;
/*
Time: 1:03:38
Num Submissions: 5 
Learnt: Binary search if you see a pattern
Learnt #2: MATH (1 - i+1) is not the same as (1 - (i+1)) this is soooo obvious but i keep messing it up :(
Learnt #3: To test binary search direction, test numbers below and above the cutoff
Learnt #4: Test LOTS of testcases by code and by hand
Time Complexity: O(nlogn)
Rating: 1300 on atcoder? i'm not sure how rating translates
*/
public class medianP {
	static int [] nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bas = n*2 -1;
		nums = new int [bas];
		int l=0;
		int r=0;
		for(int i =0;i<bas;i++) {
			nums[i]=sc.nextInt();
			r = Math.max(r,nums[i]);
		}
		while(l<r) {
			int m = (l+r+1)/2;
			if(works(m)) {
				l = m;
			}
			else {
				r = m-1;
			}
		}
		System.out.println(l);
		
	}
	static boolean works(int mid) {
		//what if no pair?
		boolean found  = false;
		boolean one = false;
		int oC =0;
		int zC=0;
		int dist=Integer.MAX_VALUE;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]>=mid) {
				oC++;
			}
			else {
				zC++;
			}
			//ones
			if(nums[i]>=mid&&nums[i+1]>=mid) {
				if(Math.min(Math.abs(nums.length/2 - i),Math.abs(nums.length/2 - (i+1)))<dist) {
					dist = Math.min(Math.abs(nums.length/2 - i),Math.abs(nums.length/2 - (i+1)));
					one = true;
					found = true;
				}
			}
			else if(nums[i]<mid&&nums[i+1]<mid) {
				if(Math.min(Math.abs(nums.length/2 - i),Math.abs(nums.length/2 - (i+1)))<dist) {
					dist =Math.min(Math.abs(nums.length/2 - i),Math.abs(nums.length/2 - (i+1)));
					one = false;
					found = true;
				}
			}
		}
		if(nums[nums.length-1]>=mid) {
			oC++;
		}
		else {
			zC++;
		}
		if(!found) {
			if(zC>oC) {
				return false;
			}
			return true;
		}
		else {
			if(one)return true;
			else return false;
		}
	}
}