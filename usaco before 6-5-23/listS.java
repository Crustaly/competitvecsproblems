import java.util.*;
import java.lang.*;
import java.io.*;
public class listS {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
  
    int n =sc.nextInt();
    int [] list= new int [n];
    for(int i=0;i<n;i++) {
    	list[i]=sc.nextInt();
    }
    int m =sc.nextInt();
    int[] check = new int [m];
    for(int i=0;i<m;i++) {
    	check[i]=sc.nextInt();
    }
    Arrays.sort(check);
    List<Integer> ans =new ArrayList<>();
    
    for(int i =0;i<n-m+1;i++) {
    	int [] nums = new int [m];
    	for(int j =0;j<m;j++) {
    		nums[j]=list[i+j];
    	}
    	Arrays.sort(nums);
    	boolean works=true;
    	
    	for(int j=1;j<m;j++) {
    		if(nums[j]-nums[j-1]!=check[j]-check[j-1]) {
    			
    			works=false;
    			break;
    		}
    		
    	}
    	if(works) {
    		
    		ans.add(i+1);
    	}
    }



    System.out.println(ans.size());
    for(int i:ans)
    {
    	System.out.println(i);
    }
  }


}



