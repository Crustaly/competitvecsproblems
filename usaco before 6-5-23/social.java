import java.util.*;
import java.lang.*;
import java.io.*;
public class social {
static int n,m;
static Pair [] intervals;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("socdist.in"));
    FileWriter file = new FileWriter("socdist.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    m =sc.nextInt();
    intervals = new Pair [m]; 
    for(int i =0;i<m;i++) {
    	intervals [i]=new Pair(sc.nextLong(),sc.nextLong());
    }
    Arrays.sort(intervals);
    
    long l=1;
    long h=intervals[m-1].end-intervals[0].start;

    while(l<=h) {
    	long mid = (l+h)/2;
    	if(works(mid)) {
    	l=mid+1;
    	}
    	else {
    		h=mid-1;
    	}
    }



    System.out.println(h);

    output.write(String.valueOf(h));

    output.close();
  }
  
  static boolean works (long po) {
	int numLeft = n-1;
	long position = intervals[0].start;
	for(int i =0;i<m;i++) {
	if(position+po<=intervals[i].start) {
		numLeft--;
		position = intervals[i].start;
	}
		while(position+po<=intervals[i].end) {
			position+=po;
			numLeft--;
		}
	}
	if(numLeft<=0) {
		return true;
	}
	return false;
	  
  }
  
  
static class Pair implements Comparable<Pair>{
	long start, end;
	public Pair(long x, long y) {
		start =x;
		end=y;
	}
	public int compareTo(Pair x) {
		if(this.start==x.start) {
		return(int)(this.end-x.end);
		}
		else {
			return(int)(this.start-x.start);
		}
		}
	}
}





