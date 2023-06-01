import java.util.*;
import java.lang.*;
import java.io.*;
public class conceirto {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int m =sc.nextInt();
    TreeMap<Integer, Integer> ticks=new TreeMap<Integer,Integer>();
    for(int i =0;i<n;i++) {
    	int tick = sc.nextInt();
    	if(ticks.containsKey(tick)) {
    		ticks.put(tick,ticks.get(tick)+1);  	}
    else {
    	ticks.put(tick, 1);
    }
    }
    for(int i=0;i<m;i++) {
    	int c=sc.nextInt();
    	if(ticks.lowerEntry(c+1)==null) {
    		System.out.println(-1);
    		continue;
    	}
    	int val = ticks.lowerKey(c+1);
    	System.out.println(val);

    	ticks.put(val, ticks.get(val)-1);
    	if(ticks.get(val)==0) {
    		ticks.remove(val);
    	}
    	
    }

  }


}



