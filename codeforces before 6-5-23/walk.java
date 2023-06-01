import java.util.*;

public class walk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int d =sc.nextInt();
			System.out.println(solve(a,b,c,d));
		}
	}
	static int solve(int a, int b, int c, int d) {
		if(b>d)return -1;
		int count =0;
		int poo = d-b;
		a+=poo;
		b+=poo;
		count+=poo;
	
		if(c>a)return -1;
		else if(c==a)return count; 
		count+=a-c;
		return count; 
	}
}