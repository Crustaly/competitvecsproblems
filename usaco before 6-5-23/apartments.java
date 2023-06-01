import java.util.*;
import java.lang.*;
import java.io.*;
public class apartments{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

  
    int n =sc.nextInt();
    int m =sc.nextInt();
    int k =sc.nextInt();
    
    int [] apps= new int [n];
    int [] ppl = new int [m];
    
    int ai = 0;
    int pi = 0;

    for(int i =0;i<n;i++) {
    	apps [i]=sc.nextInt();
    }
    for(int i =0;i<m;i++) {
    	ppl [i]=sc.nextInt();
    }

   Arrays.sort(ppl);
    Arrays.sort(apps);
    int ans = 0;
 
    while(ai<n&&pi<m) {
  
    	if(ppl[pi]-k<=apps[ai]&&apps[ai]<=ppl[pi]+k) {
    		ans++;
    		ai++;
    		pi++;
    	}
    	else {
    		if(ppl[pi]<apps[ai]) {
    			pi++;
    		}
    		else {
    			ai++;
    		}
    	}
    }

   System.out.println(ans);
  }


}



