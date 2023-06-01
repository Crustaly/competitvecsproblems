import java.util.*;
import java.lang.*;
import java.io.*;
public class dress {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
  
    int n =sc.nextInt();

    int m =sc.nextInt();
    int [] fox=new int[n];
    for(int i=0;i<n;i++) {
    	fox[i]=sc.nextInt();
    }
    Arrays.sort(fox);
    int l=0;
    int r=n-1;
    int ans=0;
    while(l<r) {
    	if(fox[l]+fox[r]>m) {
   
    		r--;
    		
	
    	}
    	else {
    		ans+=r-l;
    		l++;
    	}
    	
    }



    System.out.println(ans);

  }


}



