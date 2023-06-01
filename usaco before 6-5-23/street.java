import java.util.*;
import java.lang.*;
import java.io.*;
public class street{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int [] lights=new int [m];
    NavigableSet<Integer> pos = new TreeSet<>();
    pos.add(0);
    pos.add(n);
    for(int i =0;i<m;i++) {
    	lights[i]=sc.nextInt();
    	pos.add(lights[i]);
    }
    int [] ans=new int [m];
    int maxGaps=0;
    int prev=0;
    for(int i:pos) {	
    	maxGaps=Math.max(maxGaps,i-prev);
    	prev=i;
    }
    ans[m-1]=maxGaps;
    for(int i =m-1;i>0;i--) {
    	pos.remove(lights[i]);
    	int upper= pos.higher(lights[i]);
    	int lower= pos.lower(lights[i]);
    	maxGaps=Math.max(maxGaps, upper-lower);
    	ans[i-1]=maxGaps;
    }
    for(int i:ans) {
    	System.out.println(i);
    }
    

  }


}



