import java.util.*;
import java.lang.*;
import java.io.*;
public class load {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("balancing.in"));
    FileWriter file = new FileWriter("balancing.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [] xMid = new int [n];
    int [] yMid = new int [n];
    int [] y = new int [n];
    int [] x = new int [n];
    
    int [] dirx = {1,1,-1,-1};
    int [] diry = {1,-1,1,-1};
    for(int i =0;i<n;i++) {
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	xMid[i]=a;
    	yMid[i]=b;
    	x[i]=a;
    	y[i]=b;
    }
    Arrays.sort(xMid);
    Arrays.sort(yMid);
    int ans=Integer.MAX_VALUE;
    int mx=0;
    int my=0;
    if(n%2==1) {
    	mx = xMid[n/2];
    	my = yMid[n/2];
    }
    else {
    	mx = (xMid[n/2]+xMid[(n-1)/2])/2;
    	my = (yMid[n/2]+yMid[(n-1)/2])/2;
    }
 if(n%2==1) {
for(int k=0;k<4;k++ ) {
	int midx = mx+dirx[k];
	int midy = my+diry[k];
	   int q1=0,q2=0,q3=0,q4=0;
    for(int i =0;i<n;i++) {
    	if(x[i]<midx&&y[i]<midy) {
    		q1++;
    	}
    	else if(x[i]<midx&&y[i]>midy) {
    		q2++;
    	}
    	else if(x[i]>midx&&y[i]<midy) {
    		q3++;
    	}
    	else {
    		q4++;
    	}
    }
    	int big = Math.max(q4, Math.max(Math.max(q1, q2), q3));
    	ans=Math.min(ans, big);
    
}
 }
 else {
	 int midx = mx;
		int midy = my;
		   int q1=0,q2=0,q3=0,q4=0;
	    for(int i =0;i<n;i++) {
	    	if(x[i]<midx&&y[i]<midy) {
	    		q1++;
	    	}
	    	else if(x[i]<midx&&y[i]>midy) {
	    		q2++;
	    	}
	    	else if(x[i]>midx&&y[i]<midy) {
	    		q3++;
	    	}
	    	else {
	    		q4++;
	    	}
	    }
	    	ans = Math.max(q4, Math.max(Math.max(q1, q2), q3));

 }





    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



