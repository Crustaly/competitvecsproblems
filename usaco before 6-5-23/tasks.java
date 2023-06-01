import java.util.*;
import java.lang.*;
import java.io.*;
public class tasks{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
  
    int n =sc.nextInt();
    
    int [][] t = new int [n][2];
    for(int i =0;i<n;i++) {
    	t[i][0]=sc.nextInt();
    	t[i][1]=sc.nextInt();
    }
    Arrays.sort(t, (a,b)->a[0]-b[0]);
    
    long curTime =0;
    long ans = 0;
    for(int i =0;i<n;i++) {
    	curTime+=t[i][0];
    
    	ans +=t[i][1]-curTime;
    }

   System.out.println(ans);

  }


}



