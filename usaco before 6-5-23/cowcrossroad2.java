import java.util.*;
import java.lang.*;
import java.io.*;
public class cowcrossroad2 {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("maxcross.in"));
    FileWriter file = new FileWriter("maxcross.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int k =sc.nextInt();
    int b =sc.nextInt();
    
    int [] psum = new int [n+1];
    int [] dead = new int [n];
    
    for(int i=0;i<b;i++) {
    	dead[sc.nextInt()-1]++;
    }
    
    for(int i =0;i<n;i++) {
    	psum[i+1]=psum[i]+dead[i];
    }
    int ans=Integer.MAX_VALUE;
    for(int i =0;i<=n-k;i++) {
    	ans = Math.min(ans, psum[k+i]-psum[i]);
    	System.out.println((k+i)+" "+i);
    }

System.out.println(Arrays.toString(psum));
System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



