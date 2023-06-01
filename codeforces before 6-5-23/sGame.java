import java.util.*;

public class sGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			String s = sc.next();
			StringBuilder a = new StringBuilder();
			for(int i =0;i<s.length();i++) {
				if(i%2==0) {
					if(s.charAt(i)=='a')a.append("b");
					else a.append("a");
				}
				else {
					if(s.charAt(i)=='z')a.append("y");
					else a.append("z");
				}
			}
			System.out.println(String.valueOf(a));
				}
	}
}