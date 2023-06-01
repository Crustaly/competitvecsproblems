import java.util.*;
import java.lang.*;
import java.io.*;
public class planes {
static int a,b,n,m;
static ArrayList<ArrayList<Integer>> adj ;


  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
    m =sc.nextInt();
    a =sc.nextInt()-1;
    b=sc.nextInt()-1; 
     

    adj =new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<m;i++) {
    	int po = sc.nextInt()-1;
    	int pa =sc.nextInt()-1;
    	adj.get(po).add(pa);
    
    }

    Queue<Integer> q= new LinkedList<Integer>();
    int [] distance = new int [n];
    boolean[] visited = new boolean [n];
    Arrays.fill(distance,-1);
 
    q.add(a);
    distance[a]=0;
    visited[a]=true;

    while(!q.isEmpty()) {
    	int currNode = q.poll();
     	for(int i :adj.get(currNode)) {
    		if(!visited[i]) {
    			visited[i]=true;
    			distance[i]=distance[currNode]+1;
    			q.add(i);
    		}
    	}

    }
System.out.println(distance[b]);

    
    }

  }






