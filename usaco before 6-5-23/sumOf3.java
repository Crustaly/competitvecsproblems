import java.util.*;

public class sumOf3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    HashMap<Integer,Integer> values=new HashMap<Integer,Integer>();
    int [] nums =new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    	values.put(nums[i],i+1);
    }

    boolean found=false;
    for(int i =0;i<n;i++) {

    	for(int j=i+1;j<n;j++) {
    		if(values.containsKey(m-nums[i]-nums[j])) {
    			if(values.get(m-nums[i]-nums[j])!=i+1&&i+1!=j+1&&values.get(m-nums[i]-nums[j])!=j+1) {
    			System.out.println(values.get(m-nums[i]-nums[j])+" "+(i+1)+" "+(j+1));
    			found=true;
    			return;
    			}
    		}

    	}

    }
    if(!found) {
    	System.out.println("IMPOSSIBLE");
    }

  }


}



