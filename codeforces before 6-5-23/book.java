import java.util.*;

public class book {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long t= sc.nextLong();
		long [] book = new long [n];
		for(int i =0;i<n;i++) {
			book[i]=sc.nextLong();
		}
		Arrays.sort(book);
		long ans =0;
		long time =0;
		for(int i =0;i<n;i++) {
			if(time+book[i]<=t) {
				ans++;
				time+=book[i];
			}
			else break;
		}
		System.out.println(ans);
	}
}