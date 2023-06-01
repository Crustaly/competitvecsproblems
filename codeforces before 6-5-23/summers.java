import java.util.*;

public class summers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long [] nums = new long [n];
			for(int i =0;i<n;i++) {
				nums[i]=sc.nextLong();
			}
			Arrays.sort(nums);
			long [] psum = new long [n+1];
			psum[0]=0;
			for(int i =0;i<n;i++) {
				psum[i+1]=psum[i]+nums[i];
			}
	
			int l=0;
			int r = n-1;
			long sum =0;
			for(int i =0;i<k;i++) {
				l = i*2;
				r=k+i;
				System.out.println(l+" "+r);
				sum  = Math.max(sum, psum[r]-psum[l]);
			}
			System.out.println(sum);
		}
		
	}
}