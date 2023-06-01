import java.util.*;
import java.lang.*;
import java.io.*;
public class moop {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("moop.in"));
    FileWriter file = new FileWriter("moop.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [][] particles = new int [n][2];
    for(int i =0;i<n;i++) {
    	particles[i][0]=sc.nextInt();
    	particles[i][1]=sc.nextInt();
    }
    Arrays.sort(particles,(e1,e2)-> compare(e1,e2));
    int [] minYL = new int [n];
    minYL[0]=particles[0][1];
    for(int j=1;j<n;j++) {
    	minYL[j]=Math.min(minYL[j-1],particles[j][1]);
    }
    int [] maxYR = new int [n];
    maxYR[n-1]=particles[n-1][1];
    for(int j=n-2;j>=0;j--) {
    	maxYR[j]=Math.max(maxYR[j+1],particles[j][1]);
    }
    int ans =1;
    for(int i =1;i<n;i++) {
    	if(particles[i][0]==particles[i-1][0]) {
    		continue;
    	}
    	if(minYL[i-1]>maxYR[i]) {
    		ans++;
    	}
    }

    System.out.println(ans);

   // output.write(String.valueOf(ans));
//
   // output.close();
  }
static int compare(int [] e1, int []e2) {
	if(e1[0]==e2[0]) {
		return e1[1]-e2[1];
	}
	return e1[0]-e2[0];
}

}



