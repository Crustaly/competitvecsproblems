import java.util.*;

public class words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		HashMap<String, Integer> comp= new HashMap<String, Integer>();
		int [] cost= new int [n];
		int [] c = new int [k];
		String [] s = new String [n];
		for(int i =0;i<n;i++) {
			s[i]=sc.next();
		}
		for(int i =0;i<n;i++) {
			cost[i]=sc.nextInt();
		}
		int count =0;
		for(int i =0;i<k;i++) {
			int a = sc.nextInt();
			int max = Integer.MAX_VALUE;
			for(int j=0;j<a;j++) {
				int b=sc.nextInt()-1;
				comp.put(s[b],count);
				max = Math.min(max, cost[b]);
			}
			c[i]=max;
			count++;
		}
		long t = 0;
		for(int i=0;i<m;i++) {
			String st = sc.next();
			t+=c[comp.get(st)];
		}
		System.out.println(t);
	}
}