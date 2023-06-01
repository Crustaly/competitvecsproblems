import java.util.*;
import java.lang.*;
import java.io.*;
public class rental {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("rental.in"));
    FileWriter file = new FileWriter("rental.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int r =sc.nextInt();
    Integer[] cows = new Integer[n];
    for(int i =0;i<n;i++) {
    	cows[i]=sc.nextInt();
    }
    int [][] milk = new int [m][2];
    for(int i=0;i<m;i++) {
    	milk[i][0]=sc.nextInt();
    	milk[i][1]=sc.nextInt();
    	
    }
    Integer [] rent = new Integer [r];
    for(int i =0;i<r;i++) {
    	rent[i]=sc.nextInt();
    }    
    
    Arrays.sort(milk, (a,b)->b[1]-a[1]);
    Arrays.sort(rent, (p,l)->l-p);
    Arrays.sort(cows, ( e1,  e2)->e2-e1);
    
    //for each cow see if it can make more money rent or milk
    //while there is still milk in the cow, get max milk and max rent
    //which ever is bigger, use it
    //if you are out of rent and milk, (keep variables) if milked = m
    //break
    int [] psum = new int [n];
    int cindex = 0;
    int mindex = 0;
    int[][]msum=new int [m+1][2];

    int milkers = 0;
 
    for(int i =1;i<m+1;i++) {
    	milkers+=milk[i-1][0];
    	msum[i][0]+=milkers;
    	msum[i-1][1]=milk[i-1][1];
    }
    
 
    int index = 0;
    int use = 0;
    long [] max = new long [n+1];
    for(int i =0;i<n;i++) {
    	max[i+1]+=max[i];
    	while(index<m&&cows[i]>0) {
    		use = Math.min(milk[index][0],cows[i] );
    		max[i+1]+=use*milk[index][1];
    		milk[index][0]-=use;
    		cows[i]-=use;
    		if(milk[index][0]==0){
    			index++;
    		}
    	}
    }
    int ir = 0;   
    int im=n-1;
    long ans =max[n];
    long rsum=0;
    System.out.println(max[n]);
    while(im>=0&&ir<r) {
    	rsum+=rent[ir];
    	if(ans>(max[im]+ rsum)) {
    		break;
    	}
    	
    	ans=Math.max(max[im]+ rsum, ans);
    	im--;
    	ir++;
    	
    }
    

System.out.println(ans);
   output.write(String.valueOf(ans));

    output.close();
  }


}



