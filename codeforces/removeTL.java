import java.util.*;
/*
 
This solution time: 5:01
Total Time: 50:50, but i restarted 
Num Submissions: 3, 1 real
Learnt: Think smart, MLE is a problem on CF too?
Time Complexity: O(N)
Rating: 1200
*/
public class removeTL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			String s = sc.next();
			int ans = s.length()-2;
			for(int i=1;i<n-1;i++) {
				if(s.charAt(i-1)==s.charAt(i+1)) {
					ans--;
				}
			}
			System.out.println(ans+1);
		}
	}
}