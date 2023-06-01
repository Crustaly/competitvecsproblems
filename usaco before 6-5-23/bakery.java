import java.util.*;

public class bakery {
	static long [][] cows;
	static int n;
	static int x,y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int ts = 0;ts<t;ts++) {
			n =sc.nextInt();
			x = sc.nextInt();
			y =sc.nextInt();
			cows = new long [n][3];
			for(int i =0;i<n;i++) {
				cows[i][0]=sc.nextLong();
				cows[i][1]=sc.nextLong();
				cows[i][2]=sc.nextLong();
			}
			long lo =0;
			long hi = x+y-2;
			while(lo<hi){
				long mid = (lo + hi) / 2;
				if(works(mid)){
				hi=mid;
				}
				else{
				lo=mid+1;
				}
				}
				System.out.println(lo);

		}


		}
	static boolean works(long mid) {
		long lx = Math.max(1, x-mid);
		long hx = Math.min(x, x+y-mid-1);
		for(int i=0;i<n;i++) {
			long d = x+y-mid;
			long a = cows[i][0];
			long b = cows[i][1];
			long c = cows[i][2];
			if(b-a>0) {
				lx = Math.max(lx, (-c + b * d + (b - a - 1)) / (b - a));
			}
			else if(a-b>0) {
				hx = Math.min(hx,  (c - b * d) /(a - b));
			}
			else {
				 if (a*d>c)return false;
			}
		}
		
		return (lx<=hx);
	}
	}
