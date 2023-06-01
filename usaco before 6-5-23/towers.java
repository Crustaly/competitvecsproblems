import java.util.*;
import java.lang.*;
import java.io.*;
public class towers {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   
    int n =sc.nextInt();
    int [] block=new int [n];
    for(int i =0;i<n;i++) {
    	block[i]=sc.nextInt();
    }
    TreeMap<Integer,Integer> towers= new TreeMap<>();
    int t = 0;
    for(int i =0;i<n;i++) {

    	if(towers.higherKey(block[i])==null) {
    		towers.put(block[i],1);
    	}
    	else {
    		t=towers.higherKey(block[i]);
    		towers.put(t,towers.get(t)-1);
    		if(towers.get(t)==0) {
    			towers.remove(t);
    		}
    		towers.put(block[i],towers.getOrDefault(block[i]+1,1));
    	}
    }
    System.out.println(towers.size());



  }


}



