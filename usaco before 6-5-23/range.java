import java.util.*;
import java.lang.*;
import java.io.*;
public class range {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int [] ans = new int [n];
    int [][] data = new int [n][n];
    for(int i =0;i<n;i++) {
    	for(int j=0;j<n-i;i++) {
        	data[i][j]=sc.nextInt();
    	}
    }
    ans [0]=0;
    for(int i=1;i<n;i++) {
    	ArrayList<Integer> possible = new ArrayList<Integer>();
    	int curMin=Integer.MAX_VALUE;
    	int curMax= 0;
    	for(int j =0;j<i-1;j++)
    	if(data[0][j+1]>data[0][j]) {
    		curMin
    	}
    	}
    }

    




    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }