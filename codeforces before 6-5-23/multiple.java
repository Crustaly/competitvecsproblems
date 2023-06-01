import java.util.*;
import java.lang.*;
import java.io.*;
public class multiple {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int num=0;
   
    int pow =1;
    int  [] count = new int [2019];
    count[0]=1;
    for(int i=s.length()-1;i>=0;i--) {
    	num=(num+(pow*(s.charAt(i)-'0')))%2019;
    	count[num]++;
    	pow=pow*10%2019;
    }
    long ans =0;
    for(int i =0;i<2019;i++) {
    	ans+=(long)count[i]*(count[i]-1)/2;
    	
    }

    System.out.println(ans);

  }


}



