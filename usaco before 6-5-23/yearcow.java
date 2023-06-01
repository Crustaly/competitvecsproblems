import java.util.*;
import java.lang.*;
import java.io.*;
public class yearcow{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();
    int k =sc.nextInt();
    int [] years = new int [n];
    for(int i =0;i<n;i++) {
    	years[i]=sc.nextInt();
    }
    Arrays.sort(years);
    int max = years[n-1]+12-(years[n-1]%12);
    ArrayList<Integer> gaps = new ArrayList<Integer>();

    
    int index = n-1;
    int add =0;
    
    for(int i =max/12 -1;i>=0;i--) {
    	boolean found = false;
    	while(index>=0&&years[index]>i*12) {
    		//
    		found=true;
    		index--;
    	}
    	if(!found) { 
    		add++;
    	}
    	else {
    		gaps.add(add);
    		add = 0;
    	}
    }
    gaps.add(add);
    Collections.sort(gaps);
    for(int i =0;i<k-1;i++) {
    	max -= gaps.get(gaps.size()-i-1)*12;
    }
    System.out.println(max);
  }
  
}