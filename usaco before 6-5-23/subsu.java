import java.util.*;
import java.lang.*;
import java.io.*;
public class subsu{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    int [] nums =new int [n];
    for(int i=0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    int l=0;
    int r=0;
    int sum=nums[0];
    int ans=0;
   	if(sum==m) {
		ans++;
	}
    while(r<n-1) {
    	if(sum+nums[r+1]<=m) {

    		r++;
    		sum+=nums[r];
    	}         
    	else  {
    		
    		sum-=nums[l];
    		l++;
    	}

    }
    System.out.println(ans);

  }


}



