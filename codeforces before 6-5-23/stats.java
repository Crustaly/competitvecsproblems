import java.util.*;
import java.lang.*;
import java.io.*;
public class stats {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   int [] nums = new int [266];
   int indexSum=0;
   int max =0;
   int min=0;
   boolean found = false;
   int totSum=0;
   int mode=0;
   int modenum=0;
    for(int i =0;i<266;i++) {
    	nums[i]=sc.nextInt();
    	indexSum+=nums[i];
    	totSum+=nums[i]*i;
    	if(nums[i]!=0&&!found) {
    		found=true;
    		min=i;
    		}
    	if(nums[i]!=0) {
    		max=i;
    		}
    	if(nums[i]>modenum) {
    		mode=i;
    		modenum=nums[i];
    	}
    	}
    System.out.println((double)min);
    System.out.println((double)max);
    System.out.println((double)totSum/indexSum);
    if(indexSum%2==1) {
    	int target = indexSum/2+1;
    	int index=0;
    	while(index<target) {
    		if
    	}
    		
    	
    }
    

    System.out.println(ans);

  }
}
