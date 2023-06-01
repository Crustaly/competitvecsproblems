import java.util.*;

public class gree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] above100 = new int [n][n+1];
		int [][] above101 = new int [n][n+1];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int a = sc.nextInt();
				above100[i][j+1]=above100[i][j];
				if(a>=100) {
					above100[i][j+1]+=1;
				}
				above101[i][j+1]=above101[i][j];
				if(a>=101) {
					above101[i][j+1]+=1;
				}
			}
		}
		long ans = 0;
		for(int x1=0;x1<n;x1++) {
			for(int x2 =x1;x2<n;x2++) {
				for(int y1=0;y1<=n;y1++) {
					int y21=y1;
					int y22=y1;
					while(y21<n&&(above100[x2][y21+1]-above100[x1][y1]==y21-y1+1)) {
						y21++;
					}
					while(y22<n&&(above101[x2][y22+1]-above101[x1][y1]==y22-y1+1)) {
						y22++;
					}
					System.out.println(y22+" "+y21);
					ans+=y22-y21;
				}
			}
		}
		System.out.println(ans);
	}
}