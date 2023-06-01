import java.util.*;
import java.lang.*;
import java.io.*;
public class ceReal{
static int [] cereal;
static int [][] fav;
static int count;
  public static void main(String[] args) throws IOException{
	  Scanner sc = new Scanner(new File("cereal.in"));
	    FileWriter file = new FileWriter("cereal.out");
	    BufferedWriter output = new BufferedWriter(file);

    int n =sc.nextInt();
    int m =sc.nextInt();
    
    cereal = new int [m];
    fav=new int[n][2];
    for(int i=0;i<n;i++) {
    	fav [i][0]=sc.nextInt()-1;
    	fav [i][1]=sc.nextInt()-1;
    }
     count =0;
    int [] ans = new int [n]; 

    for(int i=n-1;i>=0;i--) {
    	add(i,0);
    	ans[i]=count;
    }
    for(int i:ans) {
    	output.write(String.valueOf(i+"\n"));
    }
    output.close();
  }
  static void add(int node, int which) {

	  if(cereal[fav[node][which]]==0) {
		  cereal[fav[node][which]]=node;
		  count++;
		  return;
	  }
	  else if(cereal[fav[node][which]]<node) {
		return;
	  }
	  else {
		  int old = cereal[fav[node][which]];
		  cereal[fav[node][which]]=node;

		  if(fav[node][which]==fav[old][0]) {
		  add(old,1);
		  }
		  else {
			  return; 
		  }
	  }
  }
}