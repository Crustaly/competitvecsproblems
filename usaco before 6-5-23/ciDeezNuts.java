import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ciDeezNuts {
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(new File("citystate.in"));
		//Scanner sc  =new Scanner(System.in);
	    FileWriter file = new FileWriter("citystate.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		TreeMap<String, Integer> states = new TreeMap<String, Integer>();
		for(int i =0;i<n;i++) {
			String s = sc.next();
			String p = sc.next();
			String poop = s.substring(0, 2)+p;
			
			states.put(poop, states.getOrDefault(poop, 0)+1);
		}
		long ans =0;
		while(!states.isEmpty()) {
			String s = states.firstKey();
			String opps = s.substring(2)+s.substring(0,2);
			if(s.equals(opps)) {
				states.remove(s);
				states.remove(opps);
				continue;
			}
			if(states.get(opps)!=null) {
			ans+=states.get(s)*states.get(opps);
			states.remove(opps);
			}
		
			states.remove(s);
		}
		System.out.println(ans);
		output.write(String.valueOf(ans));
		output.close();
	}
}