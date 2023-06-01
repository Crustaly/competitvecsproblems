import java.util.*;
import java.lang.*;
import java.io.*;
public class hills{

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] hills=new int [n];
    int arrmin = Integer.MAX_VALUE;
    int arrmax = 0;
    for(int i =0;i<n;i++){
        hills[i]=sc.nextInt();
        arrmax=Math.max(arrmax, hills[i]);
        arrmin=Math.min(arrmin, hills[i]);
    }

  int ans = Integer.MAX_VALUE;
    for(int i =arrmin;i<=arrmax;i++) {
    	int cost= costForRange(i,(i+17),hills);
    	
    
    
    	if(cost<ans) {
    		
    		ans=cost;
    	}
    }
    System.out.println(ans);


  }
  static int costForRange(int s,int e, int [] hills){
      int cost =0;
      for(int i:hills){

          if(i<s){
              cost+=(s-i)*(s-i);
           
          }
          else if(i>e){
        	  cost+=(i-e)*(i-e);
          
          }
      }

      return cost;
  }


}

