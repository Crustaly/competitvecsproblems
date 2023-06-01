
import java.util.*;
public class difference {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int poo = sc.nextInt();
    for(int moo=0;moo<poo;moo++){
    	int  k=sc.nextInt();
    	int n =sc.nextInt();
    	n -= k-1;
    	
    	int [] ans = new int [k];
    	ans[0]=1;
   
    	for(int i =1;i<k;i++) {
    		ans[i]=Math.min(n, ans[i-1]+i-1);
    	}

    	for(int i =0;i<k;i++) {
    		ans[i]+=i;
    	
    	}

         for(int i: ans) {
        	 System.out.print(i+" ");
         }
         System.out.println();
      
    }
  }
}