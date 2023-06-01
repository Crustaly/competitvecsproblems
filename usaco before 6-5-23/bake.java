import java.util.*;
import java.lang.*;
import java.io.*;
public class bake{
static int v,g;
static int [] minReqs,totalIngredients,min;
static int [][] mixtures;
static int [] bin;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    v =sc.nextInt(); 
    minReqs = new int [v];
   
    
    for(int i =0;i<v;i++) {
    	minReqs[i]=sc.nextInt();
    }
    g=sc.nextInt();
    mixtures = new int [g][v];
    for(int i =0;i<g;i++) {
    	for(int j=0;j<v;j++) {
    		mixtures[i][j]=sc.nextInt();
    	}
    	
    }
    totalIngredients = new int [v];
    bin=new int [g];
    min=new int [g];
    Arrays.fill(min, 1);
   
    subset(0);

    
    int ansCount=0;

    for(int i =0;i<g;i++) {
    	if(min[i]==1) {
    		ansCount++;
    	}
    }
    System.out.print(ansCount+" ");
    for(int i =0;i<g;i++) {
    	if(min[i]==1) {
    		System.out.print(i+1+" ");
    	}
    }


  }
  static void subset(int i) {
	  
	  if(works(totalIngredients,minReqs)) {
		    if(!miniMUM(min,bin)) {
		    	for(int l=0;l<g;l++) {
		    		min[l]=bin[l];
		    	}
		    }
		 return;
		 }
	  if(i==g) {
		  return;
	  }
	  
	bin[i]=1 ;
	for(int q =0;q<v;q++) {
		totalIngredients[q]+=mixtures[i][q];
	}
	
	subset(i+1);
	bin[i]=0;
	for(int q =0;q<v;q++) {
		totalIngredients[q]-=mixtures[i][q];
	}
	subset(i+1);
  }
  static boolean works(int [] a,int[]b) {
	  
	 for(int i =0;i<v;i++) {
		 if(a[i]<b[i]) {
			 return false;
			
		 }
	 }
	 return true;
  }
  static boolean miniMUM(int [] a,int []b) {
	  int ac = 0;
	  int bc=0;
	  for(int i=0;i<g;i++) {
		  if(a[i]==1) {
			  ac++;
		  }
		  if(b[i]==1) {
			  bc++;
		  }
	  }
	  if(ac>bc) {
		  return false;
	  }
	  if(ac==bc) {
		  for(int i=0;i<g;i++) {
			  if(a[i]==1&&b[i]!=1) {
				  return true;
			  }
			  if(a[i]!=1&&b[i]==1) {
				  return false;
			  }
		  }
	  }
	  return true;
  }
  }
  
  







