import java.util.*;
import java.lang.*;
import java.io.*;
public class meeting {
static boolean leftHasMax, rightHasMax;
static int [][] ppl;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    double low =0;
    double high=0;
    ppl = new int [n][2];
    for(int i =0;i<n;i++) {
    	ppl[i][0]=sc.nextInt();
        high = Math.max(ppl[i][0],high);
    }
    for(int i =0;i<n;i++) {
    	ppl[i][1]=sc.nextInt();
    }
    double mid=0;
    double minAns = (double)Integer.MAX_VALUE;
    while(high-low>10e-7) {
    	mid=(low+high)/2;
    	minAns=Math.min(getTime(mid),minAns);
    	if(leftHasMax&&rightHasMax) {
    		break;
    	}
    	else if(leftHasMax) {
    		high=mid;
    	}
    	else low=mid;
    }
    System.out.printf("%.6f %n", minAns);



  }
  static double getTime(double mid) {
	  double distance=0;
	  double time=0;
	  double maxTime=0;
	  for(int i =0;i<ppl.length;i++) {
		  distance = Math.abs(ppl[i][0]-mid);
		  time=distance/ppl[i][1];
		  if(time>maxTime) {
			  leftHasMax=false;
			  rightHasMax=false;
			  if(ppl[i][0]-mid>0) rightHasMax=true;
			  else leftHasMax=true;
			  maxTime=time;
		  }
		  else if(maxTime==time) {
			  if(ppl[i][0]-mid>0) rightHasMax=true;
			  
			  else rightHasMax=true;
		  }
	  }
	  return maxTime;
  }


}



