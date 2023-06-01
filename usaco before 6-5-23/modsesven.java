import java.util.*;
import java.lang.*;
import java.io.*;
public class modsesven{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("div7.in"));
    FileWriter file = new FileWriter("div7.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [] ps = new int [n+1];

    for(int i =0;i<n;i++) {
    	ps[i+1]=(ps[i]+sc.nextInt())%7;
    }
    int [] last = new int [7];
    int ans =0;
    Arrays.fill(last, -1);
    for(int i =0;i<n+1;i++) {
       	if(last[ps[i]]==-1) {
        	last[ps[i]] = i;
        	}
       	else {
    	ans=Math.max(ans, i-last[ps[i]]);
       	}
    }
    
    
    
  


    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



