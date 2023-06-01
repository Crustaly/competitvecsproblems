import java.util.*;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t =0;t<ts;t++) {
			int [] a = new int [3];
			for(int i =0;i<3;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			if(a[2]==a[0]+a[1]) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}