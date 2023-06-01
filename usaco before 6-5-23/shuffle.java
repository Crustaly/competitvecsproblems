import java.util.*;
import java.lang.*;
import java.io.*;
public class shuffle{

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("shuffle.in"));
    FileWriter file = new FileWriter("shuffle.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int ans =n;
    int [] parent = new int [n];
    int [] pos  =new int [n];
    for(int i=0;i<n;i++) {
    	pos[i]=sc.nextInt()-1;
    	parent[pos[i]]++; 
    }
    Queue<Integer>q =  new LinkedList<Integer>(); 
    for(int i=0;i<n;i++) {
    	if(parent[i]==0) {
            ans--;
            q.add(i);
    	}
    }
    while(!q.isEmpty()) {
    	int curr = q.remove();
    	if(--parent[pos[curr]]==0) {
    		q.add(pos[curr]);
    		ans--;
    	}
    }



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
}