import java.util.*;
import java.lang.*;
import java.io.*;
public class rooms {
	static boolean [][] visited;
	static char [][] map;
	static int n,m;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    n =sc.nextInt();
    m =sc.nextInt();
    
    map = new char[n][m];
    
    for(int i =0;i<n;i++) {
    	map[i]=sc.next().toCharArray();
    }
    visited = new boolean [n][m];
    int ans = 0;
    for(int i =0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		if(map[i][j]=='.'&&!visited[i][j]) {
    			floodfill( i , j);
    			ans++;
    			
    		}
    	}
    }



    System.out.println(ans);

 
  }
  static void floodfill( int a,int b) {
	  if(a<0||a>=n||b<0||b>=m||map[a][b]!='.'||visited[a][b]) {
		  return;
	  }
	  visited[a][b]=true;
	  floodfill(a, b+ 1 );
		floodfill(a, b - 1 );
		floodfill(a - 1, b );
		floodfill(a+ 1, b );
  }


}



