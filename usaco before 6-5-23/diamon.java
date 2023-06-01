import java.util.*;
import java.lang.*;
import java.io.*;
public class diamon {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   // Scanner sc = new Scanner(new File("diamond.in"));
    FileWriter file = new FileWriter("diamond.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int [] nums = new int [n];
    for(int i =0;i<n;i++) {
    	nums[i]=sc.nextInt();
    }
    Arrays.sort(nums);
    int leftMax=0;
    int [] left = new int [n];

    for(int i =0;i<n;i++) {
    	int l=i;
    	int r=i;
    	while(r<n&&nums[r]-nums[l]<=m) {
    		r++;
    	}

    	left[i]=r-l;
    }
    int [] right = new int [n+1];

    for(int i =n-1;i>=0;i--) {
         right[i]=Math.max(right[i+1], left[i]);
    }

    int ans=0;
    for(int i =0;i<n;i++) {
    	ans=Math.max(left[i]+right[i+left[i]],ans);
    }

    



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



