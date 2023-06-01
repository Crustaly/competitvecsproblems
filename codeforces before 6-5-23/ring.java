import java.util.*;

public class ring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			HashSet<Integer> unique = new HashSet<Integer>();
			for(int i =0;i<n;i++) {
				unique.add(sc.nextInt());
			}
			if(unique.size()==2) {
				System.out.println(n/2+1);
			}
			else {
				System.out.println(n);
			}
		}
	}
}