
import java.util.*;
public class binaryDeque {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int poo = sc.nextInt();
    for(int moo=0;moo<poo;moo++){

        int n =sc.nextInt();
        int target =sc.nextInt();
        int [] nums = new int [n];
        int ogOnes =0;
        for(int i =0;i<n;i++) {
        	nums[i]=sc.nextInt();
            ogOnes+=nums[i];
        }
        if(ogOnes<target) {
        	System.out.println(-1);
        	continue;
        }

        int l =0;
        int r = n-1;
        while(l<r&&ogOnes!=target) {
        	if(nums[l]==1) {
        		ogOnes--;
        		l++;
        		nums[l]=0;
        	}
        	else if(nums[r]==1) {
        		ogOnes--;
        		r--;
        		nums[r]=0;
        	}
        	else {
        		int up=upperbound(1,nums);
        		int low =lowerbound(1,nums);
        		if(low-l<r-up) {
        			
        		}
        	}
        }
        System.out.println(l-0+n-1-r);
      
    }
  }
  static int upperbound(int a, int [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a>=arr[mid]) {
			  l=mid+1;
			  
		  }
		  else {
			  r=mid;
		  }
		 
	  }
	  return l;
  }
  static int lowerbound(int a, int [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a<=arr[mid]) {
			  r=mid;
			  
		  }
		  else {
			  l=mid+1;
		  }
		 
	  }
	  return l;
  }
}