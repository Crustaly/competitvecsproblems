import java.util.*;
import java.lang.*;
import java.io.*;
public class teams{
static ArrayList<ArrayList<Integer>> adj;
static byte [] colors;
static boolean works;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    adj=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<m;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    colors=new byte [n];
    works=true;
    for(int i =0;i<n;i++) {
    	if(colors[i]==0) {
    		tree(i,(byte)1);
    	} 
    	
    }
    
    if(works) {
    	for(int i:colors) {
    		System.out.println(i);
    	}
    }
    else {
    	System.out.println("IMPOSSIBLE");
    }

  }
static void tree(int node,byte color) {
	if(colors[node]==0) {
		colors[node]=color;
		for(int i:adj.get(node)) {
			tree(i,color==1?(byte)2:1);
		}
	}
	else {
		if(colors[node]!=color) {
			works=false;
		}
		return;
	}
}

}



