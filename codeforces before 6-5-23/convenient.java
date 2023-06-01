import java.util.*;

public class convenient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] times=  new int [n];
		for(int i =0;i<n;i++) {
			times[i]=sc.nextInt();
		}
		int s = sc.nextInt();
		int f = sc.nextInt();
		int ans =1;
		int nums = f-s;
		int sum =0;
		int max =0;
		if(n<=nums) {
			ans =1;
		}
		else {
			for(int i =0;i<nums;i++) {
				sum+=times[i];
			}
			if(sum>max) {
				ans=1;
				max = sum;
			}
			for(int i =nums;i<n;i++) {
				sum = (sum-times[i-nums])+times[i];
				if(sum>max) {
					ans=i;
					max = sum;
				}
			}
		}
		int need = (s-ans);
			if(need<=0) {
				need=n-ans;
			}
		System.out.println(need);
	}
}