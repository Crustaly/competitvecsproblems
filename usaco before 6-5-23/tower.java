import java.util.*;
import java.lang.*;
import java.io.*;
public class tower {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    
    int n =sc.nextInt();
    int [] block=new int [n];
    for(int i =0;i<n;i++) {
    	block[i]=sc.nextInt();
    }
    
    List<Integer> towers = new ArrayList();
    
    for(int i=0;i<n;i++) {
    int lo = 0;
    int hi = towers.size();
    	while(lo<hi) {
    		int mid = (lo+hi)/2;
    		if(block[i]>=towers.get(mid) )lo=mid+1;
    		else hi=mid;
    	}
    	if(lo==towers.size()) {
    	towers.add(block[i]);
    	}
    	else {
    		towers.set(lo,block[i]);
    	}
    }




    System.out.println(towers.size());

  }


}



