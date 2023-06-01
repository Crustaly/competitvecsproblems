import java.util.*;
import java.lang.*;
import java.io.*;
public class abc{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i =0;i<n;i++) {
    	int nums = sc.nextInt();
    	int [] options = new int [nums];
    	for(int j=0;j<nums;j++) {
    		options[j]=sc.nextInt();
    	}
    	solve(options);
    }


  }
  static void solve(int [] options) {
int ans =0;
	  HashSet<Integer> values = new HashSet<Integer>();
	  for(int i:options) {
		  values.add(i);
		  for(int j:options) {
			  if(i<j) {
				  values.add(j-i);
			  }
		  }
	  }
	  HashSet<Integer> allValues = new HashSet<Integer>();
	  for(int i:values) {
		  for(int j:values) {
			  for(int k:values) {
				  if(i<=j&&j<=k) {
				  boolean works =true;
				  allValues.clear();
				  allValues.add(i);
				  allValues.add(j);
				  allValues.add(k);
				  allValues.add(i+j);
				  allValues.add(i+k);
				  allValues.add(j+k);
				  allValues.add(i+j+k);
				  for(int x:options) {
					  if(!allValues.contains(x)) {
						  works =false;
					  }
				  }
				  if(works) {
					  ans++;
				  }
				 
			  }
		  }
	  }
	
  }
	  System.out.println(ans);
  }
}