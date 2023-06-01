import java.util.*;
import java.lang.*;
import java.io.*;
public class convention{
	static int [] cows;
	static int m,c;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("convention.in"));
    FileWriter file = new FileWriter("convention.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    m =sc.nextInt();
    c =sc.nextInt();
    
    cows = new int [n];
    for(int i =0;i<n;i++) {
    	cows[i]=sc.nextInt();
    }
    Arrays.sort(cows);
    
    //binary search lower bound
    
    int l =0;
    int r=cows[n-1];
    
    while(l<=r) {
    	int mid = (l+r)/2;
    	
    	if(check(mid)) {
    	
    		r=mid-1;
    	}
    	else {
    		l=mid+1;
    	}
    }
    System.out.println(l);




    output.write(String.valueOf(l));

    output.close();
  }
  static boolean check(int a) {
	  int bus = 1;
	  int cinb = 0;
	  int first =cows[0];
	  
	  for(int i =0;i<cows.length;i++) {
		
		  if(cows[i]-first>a||cinb>=c) {
			  bus++;
			  cinb=0;
			  first=cows[i];
			  
		  }
		  cinb++;

		  }
	  return bus<=m;
	  }
  }






