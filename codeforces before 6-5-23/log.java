import java.util.*;

public class log {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int  t=0;t<ts;t++) {
			int n =sc.nextInt();
			int sum=0;
			for(int i =0;i<n;i++) {
				int a = sc.nextInt();
				sum+=a-1;
			}
			if(sum%2==1) {
				System.out.println("errorgorn");
			}
			else {
				System.out.println("maomao90");
			}
		}
	}
}