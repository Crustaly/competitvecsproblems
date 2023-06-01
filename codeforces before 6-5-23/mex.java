import java.util.*;

public class mex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			int zc = 0;
			int oc =0;
			for(int i=0;i<n;i++) {
				if(sc.nextInt()==0)zc++;
				
			}
			int ans = 0;
			if(n%2==0) {
				if(zc<=n/2)ans= 0;
				else ans = 1; 
			}
			else{
				if(zc<=(n/2)+1) {
					ans =0;
				}
				else {
				ans = 1; 
				}
			}
			System.out.println(ans);
		}
	}
}