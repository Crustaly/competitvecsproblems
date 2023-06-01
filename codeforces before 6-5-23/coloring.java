import java.util.*;

public class coloring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int cas =0;cas<t;cas++) {
			double n = sc.nextDouble();
			int m = sc.nextInt();
			double k = sc.nextDouble();
			double highest  =Math.ceil(n/k);
			int special =0;
			int h= (int)((int)n/k);
			boolean works = true;
			for(int j=0;j<m;j++) {
				int a = sc.nextInt();
				if(a>highest) {
					works = false;
				}
				if(a>h) {
					special++;
				}
				
			}
			if(works&&special<=n%k) {
				System.out.println("YEs");
			}
			else {
				System.out.println("nO");
			}
		}
	}
}