import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;
public class apple{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int pa= sc.nextInt();
    int ka= sc.nextInt();
    int pb= sc.nextInt();
    int kb= sc.nextInt();
    int f = sc.nextInt();
    //only use cheapest fridge, for the extra, 
    //check if other fridge is cheaper
    double costa = (double)pa/(double)ka;
    double costb = (double)pb/(double)kb;

    int bestp= 0;
    int bestk=0;
    int cost =0;
    int a =0;
    int b =0;
    int extra=0;
    
    if(costa<costb) {
    	bestp = pa;
    	bestk = ka;
    	//sub  cost
    	//find extra
    	//and a sum
        a+=f/ka;
        extra = f- f/ka;
        cost+=(f/ka) *pa;
    }
    else {
    	bestp = pb;
    	bestk = kb;
    	 b+=f/kb;
         extra = f- f/kb;
         cost+=(f/kb) *pb;
    }
    
    //extra in a
    int roundsa = extra/ka;
    if(extra-(roundsa*ka)>0) {
    	roundsa++;
    }
    int pricea = roundsa*pa;
    
    //for b
     int roundsb = extra/kb;
    if(extra-(roundsb*kb)>0) {
    	roundsb++;
    }
    int priceb = roundsb*pb;
    if(pricea<priceb) {
    	a+=roundsa;
    	cost+=pricea;
    }
    else {
    	b+=roundsb;
    	cost+=priceb;
    }
    System.out.println(a+" "+b+" "+cost);
    

    

   
    
  }
}
