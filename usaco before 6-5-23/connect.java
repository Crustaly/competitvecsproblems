import java.util.*;
import java.lang.*;
import java.io.*;
public class connect {
static int [] colors;
static ArrayList<ArrayList<Integer>> adj;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    for(int p=0;p<t;p++) {
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
    	colors = new int [n];
    	Arrays.fill(colors,-1);

    	
    	dfs(0,0);
    	if(colors[n-1]==0) {
    	System.out.println(0);
    	
    	}
    	else {
    	dfs(n-1,1);
    	int c =2;
    	for(int i =0;i<n;i++) {
    		if(colors[i]==-1) {
    			dfs(i,c);
    			c++;
    		}}

    	long [] d2s=new long [n];
    	long [] c2s = new long [c];
    	Arrays.fill(c2s, Long.MAX_VALUE);
    	Arrays.fill(d2s, Long.MAX_VALUE);
    	int prev=-100000;
    	for(int i =0;i<n;i++) {
    		if(colors[i]==0)prev=i;
    		d2s[i]=Math.min(d2s[i],((long)i-prev)*((long)i-prev));
    		
    	}
    	prev=200000;
    	for(int i =n-1;i>=0;i--) {
    		if(colors[i]==0)prev=i;
    		d2s[i]=Math.min(d2s[i],((long)prev-i)*((long)prev-i));
    		c2s[colors[i]]=Math.min(c2s[colors[i]],d2s[i]);
    	}
    	
    	
    	
    	
    	long [] c2e = new long [c];
    	Arrays.fill(c2e, Long.MAX_VALUE);
    	long [] d2e=new long [n];
    	Arrays.fill(d2e, Long.MAX_VALUE);
    	prev=-100000;
    	for(int i =0;i<n;i++) {
    		if(colors[i]==1)prev=i;
    		d2e[i]=Math.min(d2e[i],((long)i-prev)*((long)i-prev));
    	}
    	prev=200000;
    	for(int i =n-1;i>=0;i--) {
    		if(colors[i]==1)prev=i;
    		d2e[i]=Math.min(d2e[i],((long)prev-i)*((long)prev-i));
    		c2e[colors[i]]=Math.min(c2e[colors[i]],d2e[i]);

    
    	}
 
    	long ans=Long.MAX_VALUE;
    	for(int i =0;i<c;i++) {
    		ans=Math.min(c2e[i]+c2s[i], ans);
    	}

    System.out.println(ans);
    	}
    }
    }
    

  
  static void dfs(int node,int color) {
	  colors[node]=color;

	  
	  for(int i :adj.get(node)) {
		  if(colors[i]==-1) {
		  dfs(i,color);
		  }
	  }
  }


}



