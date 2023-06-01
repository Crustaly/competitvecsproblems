import java.util.*;
import java.lang.*;
import java.io.*;
public class convInt {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    long [] freqS = new long [5001];
    long [] freqE = new long [5001];
    int n =sc.nextInt();
    int m =sc.nextInt();
    for(int i =0;i<n;i++) {
    	freqS[sc.nextInt()]++;
    	freqE[sc.nextInt()]++;
    }
    long [] sumS= new long [2*m+1];
    long [] sumE= new long [2*m+1];
    for(int i=0;i<=m;i++) {
    	for(int j=0;j<=m;j++) {
    		sumS[i+j]+=freqS[i]*freqS[j];
    		sumE[i+j]+=freqE[i]*freqE[j];
    	}
    }
    long amount =0;
    for(int i =0;i<=2*m;i++) {
    	amount+=sumS[i];
    	System.out.println(amount);
    	amount-=sumE[i];
    } 

  }
}