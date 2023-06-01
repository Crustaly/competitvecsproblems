
import java.util.*;
public class coverIt {
	static ArrayList<ArrayList<Integer>> adj;
	static int bcount,wcount;
	static int []color;
	static boolean works;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int poo = sc.nextInt();
    for(int moo=0;moo<poo;moo++){
    	int n=sc.nextInt();
    	int m=sc.nextInt();
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
        color=new int [n];
    	works=true;
    	bcount=0;
    	wcount=0;
    	dfs(1,0);
    	if(!works) {
    		System.out.println("IMPOSSIBLE");
    	}
    	else {
    		int lookfor=0;
    		if(bcount<wcount) {
    			System.out.println(bcount);
    			lookfor=1;
    		}
    		else {
    			System.out.println(wcount);
    			lookfor=2;
    		}
    		for(int i =0;i<n;i++) {
    			if(color[i]==lookfor) {
    				System.out.print((i+1)+" ");
    			}
    		}
    		System.out.println();
    	}

      
    }
  }
  static void dfs(int c, int node) {
	  if(c==3-color[node]) {
		  works=false;
	  }
	  if(c==1) {
		  bcount++;
	  }
	  if(c==2) {
		  wcount++;
	  }
	  color[node]=c;
	  for(int i:adj.get(node)) {
		  if(color[i]==0) {
			  dfs(3-c,i);
		  }
	  }
  }
}



