import java.util.*;
import java.lang.*;
import java.io.*;
public class baloni {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    long sum =0;
    int [] count = new int [n+1]; 
    for(int i =0;i<n;i++) {
        int a =sc.nextInt();
        if(count [a]==0) {
        	count[a-1]++;
        }
        else {
        	count[a-1]++;
        	count [a]--;
        }
    }
    for(int i :count) {
    	sum+=i;
    }




    System.out.println(sum);

  }
}