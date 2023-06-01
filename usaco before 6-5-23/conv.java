import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class conv {
	static int n,m,c;
	static int [] nums;
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
	    Scanner sc = new Scanner(new File("convention.in"));
	    FileWriter file = new FileWriter("convention.out");
	    BufferedWriter output = new BufferedWriter(file);
		n = sc.nextInt();
		m = sc.nextInt();
		c = sc.nextInt();
		nums = new int [n];
		for(int i =0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		Arrays.sort(nums);
		int lo =0;
		int hi = nums[n-1];
		while(lo<hi){
			int mid = (lo+hi)/2;
			if(works(mid)){
			hi=mid;
			}
			else{
			lo=mid+1;
			}
			}
			System.out.println(lo);
			output.write(String.valueOf(lo));
			output.close();
	}
	static boolean works(int mid) {
		int bus=0;
		int cur=-1;
		int amount =0;
		for(int i =0;i<n;i++) {
			amount++;
			if(cur==-1) {
				cur = nums[i];
				bus++;
				
			}
			
			if(nums[i]-cur>mid) {
				bus++;
				cur=nums[i];
				amount=1;
			}
			else if(amount==c) {
				cur=-1;
				amount=0;
			}
		}
	
	return m>=bus;



	}
}

