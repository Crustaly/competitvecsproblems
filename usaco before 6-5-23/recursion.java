import java.util.*;
import java.lang.*;
import java.io.*;
public class recursion {

  public static void main(String[] args) throws IOException{

    int n =5;
    rec(n);



  }
  static void rec (int n) {
	  if(n==0) {
		  return;
	  }

  rec(n-1);
  System.out.println(n);
  }
  }






