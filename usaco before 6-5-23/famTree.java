import java.util.*;
import java.lang.*;
import java.io.*;
public class famTree {
static String [] mother, daughter;
static boolean found;
static int relation;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("family.in"));
    FileWriter file = new FileWriter("family.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    String a =sc.next();
    String b=sc.next();
    mother=new String[n];
    daughter=new String[n];
    for(int i =0;i<n;i++) {
    	mother[i]=sc.next();
    	daughter[i]=sc.next();
    }
    String cow=a;
    int relation = 0;
    while(cow!=" ") {
    	if(isAncestor(cow, b)!=-1) {
    		break;
    	}
    }
    }
    found=false;
    relation=0;
    dfs(a,"crystal",0,b);
    if(found) {
    	if(relation==1) {
    		System.out.println(a+" is the mother of "+b);
    	}
    	else {
    		System.out.print(a+" is the ");
    	for(int i =0;i<relation-2;i++) {
    	     System.out.print("great-");
    	}
    	System.out.print("grand-mother of "+b);
    	}
    }
    else {
    	dfs(b,"crystal",0,a);
    	   if(found) {
    	    	if(relation==1) {
    	    		System.out.println(a+" is the mother of "+b);
    	    	}
    	    	else {
    	    		System.out.print(a+" is the ");
    	    	for(int i =0;i<relation-2;i++) {
    	    	     System.out.print("great-");
    	    	}
    	    	System.out.print("grand-mother of "+b);
    	    	}
    }

  }
  static void dfs(String node,String parent, int layer,String target) {
	  if(node.equals(target)) {
		  relation=layer;
		  found=true;
	  }
	  for(String i:adj.get(adj.indexOf(node))) {
		  if(!i.equals(parent)) {
			  dfs(i,node,layer+1,target);
		  }
	  }
  }


}



