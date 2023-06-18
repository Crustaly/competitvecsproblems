/*
Time: 10:03
Num Submissions: 3 (1 of them was trash sub)
Learnt: ArrayList sort is SO GOATED, binary search is great for min/max time related stuff 
Time Complexity: O(N)
Rating: 1400
*/

import java.util.*;

public class toys {
	static ArrayList<Integer> toys;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n =  sc.nextInt();
			toys = new ArrayList<Integer>();
			for(int i =0;i<n;i++) {
				toys.add(sc.nextInt());
			}
			Collections.sort(toys);
			int l=0;
			int h = toys.get(n-1);
			while(l<h) {
				int mid = (l+h)/2;
				if(works(mid)) {
					h = mid;
				}
				else {
					l=mid+1;
				}
			}
			System.out.println(l);
		}
	}
	static boolean works(int mid) {
		long range = 2*mid;
		int start =-1;
		int needed =1;
		for(int i =0;i<toys.size();i++) {
			if(start == -1) {
				start = toys.get(i);
			}
			if(toys.get(i)-start>range) {
				start = toys.get(i);
				needed++;
			}
		}
		return needed<=3;
	}
}