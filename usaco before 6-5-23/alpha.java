import java.io.PrintWriter;
import java.util.*;

public class alpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		boolean[][] same = new boolean [18][18];
		String s = sc.next();
		String y = sc.next();
		for(int i =0;i<18;i++) {
			for(int j=i;j<18;j++) {
				StringBuilder str1 = new StringBuilder();
				for(int k = 0;k<s.length();k++) {
					if(s.charAt(k)-'a'==i||s.charAt(k)-'a'==j) {
						str1.append(s.charAt(k));
					}
				}
				StringBuilder str2 = new StringBuilder();
				for(int k = 0;k<y.length();k++) {
					if(y.charAt(k)-'a'==i||y.charAt(k)-'a'==j) {
						str2.append(y.charAt(k));
					}
				}
				if(str1.toString().equals(str2.toString())) {
					same[i][j]=true;
					same[j][i]=true;
				}
			}
		}
		int q=sc.nextInt();
		for(int i =0;i<q;i++) {
			String a =sc.next();
			boolean works = true;
			for(int j =0;j<a.length();j++) {
				for(int k=j;k<a.length();k++) {
					if(same[a.charAt(j)-'a'][a.charAt(k)-'a']==false) {
						works = false;
						break;
					}
				}
			}
			if(!works) {
			out.write("N");
			}
			else {
				out.write("Y");
			}
		}out.close();
	}
}