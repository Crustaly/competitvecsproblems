import java.util.*;

public class rocket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int u =0;
			int d =0;
			int r =0;
			int l =0;
			String s = sc.next();
			for(int i =0;i<s.length();i++) {
				if(s.charAt(i)=='R') {
					r++;
				}
				if(s.charAt(i)=='D') {
					d++;
				}
				if(s.charAt(i)=='U') {
					u++;
				}
				if(s.charAt(i)=='L') {
					l++;
				}
			}
			boolean works = true;
			if(x>0) {
				if(x>r) {
					works = false;
				}
			}
			if(x<0) {
				if(x*-1>l) {
					works = false;
				}
			}
			if(y<0) {
				if(y*-1>d) {
					works = false;
				}
			}
			if(y>0) {
				if(u<y)works = false;
			}
			if(works) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}