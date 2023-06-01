import java.util.*;
import java.lang.*;
import java.io.*;
public class subsets {
static int f,m,n;
static double max;
static int [] elements;
static int [] forces, masses,ans;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    f=sc.nextInt();
    m=sc.nextInt();
    n =sc.nextInt(); 
    max =f/m;

   forces = new int [n];
   masses = new int [n];
   ans=new int [n];
    elements = new int [n];
    for(int i =0;i<n;i++) {
    	forces[i]=sc.nextInt();
    	masses[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++) {
    	subset(i+1, 0,0);
    }
    if(max==f/m) {
    System.out.println("NONE");
    }
    else {
        for(int i =0;i<n;i++) {
        	if(ans[i]==1) {
        	
        	System.out.println(i+1);
        	}
        	
    }
    }
}
    


  
  static void subset(int limit,int e, int subsetsize) {
	 
	  
	  if(e==n&&subsetsize==limit) {
		double now =0;
		int force=f;
		int mass =m;
		 for(int pl =0;pl<n;pl++){
			 if(elements[pl]==1) {
				 force+=forces[pl];
				 mass+=masses[pl];
			 
			 		 }
		 }
		 now=(double)force/mass;

		 if(now>max) {
	max=now;
			 for(int i =0;i<n;i++) {
				 ans[i]=elements[i];
				 
			 }
		 }

		
		 return;
		 }
	  if(e==n) {
		  return;
	  }
	  
	if(subsetsize<limit) {
		elements[e]=1;
		
		subset(limit, e+1,subsetsize+1);
	}
	elements[e]=0;
	subset(limit, e+1, subsetsize);
	  }
  }
  
  







