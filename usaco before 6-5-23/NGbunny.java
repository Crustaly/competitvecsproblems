import java.util.*;
import java.lang.*;
import java.io.*;
public class NGbunny {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> index = new Stack<Integer>();
    int [] bunny = new int [n];
    int next =0;
   
    for(int i=0;i<n;i++) {
    	
    	next=sc.nextInt();
    	if(stack.isEmpty()||next<=stack.peek()) {
    		stack.push(next);
    		index.push(i);
    		
    	}
    	else {
    		while(!stack.isEmpty()&&stack.peek()<next) {
    			stack.pop();
    			bunny[index.pop()]=i+1;
    		}
    		stack.push(next);
    		index.push(i);
    		
    	}
    	}
    for(int i:bunny) {
    	System.out.println(i);
    }
    	
    	

    }
 



   
  }






