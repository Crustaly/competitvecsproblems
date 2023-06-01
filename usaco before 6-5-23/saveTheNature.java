
import java.util.*;
public class saveTheNature{
	static long [] tickets,values,mtickets,mvalues;
	static long k;
	static int n;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int poo = sc.nextInt();
    for(int moo=0;moo<poo;moo++){
    	n=sc.nextInt();
    	tickets=new long[n];
    	values=new long [n];
    	for(int i =0;i<n;i++) {
    		tickets[i]=sc.nextInt();
    	}
    	int x=sc.nextInt();
    	int a=sc.nextInt();
    	int y=sc.nextInt();
    	int b=sc.nextInt();
    	for(int i =1;i<=n;i++) {
    		if(i%a==0) {
    			values[i-1]+=x;
    		}if(i%b==0) {
    			values[i-1]+=y;
    		}
    	}
    	Arrays.sort(tickets);
    	k=sc.nextLong();
    	int l=1;
    	int r=n+1;
    	boolean found=false;
    	while(l<r) {
    		int mid=(l+r)/2;
    		mtickets=new long [mid];mvalues=new long[mid];
    		for(int i =0;i<mid;i++) {
    			mvalues[i]=values[i];
    			mtickets[i]=tickets[n-1-i];
    		}
    		Arrays.sort(mvalues);
    		Arrays.sort(mtickets);
    		if(works(mid)) {
    			r=mid;
    			found=true;
    		}
    		else {
    			l=mid+1;
    		}
    	}
    	if(found) {

         System.out.println(l);
    	}
    	else {
    		System.out.println(-1);
    	}
    }
  }
  static boolean works(int t) {
	  long total=0;
	  for(int i=0;i<t;i++) {
		  total+=mtickets[i]*(double)mvalues[i]/100;
	  }
	  return total>=k;
  }
}