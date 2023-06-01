import java.util.*;
import java.lang.*;
import java.io.*;
public class haybales{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    int k= sc.nextInt();
    int [] psum= new int [10000];
    for(int i =0;i<n;i++) {
    	int a =sc.nextInt();
    	int b =sc.nextInt();
    	psum[a]=b;
    }
    for(int i =0;i<9999;i++) {
    	psum[i+1]+=psum[i];
    }
    int max =0;
    for(int i=Math.max(0,m-k);i<Math.min(m+k, 9999);i++) {
    	
    }
    
    
    



    System.out.println(ans);

  }
