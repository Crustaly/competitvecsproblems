import java.util.*;
import java.lang.*;
import java.io.*;
public class kthZero{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int t =sc.nextInt();
    int k=sc.nextInt();
    int l=0;
    int h=n;
    while(l<h) {
    	int mid =(l+h)/2;
    	System.out.println("? 1 "+(mid+1));
    	int num=sc.nextInt();
    	if(mid+1-num<k) {
    		l=mid+1;
    	}
    	else {
    		h=mid;
    	}
   
    	
    }
    System.out.println("! "+(h+1));
    System.out.flush();
    
    




  }


}



