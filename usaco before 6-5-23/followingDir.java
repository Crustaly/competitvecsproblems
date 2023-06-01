import java.util.*;

public class followingDir {
	static int [] down;
	static int [] right;
	static int [][] count;
	static char [][] dirs;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dirs = new char [n][n];
		count = new int [n][n];
	    right = new int [n];
		down = new int [n];
		for(int i =0;i<n;i++) {
			dirs[i]=sc.next().toCharArray();
			right[i]=sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			down[i]=sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			Arrays.fill(count[i], 1);
		}
		int total=0;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(dirs[i][j]=='R') {
					if(j!=n-1) {
						count[i][j+1]+=count[i][j];
					}
					else {
						total+=count[i][j]*right[i];
					}
				}
				if(dirs[i][j]=='D') {
					if(i!=n-1) {
						count[i+1][j]+=count[i][j];
					}
					else {
						total+=count[i][j]*down[j];
					}
				}
			}
		}
		
		int ts = sc.nextInt();
		System.out.println(total);
		for(int i=0;i<ts;i++) {
			int x =sc.nextInt()-1;
			int y =sc.nextInt()-1;
			pathDel(x,y,count[x][y],true);
			if(dirs[x][y]=='R') {
				dirs[x][y]='D';
			}
			else  {
				dirs[x][y]='R';
			}
			pathChange(x,y,count[x][y],true);
			
			System.out.println(count());
			
		
		}
	}
	static long count() {
		int total =0;
		for(int i =0;i<n;i++) {
			if(dirs[n-1][i]=='D') {
				total+=count[n-1][i]*down[i];
			}
		}
		for(int i =0;i<n;i++) {
			if(dirs[i][n-1]=='R') {
				total+=count[i][n-1]*right[i];
			}
		}
		return total;
	}
	static void pathChange(int x, int y, int p, boolean first) {
		if(!first) {
			count[x][y]+=p;
		}
		
		if(x==n-1&&dirs[x][y]=='D') {
			
			return;
		}
		if(y==n-1&&dirs[x][y]=='R') {
			
			return;
		}
		
		if(dirs[x][y]=='R') {
			pathChange(x,y+1,p,false);
		}
		else {
			pathChange(x+1,y,p,false);
		}
	}
	static void pathDel(int x, int y, int p, boolean first) {
		if(!first) {
		count[x][y]-=p;
		}
		if(x==n-1&&dirs[x][y]=='D') {
			
			return;
		}
		if(y==n-1&&dirs[x][y]=='R') {
			
			return;
		}
		
		if(dirs[x][y]=='R') {
			pathDel(x,y+1,p,false);
		}
		else {
			pathDel(x+1,y,p,false);
		}
	}
}