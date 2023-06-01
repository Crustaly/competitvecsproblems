import java.util.*;
import java.lang.*;
import java.io.*;
public class city{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("citystate.in"));
    FileWriter file = new FileWriter("citystate.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    long ans =0;
    HashMap<String, Long> two = new HashMap<String, Long>();
    for(int i =0;i<n;i++) {
    	String s = sc.next();
    	String os = s.substring(0,2);
    	s = sc.next();
    	if(!os.equals(s)) {
    		s = os+s;
    	two.put(s, two.getOrDefault(s, 0L)+1);
    	}
    }
    for(String key: two.keySet()) {
    	String k = key.substring(2)+key.substring(0,2);
    	if(two.containsKey(k)) {
    	    ans+=two.get(key)*two.get(k);
    	}
    }



    System.out.println(ans/2);

    output.write(String.valueOf(ans/2));

    output.close();
  }
}