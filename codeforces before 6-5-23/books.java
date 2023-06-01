import java.util.*;

public class books {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t= sc.nextInt();
		long sum =0;
		int [] books = new int [n];
		for(int i=0;i<n;i++) {
			books[i]=sc.nextInt();
		}
		int l=0;
		int r=0;
		int ans =0;
		//if first num is out of range
		while(l<=r&&r<n) {

			if(r==l&&books[r]>t) {
				r++;
				l++;
				continue;
			}
			if(sum+books[r]<=t) {
				sum+=books[r];
				r++;
			}
			
			else {
				sum-=books[l];
				l++;
			}
			ans = Math.max(ans, r-l);
		}
		System.out.println(ans);
	}
}
/*1 10 1

4 5
3 1 2 1
*/