import java.util.*;

public class bucket {
	static int [] tanks; 
	static int t ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		t = sc.nextInt();
		tanks = new int [n];
		for(int i =0;i<n;i++) {
			tanks[i]=sc.nextInt();
		}
		long lo = 1;
		long hi = Long.MAX_VALUE/2;
		while(lo<hi) {
			long mid = (lo+hi)/2;
			if(check(mid)) {
				hi =mid;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(lo);
	}
	static boolean check(long mid) {
		long total =0;
		for(int i =0;i<tanks.length;i++) {
			total+=Math.floor(mid/tanks[i]);
		}
		return total>=t;
	}
}