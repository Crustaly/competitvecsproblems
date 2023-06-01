import java.util.*;
import java.lang.*;
import java.io.*;
public class milkVisitis {
static boolean [] values;
static int [] comps;
static int nums;
static ArrayList<ArrayList<Integer>> adj;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("milkvisits.in"));
    FileWriter file = new FileWriter("milkvisits.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    values = new boolean[n];
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    String input = sc.next();
    for(int i =0;i<n;i++) {
    	if(input.charAt(i)=='G') {
    		values[i]=true;
    	}
    	else {
    		values[i]=false;
    	}
    }

    for(int i=0;i<n-1;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }

    comps=new int[n];
    nums=0;

    
    for(int i =0;i<n;i++) {
   if(comps[i]==0) {
	   nums++;
	   dfs(i);
    		
   }
    	 
    }

    for(int i =0;i<m;i++) {
    	int start =sc.nextInt()-1;
    	int end =sc.nextInt()-1;
    	boolean a =sc.next().charAt(0)=='G';
    	if(comps[start]!=comps[end]||values[start]==a) {
    		output.write(String.valueOf(1));
    	}
    	else {
    	
    		output.write(String.valueOf(0));
    	}
    }

    output.close();
  }
  static void dfs(int node) {
	  if(comps[node]>0) {
		  return;
	  }
	  
	  comps[node]=nums;


	  for(int i:adj.get(node)) {
		  if(values[i]==values[node]) {
			  dfs(i);
		  }
	  }
  }


}



