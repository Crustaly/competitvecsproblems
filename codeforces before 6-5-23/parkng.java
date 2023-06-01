import java.util.*;
public class parkng {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int c=0;c<t;c++) {
			int n =sc.nextInt();
			int [] nums = new int [n];
			for(int i =0;i<n;i++) {
				nums[i]=sc.nextInt();
			}
			Arrays.sort(nums);
			System.out.println(-2*(nums[0]-nums[n-1]));
		}
	}

}
