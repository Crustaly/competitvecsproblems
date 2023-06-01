import java.util.*;
import java.lang.*;
import java.io.*;
public class socailDIst{
static int n, m;
static int[][] endpoints;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("socdist.in"));
    FileWriter file = new FileWriter("socdist.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    m =sc.nextInt();
    endpoints = new int [m][2];
    for(int i =0;i<m;i++) {
    	endpoints[i][0]=sc.nextInt();
    	endpoints[i][1]=sc.nextInt();
    }
    Arrays.sort(endpoints, (e1,e2)->(e1[0]-e2[0]));
    int high =7;
    		//Math.pow(10,9);
    int low =0;
    while(low<=high) {
    	int mid = (low+high)/2;
    	if(works(mid)) {
    		low=mid+1;
    	}
    	else {
    		high = mid-1;
    	}
    }



    System.out.println(high);

    output.write(String.valueOf(low));

    output.close();
  }
static boolean works(int total) {
	int index=0;
	total--;
	int currNum=endpoints[0][0];
	while(index<n&&total>0&&currNum<endpoints[m-1][1]) {
		if(currNum+total<=endpoints[index][1]) {
			currNum+=total;
			total--;
		}
		else {
			index++;

		}
	}
	if(total<=0) {
		return true;
	}
	return false;
}

}



