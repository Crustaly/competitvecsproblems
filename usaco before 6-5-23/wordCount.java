import java.util.*;

public class wordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		while(sc.hasNextLine()) {
		String a  =sc.nextLine();
		String [] poop = a.split(" ",0);
		
		for(String s :poop) {
			words.put( s.toLowerCase(), words.getOrDefault(s.toLowerCase(), 0)+1);
		}
		
		}
		TreeMap<Integer, String>ans = new TreeMap<Integer, String>(Collections.reverseOrder());
		for(Map.Entry<String, Integer> entry: words.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			ans.put(value, key);
		}
		  for (Map.Entry<Integer, String> entry :ans.entrySet())
     System.out.println(
         "[" + entry.getKey()
         + ", " + entry.getValue() + "]");
}
	}
