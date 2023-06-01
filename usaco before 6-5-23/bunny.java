import java.util.*;
import java.lang.*;
import java.io.*;
public class bunny{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int m =sc.nextInt();
    int f =sc.nextInt();
    int n=m+f;
    int [][] bunnies= new int [f][m];
    
    String [] males = new String[m];
    for(int i =0;i<m;i++) {
    	males[i]=sc.next();
    }
    String [] females = new String[f];
    for(int i =0;i<f;i++) {
    	females[i]=sc.next();
    }
    boolean ok=false;
    for(int i =0;i<f;i++) {
    	for(int j=0;j<m;j++) {
    		int kids=0;
    		
    		for(int p =0;p<m;p++) {
    			if(males[j].equals(males[p])) {
    				continue;
    			}
    			ok=true;
    			for(int k=0;k<24;k++) {
    				if(males[j].charAt(k)!=males[p].charAt(k)&&females[i].charAt(k)!=males[p].charAt(k)) {
    			
    					ok=false;
    					break;
    				}
    			}
    			if(ok) {
        			bunnies[i][j]++;
        			}
    		}
    		
    		for(int p=0;p<f;p++) {
    			if(females[i].equals(females[p])) {
    				continue;
    			}
    			 ok=true;
    			for(int k=0;k<24;k++) {
    				if(males[j].charAt(k)!=females[p].charAt(k)&&females[i].charAt(k)!=females[p].charAt(k)) {
    					ok=false;
    					
    					break;
    				}
    			
    		}
    			if(ok) {
    				bunnies[i][j]++;
        			}
    	}


    }


    }

    for(int i =0;i<m;i++) {
    	for(int j=0;j<f;j++) {
    		System.out.print(bunnies[j][i]+" ");
    	}
    	System.out.println();
    }
  }
  
  }






