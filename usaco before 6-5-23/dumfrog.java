
import java.util.*;
import java.lang.*;
import java.io.*;
public class dumfrog {



  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

 int count =0;
 int ans =1;
 String s =sc.next();
 s+='$';
for(int i =0;i<s.length();i++) {
	if(s.charAt(i)=='-') {
		count++;
	}
	else {

	ans*=recursion(count);
	count=0;
	}
	}

     System.out.println(ans);



  }
  static int recursion(int n) {
	  if(n<=1) {
	  return n;
	  
	  }
	  else {
		  return (recursion(n-1) + recursion(n-2));
	  }
	

		  
		  
	  }
  }







