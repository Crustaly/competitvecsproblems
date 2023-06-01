import java.util.*;

public class basketball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target =sc.nextInt();
		int [] nums = new int [n];
		for(int i =0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		Arrays.sort(nums);
		int teams =0;
		int index = n-1;
		int left =n;
		while(true) {
			int amount=0;
			
			while(amount<=target&&left>0) {
				left--;
				amount+=nums[index];
			}
			if(left>=0&&amount>target) {
				teams++;
			}
			if(left==0) {
				break;
			}
			
			index--;
		}
		System.out.println(teams);
	}
}