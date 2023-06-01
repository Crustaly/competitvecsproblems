import java.util.*;

public class mooPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] path = new int [n];
		long sum =0;
		StringBuilder ans  =new StringBuilder();
		for(int i =0;i<n;i++) {
			path[i]=sc.nextInt();
			sum+=path[i];
		}
		int i=0;
		while(sum>0) {
			while(i<n&&path[i]!=0) {
				path[i]--;
				sum--;
				i++;
				ans.append('R');
			}
			
			while(i>0&&(path[i-1]>1||(i<n&&path[i]==0)||i==n)) {
				i--;
				path[i]--;
				sum--;
				
				ans.append('L');
			}
		}
		System.out.println(String.valueOf(ans));
	}
}