import java.util.*;
import java.lang.*;
import java.io.*;
public class sabotage {
static int [] m;
static int total,n;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in); 
    //Scanner sc = new Scanner(new File("fenceplan.in"));
    FileWriter file = new FileWriter("fenceplan.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    //
    m=new int[n];
    total = 0;
    for(int i =0;i<n;i++) {
    	m[i]=sc.nextInt();
    	total+=m[i];
    } 
    double l=1.0;
    double h=10000;
    while(round(l)!=round(h)) {
    	double mid = (l+h)/2;
    	if(works(mid)) {
    		h=mid;
    	}
    	else {
    	l=mid;
    	}
    }



    output.write(String.format( "%.3f%n", (double)round(l)/1000));

    output.close();
  }
  static boolean works(double k) {
	  double current=m[1]-k;
	 double max=m[1]-k;
	  for(int i =2;i<n-1;i++) {
		  if(current<0) {
			  current=0;
		  }
		  current+=m[i]-k;
		  if(current>max) {
			  max=current;
		  }
	  }
	  return max>=total-k*n;
  }
  static int round(double a) {
	  return (int) ((int)1000*a + .5);
  
  }


}



