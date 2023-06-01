import java.util.*;

public class outOfOil {
	static int n,m;
	static boolean visited [][];
	static char grid [][];
	static int ans, comp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		visited = new boolean [n][m];
		grid = new char [n][m];
		for(int i =0;i<n;i++) {
			grid[i]=sc.next().toCharArray();
		}
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!visited[i][j]&&grid[i][j]=='#') {
					comp =0;
					floodfill(i,j);
					ans = Math.max(ans,comp);
				}
			}
		}
		System.out.println(ans);
	}
	static void floodfill(int x,int y) {
		if(x>=n||x<0||y>=m||y<0||visited[x][y]||grid[x][y]!='#') {
			return;
		}
		visited[x][y]=true;
		comp++;
		floodfill(x+1,y);
		floodfill(x-1,y);
		floodfill(x,y-1);
		floodfill(x,y+1);
	}
}
