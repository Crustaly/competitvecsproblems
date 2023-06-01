import java.util.*;

public class pl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int ts = 0;ts<t;ts++) {
			int n =sc.nextInt();
			int oc =0;
			int ec=0;
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				if(a%2==0) ec+=a;
				else oc+=a;
			}
			if(ec>oc)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}