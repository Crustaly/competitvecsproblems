import java.util.*;
import java.lang.*;
import java.io.*;
public class usaco {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("diamond.in"));
    FileWriter file = new FileWriter("diamond.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    List<Integer>ans = new ArrayList<Integer>();
    int [] d = new int [n];
    for(int i=0;i<n;i++) {
    	d[i]=sc.nextInt();
    }
    int l=0;
    int r=0;
    Arrays.sort(d);
    int [] Before= new int [n]; 
    int [] After = new int [n];
    while(r<=n-1) {
    	if(d[r]-d[l]<=m) {
    		Before[r]=r-l+1;
    		After[l]=r-l+1;
    		r++;
    	}
    	else if(d[r]-d[l]>m) {
    		l++;
    	}
    }
    int maxB=0;
    int max=0;
    System.out.println(Arrays.toString(Before));
    System.out.println(Arrays.toString(After));
    for(int i =0;i<n-1;i++) {
        maxB=Math.max(maxB, Before[i]);
        System.out.println(max);
        max=Math.max(max, maxB+After[i+1]);
    }
  

    System.out.println(max);

    output.write(String.valueOf(max));

    output.close();
  }


}



