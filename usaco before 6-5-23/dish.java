import java.util.*;
import java.lang.*;
import java.io.*;
public class dish {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();

    Stack<Integer> initial = new Stack<Integer>();
    for(int i =n;i>0;i--) {
  
    	initial.push(i);
    }


    
    Stack<Integer> washed = new Stack<Integer>();
    Stack<Integer> dried = new Stack<Integer>();
  
    while(sc.hasNextInt()) {
    	
    	int process =sc.nextInt();
    	int num=sc.nextInt();
    	if(process==1) {
    		for(int i =0;i<num;i++) {
    			washed.push(initial.pop());
    		}
    	}
    	else {
    		for(int i =0;i<num;i++) {
    			dried.push(washed.pop());
    		}
    	}  
    }
    
    while(dried.size()>0) {
    	System.out.println(dried.pop());
    }

  }


}



