import java.util.*;
import java.lang.*;
import java.io.*;
public class swapity {
static ArrayList<Integer> cycle;
static int [] a;
static boolean [] visited;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("swap.in"));
    FileWriter file = new FileWriter("swap.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int k =sc.nextInt();
    a = new int [n];
    for(int i=0;i<n;i++) {
    	a[i]=i;
    }
    
    
    for(int i =0;i<m;i++) {
    	int l=sc.nextInt()-1;
    	int r=sc.nextInt()-1;
    	for(int j =0;j<(r-l+1)/2;j++) {
    		int temp = a[l+j];
    		a[l+j]= a[r-j];
    		a[r-j]=temp;
    	}
    }


    int id =0;
    visited=new boolean [n]; 
    for(int i =0;i<n;i++) {
    	if(!visited[i]) {
    	cycle = new ArrayList<Integer>();
    	makeCycle(i, i);
    	int mod = k%cycle.size();
    	for(int j=0;j<cycle.size();j++) {
    		a[cycle.get(j)]=cycle.get((j+mod)%cycle.size())+1;
    	}
    	}
    	
    }
    for(int i :a) {
    	output.write(String.valueOf(i+"\n"));
    }
    output.close();


  }
  static void makeCycle(int node, int src) {
	  visited[node]=true;
	  cycle.add(node);

	  if(a[node]!=src) {
		  makeCycle(a[node], src);
	  }
	  
  }
}