import java.util.*;
import java.lang.*;
import java.io.*;
public class party {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    long[] boys = new long [n];
    long [] girls = new long [m];
    long ans =0;
    for(int i =0;i<n;i++) {
    	boys[i]=sc.nextLong();
    	ans+=boys[i];
    }
    for(int i =0;i<m;i++) {
    	girls[i]=sc.nextLong();
    }
    Arrays.sort(boys);
    Arrays.sort(girls);
    if(boys[n-1]>girls[0]) {
    	System.out.println(-1);
    }
    else {
    	ans*=m;

    	for(int i=1;i<m;i++) {
    		ans+=girls[i]-boys[n-1];
    	}
        if(boys[n-1]!=girls[0]) {
        	ans+=girls[0]-boys[n-2];
        }
        System.out.println(ans);
    }




  }


}



