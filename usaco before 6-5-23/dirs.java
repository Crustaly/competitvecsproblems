import java.util.*;

public class dirs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int [n+1];
		for(int i =0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		nums[n]=0;
		StringBuilder ans = new StringBuilder();
		int i=0;
		while(nums[0]!=0) {
			while(i<n&&nums[i]>0) {
				ans.append('R');
				nums[i]--;
				i++;
			}
			while(i>0&&nums[i-1]>1) {
				ans.append('L');
				nums[i-1]--;
				i--;
			}
			if(nums[i]==0) {
				while(i>0&&nums[i-1]==1&&nums[i]==0) {
					nums[i-1]--;
					ans.append('L');
					i--;
				}
			}
		}
		System.out.println(String.valueOf(ans));
	}
}