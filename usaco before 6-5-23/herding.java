import java.util.*;
import java.lang.*;
import java.io.*;
public class herding {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("herding.in"));
    FileWriter file = new FileWriter("herding.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [] cows = new int [n];
    
    for(int i =0;i<n;i++) {
    	cows[i]=sc.nextInt();
    }
    Arrays.sort(cows);
  
    int min=Integer.MAX_VALUE;
    int max=0;
    if((cows[n-2]-cows[0]==n-2&&cows[n-1]-cows[n-2]>2)||(cows[n-1]-cows[1]==n-2&&cows[1]-cows[0]>2)) {
    	min=2;
    }
    else {
    	int j = 0;

		for (int i = 0; i < n; i++) {
			while (j < n-1 && cows[j+1] - cows[i] < n) j++;
			min = Math.min(min, n-(j-i+1));
		}

    	    
    	
    }
    int tot =0;
    for (int i = 0; i < n; i++) {
		if(i > 0)
			tot += (cows[i]-cows[i-1]-1);
	}

    max=Math.max(tot-(cows[1]-cows[0]-1),tot-(cows[n-1]-cows[n-2]-1));
    
    
    


    System.out.println(min);
    System.out.println(max);

    output.write(String.valueOf(min+"\n"));
    output.write(String.valueOf(max));
    output.close();
  }


}



