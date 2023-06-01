import java.util.*;

public class fday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n =sc.nextInt();
		int [] teams = new int [n];
		Queue<Integer> q = new LinkedList<Integer>();
		int [] dist = new int [(int)Math.pow(2, c)+1000];
		Arrays.fill(dist,-1);
		for(int i =0;i<n;i++) {
			String s = sc.next();
			int x =0;
			int ix =0;
			for(int j=0;j<c;j++) {
				if(s.charAt(j)=='G') {
					x = x*2+1;
					ix = ix*2;
				}
				else {
					x = x*2;	
					ix = ix*2+1;
					}
			}
			teams[i]=x;
			dist[ix]=0;
			q.add(ix);

		}
		while(!q.isEmpty()) {
			int b= q.poll();
			for(int i =0;i<c;i++) {
				//figure out
				int change = b^(1<<i);
				if(dist[change]==-1) {
					q.add(change);
					dist[change]=(dist[b]+1);
				}
			}
			
		}
		for(int i:teams) {
			System.out.println(c-dist[i]);
		}

	}
}
/*   
5 3
GHGGH
GHHHH
HGHHG
*/