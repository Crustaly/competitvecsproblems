import java.util.*;
import java.lang.*;
import java.io.*;
public class jobs {
static int n,m,d;
static int [] jobs;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

     n =sc.nextInt();
     d =sc.nextInt();
     m =sc.nextInt();
   jobs =new int [m];
    for(int i =0;i<m;i++) {
    	jobs[i]=sc.nextInt();
    }
    Arrays.sort(jobs);
    int l=0;
    int h=jobs[n-1];
    while(l<h) {
    	int mid = (l+h)/2;
    	if(works(mid)) {
    		h=mid;
    	}
    	else {
    		l=mid+1;
    	}
    }
    
    System.out.println(l);

  }
  static boolean works(int mid) {
	  int currday=jobs[0];
	  int machs=0;
	  int i =0;
	  while(i<m) {
		  if(currday>=jobs[i]-1) {
			  
			  if(currday-jobs[i]>d) {
				  return false;
			  }
			  if(machs<mid) {
				  machs++;
				  i++;
			  }
			  else {
				  machs=0;
				  currday++;
				  }
			  
			  
		  }
		  else {
			  currday=jobs[i];
		  }
	  }
return true;
  }
  }






