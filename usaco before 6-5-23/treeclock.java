import java.util.*;
import java.lang.*;
import java.io.*;
public class treeclock {
static int [] num;
static ArrayList<ArrayList<Integer>> adj;
static int coc,ctc,coa,cta;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("clocktree.in"));
    FileWriter file = new FileWriter("clocktree.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    num=new int [n];
    adj=new ArrayList<ArrayList<Integer>> ();
    for(int i =0;i<n;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    for(int i =0;i<n;i++) {
    	num[i]=sc.nextInt();
    }
    for(int i =0;i<n-1;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	adj.get(a).add(b);
    	adj.get(b).add(a);
    }
    coa=0;
    cta=0;
    coc=0;
    ctc=0;
    dfs(0,true,-1);

    if(coa%12==cta%12) {
    	System.out.println(coc+ctc);
    	output.write(String.valueOf(coc+ctc));
    }
    else if((coa-1)%12==cta%12) {
    	System.out.println(coc);
    	output.write(String.valueOf(coc));
    }
    else if((coa+1)%12==cta%12) {
    	System.out.println(ctc);
    	output.write(String.valueOf(ctc));
    }
    else {
    	System.out.println(0);
    }


    output.close();
  }
  static void dfs(int node, boolean color, int parent) {
	  if(color) {
		  coa=(coa+num[node]);
		  coc++;
	  }
	  else {
		  cta=(cta+num[node]);
		  ctc++;
	  }
	  for(int i :adj.get(node)) {
		  if(i!=parent) {
			  dfs(i,!color, node);
		  }
	  }
  }


}



