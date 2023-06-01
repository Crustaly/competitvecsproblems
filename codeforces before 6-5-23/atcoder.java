import java.util.*;
import java.lang.*;
import java.io.*;
public class atcoder {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();

    int k =sc.nextInt();
    int count =0;
    for(int i =0;i<n;i++) {
    	
    	int a = sc.nextInt();
    	if(i>=k) {
    		System.out.print(a+" ");
    		count++;
    	}
    }
    for(int i =0;i<n-count;i++) {
    	System.out.print(0+" ");
    }
  }
  }