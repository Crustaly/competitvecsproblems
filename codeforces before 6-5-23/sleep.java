
import java.util.*;
public class sleep {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int poo = sc.nextInt();
    for(int moo=0;moo<poo;moo++){
    	int n=sc.nextInt();
    	int h=sc.nextInt();
    	int m=sc.nextInt();
    	int t = h*60+m;
    	int ans =101010101;
    	for(int i=0;i<n;i++) {
    		int hh=sc.nextInt();
    		int mm=sc.nextInt();
    		int mt = hh*60+mm-t;
    		if(mt<0) {
    			mt+=1440;
    		}
    	    ans = Math.min(ans,mt);
    	   
    	}

    	 System.out.println(ans/60+" "+ans%60);
      
    }
  }
}