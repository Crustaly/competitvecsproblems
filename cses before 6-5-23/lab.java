import java.util.*;

public class lab {
	static char [][] g;
	static int n,m,x,y;
	static boolean [][] visited;

	static char [][] how;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m =sc.nextInt();
		visited = new boolean [n][m];
		g = new char[n][m];
		how = new char[n][m];
		x =0;
		y =0;
		for(int i =0;i<n;i++) {
			g[i]=sc.next().toCharArray();
			for(int j=0;j<m;j++) {
				if(g[i][j]=='A') {
					x=i;
					y=j;
				}
			}
		}
		if(!bfs()) {
			System.out.println("NO");
		}
		
	}
	static boolean bfs() {
		Queue<Pair> qwewe= new LinkedList<Pair>();
		visited[x][y]=true;
		
		qwewe.add(new Pair(x,y));
		while(!qwewe.isEmpty()) {
			Pair p = qwewe.poll();
			int a = p.a;
			int b = p.b;
			if(g[a][b]=='B') {
				StringBuilder ans = new StringBuilder();
				while(true) {
					ans.append(how[a][b]);
					if(how[a][b]=='L') b++;
					else if(how[a][b]=='R') b--;
					else if(how[a][b]=='D') a--;
					else if(how[a][b]=='U') a++;
					if(g[a][b]=='A') {
						System.out.println("YES");
						System.out.println(ans.length());
						ans.reverse();
						System.out.println(String.valueOf(ans));
						break;
					}
				}
				return true;
			}
			if(works(a,b-1)) {
				how[a][b-1]='L';
				visited[a][b-1]=true;
				qwewe.add(new Pair(a, b-1));
			}
			if(works(a,b+1)) {
				how[a][b+1]='R';
				visited[a][b+1]=true;
				qwewe.add(new Pair(a, b+1));
			}
			if(works(a-1,b)) {
				how[a-1][b]='U';
				visited[a-1][b]=true;
				qwewe.add(new Pair(a-1, b));
			}
			if(works(a+1,b)) {
				how[a+1][b]='D';
				visited[a+1][b]=true;
				qwewe.add(new Pair(a+1, b));
			}
			
			}
		return false;
		}
	
	static boolean works (int x, int y) {
		if(x<0||x>=n||y<0||y>=m)return false;
		if(visited[x][y]||g[x][y]=='#')return false;
		return true;
	}
	static class Pair{
		int a;
		int b;
		public Pair(int c, int d) {
			a =c;
			b=d;
		}
	}
}