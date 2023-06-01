import java.util.*;
import java.lang.*;
import java.io.*;
public class hibernation{
static int c,a,count,ans;
static int [] acorns;
static int [] bin;

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    c =sc.nextInt(); 
    a=sc.nextInt();
    acorns = new int [a];
   
    
    for(int i =0;i<a;i++) {
    	acorns[i]=sc.nextInt();
    }

    bin=new int [a];

   count =0;
   ans=0;
    subset(0);
    System.out.println(ans);

  }
  static void subset(int i) {
	
	  if(count<=c) {
		  
		 ans=Math.max(count,ans);
		 
		 }
	  if(count==c) {
	
	  }
	  if(i==a) {

		  return;
	  }
	  
	bin[i]=1 ;
	count+=acorns[i];
	
	subset(i+1);
	bin[i]=0;
    count-=acorns[i];
	subset(i+1);
  }
  
  }
  
  







