import java.util.*;
import java.lang.*;
import java.io.*;
public class pencil{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int n =sc.nextInt();
    
    int [][] lines = new int [n][2];
    //1 for R, -1 for L
    for(int i=0;i<n;i++) {
    	lines[i][0]=sc.nextInt();
    	if(sc.next().equals("R")) {
    		lines[i][1]=1;
    	}
    	else {
    		lines[i][1]=-1;
    	}
    	
    }
    int nop =0;
  Pair [] intervals = new Pair [n];
    
    for(int i =0;i<n;i++) { 
    	
    	nop+=lines[i][0]*lines[i][1];
    	if(nop>0&&lines[i][1]==-1) {
    		  intervals[i]=new Pair(Math.max(0,nop-lines[i][0]), nop);
    
    
    	}
    	else if(nop<0&&lines[i][1]==1) {
    		intervals[i]=new Pair(Math.min(0,nop-lines[i][0]), nop);
    
    	
    	}
 
    }
   	Arrays.sort(intervals);
    int s =intervals[1].start;
    int p=intervals[1].end;
    int total =0;
    for(int i=1;i<n;i++) {
    	if(intervals[i].start>p) {
    		s+=intervals[i].end-intervals[i].start;
    		p=intervals[i].end;
    	}
    	else if(intervals[i].end>p) {
    		s+=intervals[i].end-p;
    		p=intervals[i].end;
    	}

    	
    }
    System.out.println(s);
   




  }
  static class Pair implements Comparable<Pair>{
  int start, end;
  public Pair(int x, int y) {
	  start = x;
	  end=y;
	  
  }
  public int compareTo(Pair x) {
	  if(this.start==x.start) {
			return(int)(this.end-x.end);
			}
			else {
				return(this.start-x.start);
			}
  }
  }
  }




