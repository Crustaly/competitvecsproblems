import java.util.*;
import java.lang.*;
import java.io.*;
public class moocastSilver {
static ArrayList<ArrayList<Integer>> adj;
static boolean visited[];
  public static void main(String[] args) throws IOException{
   // Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("moocast.in"));
    FileWriter file = new FileWriter("moocast.out");
    BufferedWriter output = new BufferedWriter(file);

    int n =sc.nextInt();
    int [][] data = new int [n][3];
    for(int i =0;i<n;i++) {
    	data[i][0]=sc.nextInt();
    	data[i][1]=sc.nextInt();
    	data[i][2] = sc.nextInt();
    	
    	
    }
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<n;i++) {
    	for(int j=i;j<n;j++) {
    		int x1 = data[i][0];
    		int x2 = data[j][0];
    		int y1 = data[i][1];
    		int y2 = data[j][1];
    		int dist1 = data[i][2];
    		int dist2 = data[j][2];
    		int dist =(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
    		if(dist<=dist1*dist1) {
    			adj.get(i).add(j);
    		}
    		if(dist<=dist2*dist2) {
    			adj.get(j).add(i);
    		}
    	}
    }
    for(int i=0;i<n;i++) {
    	System.out.println(adj.get(i));
    }
    int ans=0;
    for(int i =0;i<n;i++) {
    	visited=new boolean [n];
    	ans=Math.max(dfs(i),ans);
    }


    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static int dfs(int node) {
	  if(visited[node]) {
		  return 0;
	  }
	  visited[node]=true;
	  int count =0;
	  for(int i :adj.get(node)) {
		  count+= dfs(i);
	  }
	  return count+1;
  }


}



