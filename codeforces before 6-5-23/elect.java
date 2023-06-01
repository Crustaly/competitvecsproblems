import java.util.*;
import java.lang.*;
import java.io.*;
public class elect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int [n];
		int total= 0;
		for(int i =0;i<n;i++) {
			nums[i]=sc.nextInt();
			total+=nums[i];
		}
		int pos = 20;
		int round =0;
		boolean ans = false;
		for(int i =round;i<n;i++) {
			int firstDown = 0;
			for(int j=0;j<4;j++) {
				pos+=nums[round];
				if(pos>=100) {
					System.out.println("Touchdown");
					ans = true;
					break; 
				}
				if(pos<=0) {
					System.out.println("Safety");
					ans = true;
					break; 
				}
				firstDown+=nums[round];
				round++;
				if(round>=n||firstDown>=10) {
					break;
				}
			}
			if(ans) 
		{
				break;
		}
			if(firstDown<10) {
				System.out.println("Nothing");
				break;
			}
		}
	}
}
