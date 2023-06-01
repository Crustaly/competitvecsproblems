import java.util.*;
import java.lang.*;
import java.io.*;
public class password {
static String s;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    s =sc.next();
    long n =sc.nextInt();
    long l=s.length();
    while(l<n) {
    	l=l*2;
    }
    System.out.println(s.charAt((int)orig(n-1,l)));

  }
  static long orig(long pos, long len) {
	  if(len<=s.length()) {
		  return pos;
	  }
	  if(pos*2<len) {
		  return orig(pos,len/2);
	  }
	  return orig((pos-1)%(len/2),len/2);
  }


}



