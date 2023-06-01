import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;
public class crystla{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   
    long n =sc.nextLong();
    while(true){
    	if(harsh(n)) {
    		System.out.println(n);
    		break;
    	}
    	else {
    		n++;
    	}
    }
    




  }
  static boolean harsh(long num) {
	  long rem =0;
	  long sum =0;
	  long n = num;
	  while(num > 0) { 
		    rem = num%10;  
		    sum = sum + rem;  
		    num = num/=10; 
	  }
	  if(n%sum==0)return true;
	  return false;
  }
}