import java.util.*;
import java.lang.*;
import java.io.*;
public class cellT {
	static int [] cities, towers;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    
    int n =sc.nextInt();
    int m =sc.nextInt();
    
    cities = new int [n];
    towers = new int [m];
    
    for(int i =0;i<n;i++) {
    	cities[i]=sc.nextInt();
    }
    for(int i =0;i<m;i++) {
    	towers[i]=sc.nextInt();
    }
    long l=0;
    long h=Integer.MAX_VALUE;
    while(l<h) {
    	
    	long mid = (l+h)/2;

    	if(works(mid)) {
    		
    		h=mid;
    	}
    	else {
    		l=mid+1;
    	}
    }



    System.out.println(l);

  }
  static boolean works (long r) {
	  int t=0;
	  int c=0;
	  int citiesOn=0;
	  while(c<cities.length&&t<towers.length) {
		  if(cities[c]>=towers[t]-r&&cities[c]<=towers[t]+r) {
			  c++;
			  citiesOn++;
		  }
		  else {
			  t++;
		  }
	  }
	  return citiesOn==cities.length;
  }
}
  
  






