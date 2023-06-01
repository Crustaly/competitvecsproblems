import java.util.*;

public class alt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int ts = 0;ts<t;ts++) {
			int n =sc.nextInt();
			int [] code = new int [26];
			String s = sc.next();
			//even is 1
			//odd is 2
			boolean works = true;
			for(int i =0;i<n;i++) {
				int in = s.charAt(i)-'a';
				if(i%2==0&&code[in]==0) {
					code[in]=1;
				}
				if(i%2==1&&code[in]==0) {
					code[in]=2;
				}
				else if(i%2==1&&code[in]==1) {
					works = false;
				}
				else if(i%2==0&&code[in]==2) {
					works = false;
				}
			}
			if(works)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}