import java.util.*;
import java.lang.*;
import java.io.*;
public class balancedSub{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] ps = new int [n+1];
    int [] b =new int [n];
    for(int i =0;i<n;i++) {
    	ps[i+1]=sc.nextInt()+ps[i];
    	
    }
    for(int i =0;i<n;i++) {
    	b[i]=2*ps[i]-i;
    }
    int [] last = new int [n];
    int ans =0;
    Arrays.fill(last, -1);
    for(int i=0;i<n;i++) {
    	ans = Math.max(ans, i-last[b[i]]);
    	if(last[b[i]]==-1) {
    		last[b[i]]=i;
    	}
    	
    }

    System.out.println(ans);

  }


}



