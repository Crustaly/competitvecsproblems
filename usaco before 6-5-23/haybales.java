import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();

    int m =sc.nextInt();
    
    int [] bales = new int [n];
    for(int i =0;i<n;i++) {
    	bales[i]=sc.nextInt();
    }
    Arrays.sort(bales);
    int a=0;
    int b=0;
    int start=0;
    int end=0;
    for(int i =0;i<m;i++) {
    	a=sc.nextInt();
    	b=sc.nextInt();
    	start =Arrays.binarySearch(bales, a);
    	if(start<0) {
    		start=Math.abs(start+1);
    	}
    	end=Arrays.binarySearch(bales, b);
    	if(end<0) {
    		end=Math.abs(end+1)-1;
    	}

       System.out.println(end-start+1);
  

    }




    

    output.close();
  }
//find 

}



