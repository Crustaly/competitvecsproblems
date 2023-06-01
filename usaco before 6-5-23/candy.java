import java.util.*;
import java.lang.*;
import java.io.*;
public class candy {
static int [] dist;
static int n,pos;
static ArrayList <Integer>[] same, diff;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

 n =sc.nextInt();
    int k =sc.nextInt();
    same =new ArrayList [n];
    diff = new ArrayList [n];
    for(int i=0;i<n;i++) {
    	same[i]=new ArrayList<Integer>();
    	diff[i]=new ArrayList<Integer>();
    }
    for(int i =0;i<k;i++) {
    	String t = sc.next();
    	int a = sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	int c=Math.max(a,b);
    	a=Math.min(a, b);
    	if(t.equals("S")) {
    		same[c].add(a);
    	}
    	else {
    	     diff[c].add(a);
    	}
    }
    
    dist =new int [n];
    dist[0]=0;
    
    System.out.println(3*cand(1));
  }

static  int cand(int ind) {
    if(ind==n) {
    	return 1;
    }
    int pos = 0;
    for(int i =0;i<3;i++) {
    	boolean works = true;
    	for(int j:same[ind]) {
    		if(dist[j]!=i) {
    			works =false;
    			break;
    		}
    	}
    	if(!works) {
    		continue;
    	}
    	
    	for(int j:diff[ind]) {
    		if(dist[j]==i) {
    			works =false;
    			break;
    		}
    	}
    	if(!works) {
    		continue;
    	}
    	dist[ind]=i;
    	pos+=cand(ind+1);
    	
    	
    }
    return pos;
}
}



