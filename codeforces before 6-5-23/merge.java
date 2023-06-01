import java.util.*;
import java.lang.*;
import java.io.*;
public class merge{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
 
    
    ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
    lists.add(new ArrayList<Integer>());
    int num=sc.nextInt();
    lists.get(0).add(num);

    for(int i =1;i<n;i++) {
        num=sc.nextInt();
        
        
    	int l=0;
    	int h=lists.size();
    	boolean noSol = true;
    	while(l<h) {
    		int mid = (l+h)/2;
    		
    		
    		if(lists.get(mid).get(lists.get(mid).size()-1)<num) {
    			noSol=false;
    			h=mid;
    		}
    		else {
    		   l=mid+1;
    		}
    	}
    	
    	if (noSol) {
    		lists.add(new ArrayList<Integer>());
    	
    		lists.get(l).add(num);
    	}
    	else {
    		lists.get(l).add(num);
    	}
    }
    for (int i =0;i<lists.size();i++) {
		for (int j : lists.get(i)) System.out.print(j+" ");
		 System.out.println();
    }
   
  }


  }






