import java.util.*;
import java.lang.*;
import java.io.*;
public class qwewe {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();

    Queue<Integer> q = new LinkedList<>();
    String a = "";
    int b =0;
    List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();  
    for(int i = 0; i < n; i++)  {
        listOfLists.add(new ArrayList<Integer>());
    }
    while(sc.hasNext()) {
    	a=sc.next();
    	b=sc.nextInt();
    	if(a.equals("C")) {
    		q.add(b);
    	}
    	else {
    		
    		listOfLists.get(b-1).add(q.remove());
    	
    		
    		
    	}
    }
    for(int i=0;i<n;i++) {
    	System.out.print(listOfLists.get(i).size()+" ");
    	
    	for(int poo: listOfLists.get(i)) {
  
    		System.out.print(poo+" ");
    	}
    	System.out.println();
    }

    


  }


}



