import java.util.*;
import java.lang.*;
import java.io.*;
public class warehouse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n =sc.nextInt();
    int j=1;
    Stack<Integer> stack = new Stack<Integer>();
    for(int i =0;i<n;i++) {
    	String dir = sc.next();
    	if(dir.equals("ADD")) {
    		stack.push(j);
    		j++;
    	}
    	else {
    		stack.pop();
    	}
    	}
    

    

System.out.println(stack.size());
for(int i :stack) {
System.out.println(i);
}
}

 
  }






