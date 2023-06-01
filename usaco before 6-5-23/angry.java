import java.util.*;
import java.lang.*;
import java.io.*;
public class angry{
static int [] cows;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("angry.in"));
    FileWriter file = new FileWriter("angry.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    cows = new int [n];
    for(int i =0;i<n;i++) {
    	cows[i]=sc.nextInt()*2;
    }
    Arrays.sort(cows);
    
    int h=cows[n-1]-cows[0];
    int l =0;
    while(round(h)!=round(l)) {
    	int mid= (h+l)/2;
    	int lo = cows[0];
    	int hi=cows[n-1];
    	while(lo<hi){
    		int m =(lo+hi)/2;
    		if(worksR(m,mid)) hi=m;
    		else lo=m+1;
    	}
    	if(worksL(lo,mid)) {
    		h=mid;
    	}
    	else {
    		l=mid;
    	}
    	
    }
    System.out.println(l/2);
  }
  static boolean worksR(int start, int rad) {
	  int cur=start;
	  int nex=0;
	  //can detonate everything to the right?
	  while(cur<cows.length) {
		  while(nex+1<cows.length&&cows[nex+1]<=cur+rad) {
			  nex++;
		  }
		  if(cows[nex]==cur) {
			  return false;
		  }
		  cur=cows[nex];
		  rad-=2;
	  }
	  return true;
  }
  static boolean worksL(int start, int rad) {
	  int cur=start;
	  int nex=0;
	  //can detonate everything to the right?
	  while(cur>0) {
		  while(nex-1>0&&cows[nex-1]<=cur+rad) {
			  nex--;
		  }
		  if(cows[nex]==cur) {
			  return false;
		  }
		  cur=cows[nex];
		  rad-=2;
	  }
	  return true;
  }
  static int round(double a) {
	  return (int) ((int)10*a + .5);
  
  }


}



