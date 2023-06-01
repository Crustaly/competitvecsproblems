import java.util.*;
import java.lang.*;
import java.io.*;
public class angryCow {
static int k,n;
static int [] cows;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("angry.in"));
    FileWriter file = new FileWriter("angry.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    k =sc.nextInt();
    cows = new int [n];
    for(int i=0;i<n;i++) {
    cows[i]=sc.nextInt();
    }
    int l=0;
    int h=Integer.MAX_VALUE;
    Arrays.sort(cows);
    while(l<h) {
    	int mid =(h+l)/2;
    	if(works(mid)) {
    		h=mid;
    	}
    	else {
    	l=mid+1;
    	}
    	}
    output.write(l);
    System.out.println(l);
    output.close();
    }

  
static boolean works (int r ) {
	int i =0;
	int count=0;
	
	while(i<n) {
		
		count++;

		int start = cows[i];
		i++;
		while(i<n&&cows[i]<=start+2*r)i++;
		

			
	}

	
	return count<=k;
}


}



