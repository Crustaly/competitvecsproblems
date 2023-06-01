import java.util.*;
public class groupSum {
static boolean works;
static int []nums;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int tcase =0;tcase<t;tcase++) {
    	int n=sc.nextInt();
    	int g=sc.nextInt();
    	nums=new int [n];
    	for(int i =0;i<n;i++) {
    		nums[i]=sc.nextInt();
    	}
    	works=false;
    	combo(n,g,0,0);
    	if(works) System.out.println("yes");
    	else System.out.println("no");
    }
  }
  static void combo(int n,int t,int sum, int index) {
	  if(t==sum) {
		  works=true;
		  return;
	  }
	  if(index==n) {
		  return;
	  }
	  sum+=nums[index];
	  combo(n,t,sum,index+1);
	  sum-=nums[index];
	  combo(n,t,sum,index+1);
  }


}



