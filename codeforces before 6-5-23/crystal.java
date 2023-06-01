import java.util.*;
import java.lang.*;
import java.io.*;
public class crystal{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int n =sc.nextInt();
    int m =sc.nextInt();
    int[] stock = new int [s];
    for(int i=0;i<s;i++) {
    	stock[i]=sc.nextInt();
    }
    int peak =0;
    int valley =0;
    int totInc =0;
    int totDec=0;
    boolean inc =false;
    boolean dec= false;
    boolean newwInc =false;
    boolean newwDec = false;
    if(stock[0]<stock[1]) {
    	totInc++;
    	inc = true;
    	newwDec = true;
    }
    else {
    	totDec++;
    	dec= true;
    	newwInc = true;
    }
    for(int i =1;i<s;i++) {
    	if(stock[i-1]<stock[i]) {
    		if(dec=true&&totDec>=n&&totInc-1>=n) {
    			newwInc=true;
    			newwDec  =true;
    			peak++;
    			dec = false;
    			totDec=0;
 
    		}
    		if(newwInc) {
    			totInc++;
    		}
    		newwInc= false;
    		totInc++;
    		inc =true;
    	}
    	else {
    		if(newwDec) {
    			totDec++;
    		}
    		newwDec = false;
    		totDec++;
    		dec=true;
    	}
    }

    System.out.println(peak);

  }
}