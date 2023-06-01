import java.util.*;
import java.lang.*;
import java.io.*;
public class mult7 {
static int count =0;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    int [] n = new int [num.length()+1];
    int [] times = new int [num.length()];
    int power=1;
    for(int i =0; i<num.length();i++) {
    	times[i]=power; 
    	power = (power*10)%7;
    	
    }
    for(int i =0;i<n.length-1;i++) {
    	
    	n[i+1]=(num.charAt(i)-'0')%7;
     
    }
    int count =0;
    for(int i =1;i<n.length;i++) {
    	for(int j=i+1;j<n.length;j++) {
    		int total =0;
    		int index =j-i;
    		for(int pee =i;pee<=j;pee++) {
    		total+= times[index]*n[pee];
    		index--;
    		}
    	if(total%7==0) {
    		count++;
    	}
    }
    }
  
   
    

    System.out.println(count);

  }

}
