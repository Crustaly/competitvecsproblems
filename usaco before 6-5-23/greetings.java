import java.util.*;
import java.lang.*;
import java.io.*;
public class greetings {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int b =sc.nextInt();
    int e =sc.nextInt();
    int [] bAmount = new int [b];
    char [] bDir = new char [b];
    int [] eAmount = new int [e];
    char [] eDir = new char [e];
    int bmax = 0;
    int emax=0;
    for(int i =0;i<b;i++) {
    	bAmount[i]=sc.nextInt();
    	bDir[i]=sc.next().charAt(0);
    	bmax+=bAmount[i];
    }
    for(int i =0;i<e;i++) {
    	eAmount[i]=sc.nextInt();
    	eDir[i]=sc.next().charAt(0);
    	emax+=eAmount[i];
    }
    int size=Math.max(emax, bmax);
    int []bsim=new int [size+1]; 
    int []esim=new int [size+1]; 
    

    int index =0;
    for(int i =0;i<b;i++) {
    int dir = 0;
    if(bDir[i]=='L') dir = -1;
    else dir = 1;
    for(int k =0;k<bAmount[i];k++,index++) {
    	bsim[index+1]= bsim[index]+dir;
    }
    }
    for(int i =bmax;i<size+1;i++) {
    	bsim[i]=bsim[bmax-1]+1;
    }
    index =0;
    for(int i =0;i<e;i++) {
    int dir = 0;
    if(eDir[i]=='L') dir = -1;
    else dir = 1;
    for(int k =0;k<eAmount[i];k++,index++) {
    	esim[index+1]= esim[index]+dir;
    }
    }
    for(int i =emax;i<size+1;i++) {
    	esim[i]=esim[emax-1]+1;
    }
    int ans =0;
    for(int i =1;i<size+1;i++) {
      if(esim[i-1]!=bsim[i-1]&&esim[i]==bsim[i]) {
    	  ans++;
      }
    }
    //if(stepsBessie==11) {
    //	ans+=1;
   // }
    
 
 


    System.out.println(ans);

}


}



