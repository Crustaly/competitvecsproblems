import java.util.*;
import java.lang.*;
import java.io.*;
public class kk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c= sc.nextInt();
		for(int j =0;j<c;j++) {
			int n =sc.nextInt();
			int m=sc.nextInt();
			int ans=Integer.MAX_VALUE;
			int  [] nums =new int [n];
			for(int i=0;i<n;i++) {
				String use= sc.next();
			    nums[i]=sc.nextInt();
			}
			for(int i=0;i<n-m+1;i++) {
				int count =0;
				for(int k=0;k<m;k++) {
					count +=nums[i+k];
				}
				ans = Math.min(ans, count);
			}
			System.out.println(ans);
		}
	
		sc.close(); 
	}

}
