import java.util.*;
import java.lang.*;
import java.io.*;
public class rest {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   // Scanner sc = new Scanner(new File("reststops.in"));
    FileWriter file = new FileWriter("reststops.out");
    BufferedWriter output = new BufferedWriter(file);
    int l =sc.nextInt();
    int n =sc.nextInt();
    long bs = sc.nextInt();
    long fs = sc.nextInt(); 
    TreeMap<Long, Long> map = new TreeMap<Long, Long>();
    for(int i=0;i<n;i++) {
    	long a = sc.nextInt();
    	long b = sc.nextInt();
    	map.put(b,Math.max(a, map.getOrDefault(b, (long)0)));
    }
    long currTime =0;
    long total =0;
    while(!map.isEmpty()) {
    	if(map.get(map.lastKey())>currTime){
    		long timeHere = bs*(map.get(map.lastKey())-currTime)-fs*(map.get(map.lastKey())-currTime);
    		total+=timeHere*map.lastKey();
    		currTime=map.get(map.lastKey());
    	}
    	map.remove(map.lastKey());
    }
    


    System.out.println(total);

    output.write(String.valueOf(total));

    output.close();
  }


}



