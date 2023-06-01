import java.util.*;

public class aandb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int a = Math.min(n, e/2);
		int max=0;
		for(int i=0;i<=a;i++) {
			int aa = i;
			int nleft = (n-i);
			int eleft = e-i*2;
			int bb = Math.min(nleft/2, eleft);
			bb = Math.max(bb,0);
			max = Math.max(aa+bb, max);
		
	}
		System.out.println(max);
}
}