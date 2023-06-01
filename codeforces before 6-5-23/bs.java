import java.util.*;

public class bs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int  t =0;t<ts;t++) {
			int n = sc.nextInt();
			int [] p = new int [n+1];
			for(int i =0;i<n;i++) {
				p[i+1]= p[i]+sc.nextInt();
			}
			int hi = n+1;
			int lo=0;
			while(lo<hi) {
				int mid = (lo+hi)/2;
				//works means it is in lower half!
				boolean works = true;
				long exp = 0;
				System.out.print("? ");
				if(mid-lo==0) {
					System.out.print(1+" ");
					for(int i =lo;i<=mid;i++) {
						System.out.print(i+" ");
						exp += p[i]-p[i-1];
					}
					System.out.println();
				}
				else {
				System.out.print(mid-lo+" ");
				for(int i =lo+1;i<=mid;i++) {
					System.out.print(i+" ");
					exp += p[i]-p[i-1];
				}
				System.out.println();
				}
				System.out.flush();
				int ans = sc.nextInt();
				if(exp+1!=ans)works = false;
				if(works)hi = mid;
				else lo= mid+1;
			}
			System.out.println("!"+lo);
		}
	}
}