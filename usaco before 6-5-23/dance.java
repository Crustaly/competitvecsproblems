import java.util.*;
import java.lang.*;
import java.io.*;
public class dance {
static int []cows;
static int m;
  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("cowdance.in"));
    FileWriter file = new FileWriter("cowdance.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
     m =sc.nextInt();
       
    cows = new int [n];
    for(int i =0;i<n;i++) {
    	cows[i]=sc.nextInt();
    }
    int l=0;
    int r=n;
    
    while(l<r){
    	int mid =(l+r)/2;
    	if(simulate(mid)) {
    		r=mid;
    		
    	}
    	else {
    	l=mid+1;
    	}
    	
    }



    System.out.println(l);

    output.write(String.valueOf(l));

    output.close();
  }
  static boolean simulate(int a) {
	 
      PriorityQueue<Integer> dancing = new PriorityQueue<Integer>();
	  for(int i =0;i<cows.length;i++) {
		  if(dancing.size()<a) {
			  dancing.add(cows[i]);
		  }
		  else{
		
			  dancing.add(dancing.remove()+cows[i]);
		  }
		
	  }
int time = Integer.MAX_VALUE;
		while (dancing.size() > 0) {
			time= dancing.remove();
		}
	  return time<=m;
  }


}



