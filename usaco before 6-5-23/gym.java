import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class gym {
	  public static void main(String[] args) throws IOException{
		    //Scanner sc = new Scanner(System.in);
		    Scanner sc = new Scanner(new File("gymnastics.in"));
		    FileWriter file = new FileWriter("gymnastics.out");
		    BufferedWriter output = new BufferedWriter(file);
		//Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int [][] nums = new int [k][n];
		for(int i =0;i<k;i++) {
			for(int j=0;j<n;j++) {
				nums[i][j]=sc.nextInt();
			}
		}
		int count =0;
		for(int i =0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int a =nums[0][i];
				int b = nums[0][j];
				byte works = 1;
				for(int l =1;l<k&&works==1;l++) {
					for(int m =0;m<n;m++) {
						if(nums[l][m]==a) {
							break;
						}
						if(nums[l][m]==b) {
							works = 0;
							break;
						}
					}
				}
				count+=works;
			}
		}
		output.write(String.valueOf(count));
		System.out.println(count);
		output.close();
	}
}