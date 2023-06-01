import java.util.*;
import java.lang.*;
import java.io.*;
public class revegetate{
static ArrayList<ArrayList<Integer>> same, diff;
static byte [] colors;
static boolean works;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("revegetate.in"));
    FileWriter file = new FileWriter("revegetate.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    same=new ArrayList<ArrayList<Integer>>();
    diff=new ArrayList<ArrayList<Integer>>();
    for(int i =0;i<n;i++) {
    	same.add(new ArrayList<Integer>());
    	diff.add(new ArrayList<Integer>());
    }
    colors=new byte [n];
    for(int i =0;i<m;i++) {
    	char t =sc.next().charAt(0);
    	int a=sc.nextInt()-1;
    	int b =sc.nextInt()-1;
    	if(t=='S') {
    		same.get(a).add(b);
    		same.get(b).add(a);
    	}
    	else {
    		diff.get(a).add(b);
    		diff.get(b).add(a);
    	}
    }
       
       int comps =0;
       works=true;
    for(int i =0;i<n;i++) {
        if(colors[i]==0) {
        	dfs(i,(byte)1);
        	comps++;
        }
    }
    if(works) {
    output.write(1);
    for(int i =0;i<comps;i++) {
    	output.write(0);
    }
    }
    else {
    	out.
    }





    output.write(String.valueOf(comps));

    output.close();
  }
  static void dfs(int node,byte color) {
	  colors[node]=color;
	  for(int i :same.get(node)) {
		  if(colors[i]==3-color) {
			  works=false;
		  }
		  if(colors[i]==0) {
			  dfs(i,(byte)color);
		  }
	  }
      for(int i :diff.get(node)) {
    	  if(colors[i]==color) {
			  works=false;
		  }
    	  if(colors[i]==0) {
			  dfs(i,(byte)(3-color));
		  }
	  }
  }


}



