import java.util.*;

public class prepend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n =sc.nextInt();
			int left =0;
			int right =n-1;
			String s = sc.next();
			while(left<=right) {
				if(s.charAt(right)!=s.charAt(left)) {
					n-=2;
					left++;
					right--;
				}
				else {
					break;
				}
			
			}
			System.out.println(n);
		}
		
	}
}