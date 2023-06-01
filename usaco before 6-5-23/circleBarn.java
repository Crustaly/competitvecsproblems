import java.util.*;
import java.lang.*;
import java.io.*;
public class circleBarn {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("cbarn.in"));
    FileWriter file = new FileWriter("cbarn.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [] curr =new int [n];
    for(int i =0;i<n;i++) {
    	curr[i]=sc.nextInt();
    }
    int ans=0;
    for(int i =0;i<n;i++) {
    	int count =0;
    	if(curr[i]!=0) {
    	while(curr[(count+i+1)%n]==0) {
    		count++;
    	}
    	
    	for(int j=0;j<Math.min(curr[i], count);j++) {
    		curr[(count+i-j)%n]++;
    		//add mod stuff
    		ans+=((count+i-j)-i)*((count+i-j)-i);
    	}
    	curr[i]=Math.max(curr[i]-count,0);
    	}
    	
    }


    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



