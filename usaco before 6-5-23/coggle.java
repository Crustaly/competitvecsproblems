import java.util.*;
import java.lang.*;
import java.io.*;
public class coggle {
static String [][] coggle ;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    coggle= new String [5][5];
    for(int i =0;i<5;i++) {
    	for(int j=0;j<5;j++) {
    		coggle[i][j]=sc.next();
    	}
    }
    int ans=0;
    while(sc.hasNext()) {
    	String word = sc.next();
    	boolean f = false;
    	for(int i =0;i<5;i++) {
    		for(int j=0;j<5;j++) {

    			if(coggle[i][j].charAt(0)==word.charAt(0)) {
    
    				if(searcher(1,word,i,j)) {
    					f=true;
    	
    			
    				}
    			}
    		}
    	}
    	if(f) {
    		ans++;    	
    		}
    }



    System.out.println(ans);

  }
  static boolean searcher(int i, String word, int x, int y) {
	  String c = coggle[x][y];
	  if(i==word.length()) {
		  return true;
	  }
	  coggle[x][y]="g1";
	  int [] dx= {-1,-1,-1,0,0,1,1,1};
	  int [] dy= {-1,0,1,-1,1,-1,0,1};
	  for(int k=0;k<8;k++) {
		  int nx = x+dx[k];
		  int ny = y+dy[k];
		  if(nx>=0&&nx<5&&ny>=0&&ny<5) {
			  if(coggle[nx][ny].charAt(0)==word.charAt(i)) {
				  if(searcher(i+1,word,nx,ny)) {
		              coggle[x][y]=c;
					  return true;
				  }
			  }
		  }
	  }
	  coggle[x][y]=c;
	  return false;
  }


}



