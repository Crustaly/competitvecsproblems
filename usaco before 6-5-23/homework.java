import java.util.*;
import java.lang.*;
import java.io.*;
public class homework {

  public static void main(String[] args) throws IOException{
   Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("homework.in"));
    FileWriter file = new FileWriter("homework.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [] nums = new int [n+1];
    int [] small=new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    int currMin=nums[n-1];
    for(int i=n-1;i>=0;i--) {
    	currMin=Math.min(currMin, nums[i]);
    	small[i]=currMin;
    }
    for(int i =n-1;i>=0;i--) {
    	nums[i]+=nums[i+1];
    }
    long [] anses = new long [n-1];
    long ans =0;
    for(int i=0;i<n-1;i++) {
    	double curr = ((double)(nums[i]-small[i])/(n-i-1))*10000;
    	anses[i] =(long) curr;
    	if(i!=0) {
    	ans=Math.max(ans, anses[i]);
    	}
    }
    
    anses[0]=-1;
    for(int i =0;i<n-1;i++) {
    	if(anses[i]==ans) {
    		System.out.println(i);
    	    output.write(String.valueOf((i)+"\n"));
    	}
    }
    


    output.close();
  }


}



