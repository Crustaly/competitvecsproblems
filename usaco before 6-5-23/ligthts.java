import java.util.*;
import java.lang.*;
import java.io.*;
public class ligthts{
static boolean [][] map;
static boolean [][] visited;
static int count,r,c;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   //Scanner sc = new Scanner(new File("gates.in"));
    //FileWriter file = new FileWriter("gates.out");
    //BufferedWriter output = new BufferedWriter(file);
    
    int n =sc.nextInt();
    char [] dir = new char [n];
    dir = sc.next().toCharArray();


    map = new boolean [2005][2005];
    
    int y=0;
    int x=0;
    map[1002][1002]=true;

    for(int i =0;i<n;i++) {
    	if(dir[i]=='N') {
    		y++;
    	}
    	else if(dir[i]=='E') {
    		x++;
    	}
    	else if(dir[i]=='W') {
    		x--;
    	}
    	else y--;

    	map[1002+x][1002+y]=true;
    }

    visited = new boolean [2005][2005];
    count=0;
    for(int i=0;i<1002;i++) {
    	for(int j=0;j<1002;j++) {
    	if(!visited[i][j]&&!map[i][j]) {
    		floodfill(i,j);
    		count++;
    	}
    	}
    }
 
    
    



    System.out.println(count);

  //  output.write(String.valueOf(count));

    //output.close();
  }
  static void floodfill(int x, int y) {
	  if(x<0||x>=r||y<0||y>=c||visited[x][y]||map[x][y]==true) {
		  return;
	  }
	  visited[x][y]=true;
	  floodfill(x+1,y);
	  floodfill(x-1,y);
	  floodfill(x,y+1);
	  floodfill(x,y-1);
  }

	

	  
  }






