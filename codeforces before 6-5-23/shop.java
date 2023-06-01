import java.util.*;
import java.lang.*;
import java.io.*;
public class shop {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] items = new int [n];
    for(int i =0;i<n;i++) {
    	items[i]=sc.nextInt();
    }
    Arrays.sort(items);
    long count =0;
    for(int i =n-3;i>=0;i-=3) {
    	count+=items[i];
    }
System.out.println(count);
  }
}