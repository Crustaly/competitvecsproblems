import java.util.*;

public class tower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int count =1;
		for(int i =0;i<n-1;i++) {
			int b =sc.nextInt();
			if(a<b) {
				count++;https://open.kattis.com/jobs
			}
			a=b;
		}
		System.out.println(count);
	}
}