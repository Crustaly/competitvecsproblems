import java.util.*;
import java.lang.*;
import java.io.*;
public class numpali{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int l =sc.nextInt();
    int count =0;
    int []knots = new int [n];
    for(int i =0;i<n;i++) {
    	knots[i]=sc.nextInt();
    }
    Arrays.sort(knots);
    int [] nums = new int [n-1];
    for(int i =0;i<n-1;i++) {
    	nums[i]=knots[i+1]-knots[i];
    }

    for(int i =0;i<n-1;i++) {
    	if(knots[i]==0||knots[i+1]==l);
    	int start=i;
    	int end=i;
    	
    	while(start-1>=0&&end+1<n-1&&nums[start-1]==nums[end+1]){ 	     
    		start--;
    		end++;
    		if(start==0||end==n-2) {
  
        		count++;
        	}
        	}
    

    }

    for(int i =0;i<n-2;i++) {
    	int start=i;
    	int end=i+1;
    	
    	if(nums[start]==nums[end]) {
    
    		if(start==0||end==n-2) {
      
        		count++;
        	}
    	while(start-1>=0&&end+1<n-1&&nums[start-1]==nums[end+1]){
    	
    		start--;
    		end++;
    	

    		if(start==0||end==n-2) {
         	
        		count++;
        	}
    	}
    	
    	

    	}
    }
    if(knots[0]==0&&knots.length==2) {
    	count--;
    }
    System.out.println(count+2);


  }


}



