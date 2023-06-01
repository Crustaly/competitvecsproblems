import java.util.*;
import java.lang.*;
import java.io.*;
public class where{
static int n,a;
static char [][] grid,temp;
static ArrayList<PCL> pcls;
static int [] color;
  public static void main(String[] args) throws IOException{
   // Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("where.in"));
    FileWriter file = new FileWriter("where.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    grid=new char [n][n];

    for(int i =0;i<n;i++) {
    	grid[i]=sc.next().toCharArray();
    }
    color=new int [26];
    pcls=new ArrayList<PCL>();
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		for(int k=0;k<n;k++) {
    			for(int l=0;l<n;l++) {
    				if(check(i,j,k,l)) {
    					pcls.add(new PCL(i,j,k,l)); 
    				}
    			}
    		}
    	}
    }
    int ans =0;
    for(PCL i:pcls) {
    	
    	if(outside(i)) {
    		ans++;
    
    	}
    }
    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static boolean outside(PCL o) {
      for(PCL s:pcls) {
    	  if(s==o) {
    		  continue;

    		  
    	  }
    	  if(o.i >= s.i && o.j >= s.j && o.k <= s.k && o.l <= s.l) {
    		  return false;
    	  }
      }
      return true;
  }
  static class PCL{
	  int i,j,k,l;
	  public PCL(int _i,int _j,int _k,int _l) {
		  i=_i;k=_k;
		  j=_j;l=_l;
	  }
  }
  static boolean check(int x1,int y1, int x2, int y2) {
	  int colorNum=0;
	  
	 
	  temp=new char [n][n];
	  for(int i=x1;i<=x2;i++) {
		  for(int k=y1;k<=y2;k++) {
			  temp[i][k]=grid[i][k];
		  }
	  }
	  color=new int [26];
	  for(int i=x1;i<=x2;i++ ) {
		 for(int k=y1;k<=y2;k++) {
			 if(temp[i][k]!='*') {
				 int c=temp[i][k]-'A';
				 if(color[c]==0) {
					 colorNum++;
				 }
				 color[c]++;
				 floodfill(i,k,temp[i][k]);
			 }
		 }
	  }


	  if(colorNum!=2) {
		  return false;
	  }
	  boolean one=false;
	  boolean more=false;
	  for(int piss =0;piss<26;piss++) {
		  if(color[piss]==1)one=true;
		  if(color[piss]>1)more=true;
	  }
	  return one&&more;
			  
  }
  static void floodfill(int i,int j,char c) {
	  if(i<0||j<0||j>=n||i>=n||temp[i][j]!=c) {
		  return;
	  }
	  temp[i][j]='*';
	  floodfill(i+1,j,c);
	  floodfill(i,j+1,c);
	  floodfill(i-1,j,c);
	  floodfill(i,j-1,c);
  }


}



