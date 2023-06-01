import java.util.*;
import java.lang.*;
import java.io.*;
public class backup {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int j=0;j<n;j++) {
			int m =sc.nextInt();
			int l=sc.nextInt();
			int k=sc.nextInt();
		    int count =0;
		    int x =0;
		    for(int i=0;i<m;i++) {
		    	x = sc.nextInt();
		    	if(x>l) {
		    		count++;
		    	}
		    }
		    if(count>k) {
		    	System.out.println("No");
		    }
		    else {
		    	System.out.println("Yes");
		    }
		}
	
			}
	
}

