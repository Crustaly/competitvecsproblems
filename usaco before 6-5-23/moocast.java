import java.util.*;
import java.lang.*;
import java.io.*;

public class moocast {
	static int n;
	static int [][] coords;
	static boolean [] visited;
	static boolean [][]adj;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("moocast.in"));
    FileWriter file = new FileWriter("moocast.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    coords = new int [n][2];
    //[][0] x [][1] y
    for(int i =0;i<n;i++) {
    	coords[i][0]=sc.nextInt();
    	coords[i][1]=sc.nextInt();
    }
    
  long l=0;
  long h=Long.MAX_VALUE/2;
    while(l<h) {
    	long mid =(l+h)/2;
    	if(works(mid)) {
    		h=mid;
    	}
    	else {
    		l=mid+1;
    	}
    }



    System.out.println(l);

    output.write(String.valueOf(l));

    output.close();
  }
  static boolean works (long mid) {
	
	  adj = new boolean [n][n];

	  for(int i =0;i<n;i++) {
		  for(int j=0;j<n;j++) {
	
			  if((coords[i][0]-coords[j][0])*(coords[i][0]-coords[j][0])+(coords[i][1]-coords[j][1])*(coords[i][1]-coords[j][1])<=mid) {
				 adj[i][j]=true;
			  }
		  }
	  }
	  visited = new boolean [n];
	  int cowsReached = dfs(0);
	  return cowsReached ==n;




}
  static int dfs(int node) {
	  int cowR =0;
	  visited[node]=true;
	  for(int i=0;i<n;i++) {
		  if(!visited[i]&&adj[node][i]) {
			  cowR +=dfs(i);
		  }
		  
	  }
	  return (cowR+1);
  }
}


