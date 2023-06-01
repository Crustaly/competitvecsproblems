import java.io.IOException;
import java.util.*;
public class poop {

	  public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		int  k =sc.nextInt();
		int  m =sc.nextInt()+1;
		int  n =sc.nextInt();
		//k is grass patches
		//m is nhoj cows
		//n is john cows
		long [][] grass = new long [k][2];
		Arrays.sort(grass, new Comparator<long[]>(){
			public int compare(long [] a, long [] b) {
				return Long.compare(a[0], b[0]);
			}
		});

		for(int i=0;i<k;i++) {
			grass[i][0]=sc.nextInt();
			grass[i][1]=sc.nextInt();
		}
		long [] nohj = new long[m];
		for(int i =0;i<m-1;i++) {
			nohj[i]=sc.nextLong();   
		}
		nohj[m-1]=Long.MAX_VALUE /2; 
		Arrays.sort(nohj);
		int [] ans = new int [2*m];
		int p1=0;
		int p2=0;
		for(int i =0;i<m;i++) {
			long len =0;
			int maxHS=0;
			int totS=0;
			int curHS =0;
			if(i==0) {
				len = Long.MAX_VALUE /2;
			}
			else len = nohj[i]-nohj[i-1];
			while(p2<k&&grass[p2][0]<nohj[i]) {
				curHS +=grass[p2][1];
				totS +=grass[p2][1];
			
				while(2*(grass[p2][0]-grass[p1][0])>=len) {
					curHS -= grass[p1][1];
					p1++;
				}
				p2++;
				maxHS = Math.max(maxHS, curHS);
			}
			p1=p2;
			ans[2*i]=maxHS;
			ans[2*i +1]=totS-maxHS;
			
		}
		Arrays.sort(ans);
		long ret =0;
		for(int i =ans.length-1;i>=Math.max(0, ans.length-n);i--) {
			ret+=ans[i];
		}
			System.out.println(ret);
		}

	}

