import java.util.*;

public class string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t =0;t<ts;t++) {
			int n =sc.nextInt();
			int [][] psum = new int [26][n+1];
			char [] s= sc.next().toCharArray();
			for(int i =1;i<n+1;i++) {
			
				
				psum[s[i-1]-'a'][i]++;
				for(int j=0;j<26;j++) {
					psum[j][i]+=psum[j][i-1];
				}
			} 
			int ans =0;
			
			for(int i =0;i<n+1;i++) {
				int s1 =0;
				int s2=0;
				for(int j=0;j<26;j++) {
					if(psum[j][i]-psum[j][0]>0) {
						s1++;
					}
					if(psum[j][n]-psum[j][i]>0) {
						s2++;
					}
				}
				ans =Math.max(ans, s1+s2);
			}
			System.out.println(ans);
		}
	}
}