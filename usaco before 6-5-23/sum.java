
import java.util.*;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		long [] cows = new long [n];
		long [] p = new long [n];
		for(int i =0;i<n;i++) {
			cows[i]=sc.nextLong();
			p[i]=cows[i];
		}
		Arrays.sort(cows);
		long [] psum = new long [n+1];
		for(int i =0;i<n;i++) {
			psum[i+1]=psum[i]+cows[i]*(long)(i+1);
		}
		long [] shiftDown = new long [n+1];
		for(int i =0;i<n;i++) {
			shiftDown[i+1]=shiftDown[i]+cows[i]*(long)(i);
		}
		long [] shiftUp = new long [n+1];
		for(int i =0;i<n;i++) {
			shiftUp[i+1]=shiftUp[i]+cows[i]*(long)(i+2);
		}

		int q= sc.nextInt();
		for(int t=0;t<q;t++) {
			int i =sc.nextInt()-1;
			long j =sc.nextLong();
			long val = p[i];
			long ans =0;
			int cur = lower(cows,val);
			int des = lower(cows,j);
			if(cur==des) {
				ans = psum[cur]+(j*(cur+1))+(psum[n]-psum[cur+1]);
				System.out.println(ans);
			}
			else if(cur>des) {
				ans+= psum[des];
				ans+=psum[n]-psum[cur+1];
				ans+=shiftUp[cur]-shiftUp[des];
				ans+=(des+1)*j;
				System.out.println(ans);
			}
			else  {
				ans+= psum[cur];
				ans+=psum[n]-psum[des];
				ans+=shiftDown[des]-shiftDown[cur+1];
				ans+=(des)*j;
				System.out.println(ans);
			}
		}
	}
	 static int lower(long array[], long key)
	    {
	        int l =0;
	        int high = array.length;
	        int mid;
	        while (l<high) {
	            mid= (l+high)/2;
	            if (key<=array[mid]) {
	                high =mid;
	            }
	            else {
	                l =mid + 1;
	            }
	        }
	        if (l <array.length && array[l]<key) {
	            l++;
	        }
	        return l;
	    }
}
