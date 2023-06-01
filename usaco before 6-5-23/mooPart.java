import java.util.*;
import java.lang.*;
import java.io.*;
public class mooPart{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("moop.in"));
    FileWriter file = new FileWriter("moop.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [][] values = new int [n][2];
    for(int i =0;i<n;i++) {
    	values[i][0]=sc.nextInt();
    	values[i][1]=sc.nextInt();
    }
    Arrays.sort(values, (e1,e2) -> compare(e1,e2));
    int [] max = new int [n+1];
    int ma=Integer.MIN_VALUE; 
    max[n]=Integer.MIN_VALUE;
    int [] min = new int [n];
    for(int i =n-1;i>=0;i--) {
    	ma = Math.max(ma, values[i][1]);
    	max[i]=ma;
    }
    int mi = Integer.MAX_VALUE;
    for(int i =0;i<n;i++) {
    	mi = Math.min(mi,values[i][1]);
    	min[i]=mi;
    }
    int count =1;
    
    for(int i =1;i<n;i++) {
    	if(values[i][0]==values[i-1][0]) continue;
    	if(min[i-1]>max[i]) {
    		count++;
    	}
    }
    System.out.println(count);
    output.write(String.valueOf(count));
    output.close();
    
  }
  static int compare(int [] e1, int []e2) {
		if(e1[0]==e2[0]) {
			return e1[1]-e2[1];
		}
		return e1[0]-e2[0];
	}

}