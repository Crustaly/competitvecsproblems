import java.util.*;
/*
Time: 24:50
Num Submissions: 3
Learnt: Be careful what you change! I used a grid array and changed it the first time, so it got messed up :(
Time Complexity: O(N)
Rating: 1300
*/
public class wakk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int m = sc.nextInt();
			int b = 0;
			int B = 0;
			boolean works = false;
			char [][] grid = new char [2][m];
			char [][] g = new char [2][m];
			for(int i =0;i<2;i++) {
				String s= sc.next();
				grid[i]=s.toCharArray();
				g[i]=s.toCharArray();
			}
			for(int i =0;i<2;i++) {
				for(int j =0;j<m;j++) {
					if(grid[i][j]=='B')B++;
				}
			}
			if(grid[0][0]=='B') {
				int cur = 0;
				for(int i =0;i<m-1;i++) {
					if(grid[1-cur][i]=='B') {
						grid[1-cur][i]='W';
						cur=1-cur;
						b++;
					}
					if(grid[cur][i+1]=='B') {
						grid[cur][i+1]='W';
						b++;
					}
					else {
						b=-100;
					}
				}
				if(grid[1-cur][m-1]=='B') {
					b++;
				}
				if(b+1==B) works = true;
			}
			b=0;
			if(g[1][0]=='B') {
				int cur = 1;
				for(int i =0;i<m-1;i++) {
					if(g[1-cur][i]=='B') {
						g[1-cur][i]='W';
						cur=1-cur;
						b++;
					}
					if(g[cur][i+1]=='B') {
						g[cur][i+1]='W';
						b++;
					}
					else {
						b=-100;
					}
				}
				if(g[1-cur][m-1]=='B') {
					b++;
				}
				if(b+1==B) works = true;
			}
			if(works)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}