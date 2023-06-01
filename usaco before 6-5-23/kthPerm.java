import java.util.*;
import java.lang.*;
import java.io.*;
public class kthPerm{
static int [] ans,nums;
static boolean [] used;
static int n;
static int num;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    n =sc.nextInt();
    int m =sc.nextInt();
    nums=new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=i+1;
    }
    used =new boolean [n];
    
    int nmf = n-1;
    int div = 1;
    for(int i =1;i<=nmf;i++) {
    	div*=i;
    }
    ans = new int [n];
    ans[0]=2;
    used[2-1]=true;
    num=0;
    recursion(1,1);
  }
  static void recursion(int target,int i) {
	  if(i==n) {
		  num++;
		  if(num==target) {
			  for(int l =0;l<n;l++) {
				  System.out.println(ans[l]);
			  }
		  }
		  return;
	  }
	  for(int p=0;p<n;p++) {
		  if(!used[p]) {
		  ans[i]=nums[p];
		  used[p]=true;
		  recursion(target,i+1);
		  used[p]=false;
		  }
	  }
  }


}



