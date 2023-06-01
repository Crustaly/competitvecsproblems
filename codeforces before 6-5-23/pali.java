import java.util.*;

public class pali {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			String s = sc.next();
			StringBuilder ans = new StringBuilder();
			ans.append(s);
			for(int i =s.length()-1;i>=0;i--) {
				ans.append(s.charAt(i));
			}
			System.out.println(String.valueOf(ans));
		}
	}
}