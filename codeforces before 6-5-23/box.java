import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class box {
  public static void main(String[] args) throws IOException{
	  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	  PrintWriter out=new PrintWriter(System.out);

    int poo = Integer.parseInt(sc.readLine());
    for(int moo=0;moo<poo;moo++){
    	int n= Integer.parseInt(sc.readLine());
    	    boolean [] used =new boolean [n];
    	    int currLeft=0;
    	 String [] max = new String [n];

    		 max=sc.readLine().split(" ");
 
    	 int [] ans = new int [n];
    	 ans[0]=Integer.parseInt(max[0])-1;

    	 used[ans[0]]=true;
    	 boolean works = true;
    	 for(int i =1;i<n;i++) {
    		 int a =Integer.parseInt(max[i])-1;
    		 if(!used[a]) {
    			 ans[i]=a;
    			 used[a]=true;
    		 }
    		 else {
    			 while(currLeft<a&&used[currLeft]){
    				 currLeft++;
    			 }
    		 if(currLeft<a) {
    				 ans[i]=currLeft;
    				 currLeft++;
    			 }
    		 else {
    			 works = false;
    			 break;
    		 }
    		 }
    		
    	 }
    	 
    	 if(works) {
    		 for(int i:ans) {
    			 out.write(i+1+" ");
    		 }
    		 out.write("\n");
    	 }
    	 else out.write(String.valueOf(-1+"\n"));
    	 
      
    }
    out.close();
  }
  
}



