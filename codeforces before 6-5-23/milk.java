import java.util.*;
import java.io.*;
public class milk {
	public static void main(String[] args) throws IOException {
	    //Scanner sc = new Scanner(new File("measurement.in"));
		Scanner sc = new Scanner(System.in);
	    FileWriter file = new FileWriter("measurement.out");
	    BufferedWriter output = new BufferedWriter(file);
		int n = sc.nextInt();
		long g = sc.nextLong();
		long max =g;
		int [][] cows = new int [n][3];
		for(int i =0;i<n;i++) {
			cows[i][0]=sc.nextInt();
			cows[i][1]=sc.nextInt();
			cows[i][2] = sc.nextInt();
		}
		TreeSet<Integer>board = new TreeSet<Integer>();
		Arrays.sort(cows, (e1, e2)->e1[0]-e2[0]);
		board.add(-100);
		int ans =0;
		HashMap<Integer, Long> vals = new HashMap<Integer, Long>();
		TreeMap<Long, HashSet<Integer>> bigBois = new TreeMap<Long, HashSet<Integer>>();

		

		bigBois.put(g,new HashSet<Integer>());
		bigBois.get(g).add(-100);
		vals.put(-100,g);
		for(int i =0;i<n;i++) {
			long a = vals.getOrDefault(cows[i][1], g)+cows[i][2];
			if(bigBois.get(a)==null) {
				bigBois.put(a,new HashSet<Integer>());
			}
			if(vals.containsKey(cows[i][1])) {
			bigBois.get(vals.get(cows[i][1])).remove(cows[i][1]);
			}
			bigBois.get(a).add(cows[i][1]);
			vals.put(cows[i][1],a);
			if(a==max&&!board.contains(cows[i][1])) {
				board.add(cows[i][1]);
				ans++;
			}
			if(a>max&&!board.contains(cows[i][1])) {
				board.clear();
				board.add(cows[i][1]);
				max=a;
				ans++;
			}
			else if(a>max&&board.contains(cows[i][1])) {
				board.clear();
				board.add(cows[i][1]);
				max=a;
			
			}
			
			if(board.contains(cows[i][1])&&a<max) {
				board.remove(cows[i][1]);
				ans++;
				if(board.isEmpty()) {
					if(bigBois.lastKey()<g) {
						max = g;
						board.add(-100);
					}
					else {
					max = bigBois.lastKey();
					board.addAll(bigBois.get(bigBois.lastKey()));
					}
				}
			}
		}
		output.write(String.valueOf(ans));
		output.close();
		System.out.println(ans);
	}
}