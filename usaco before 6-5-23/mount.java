import java.util.*;
import java.lang.*;
import java.io.*;
public class mount{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("mountains.in"));
    FileWriter file = new FileWriter("mountains.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [][] mount = new int [n][2];
    for(int i =0;i<n;i++) {
    	mount[i][0]=sc.nextInt();
    	mount[i][1]=sc.nextInt();
    	if(mount[i][0]>mount[i][1]) {
    		int temp =mount[i][0];
    		mount[i][0]=mount[i][1];
    		mount[i][1]=temp;
    	}
    }
    Arrays.sort(mount,(e1,e2)->compare(e1,e2));
        int right = -1;
    int ans = 0;
    for(int i =0;i<n;i++) {
    	if(mount[i][1]<right) {
    		ans++;
    		
    	}
    	right=Math.max(right, mount[i][1]);
    }
    
 

    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
static int  compare(int [] e1, int []e2) {
	if(e1[0]==e2[0]) {
		return e2[1]-e1[1];
	}
	else return e1[0]-e2[0];
}

}
