import java.util.*;
import java.lang.*;
import java.io.*;
public class triangle {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    BufferedReader in = new BufferedReader(new FileReader("triangles.in"));
    FileWriter file = new FileWriter("triangles.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =Integer.parseInt(in.readLine());
    long mod = 1000000007;
	HashMap<Long, ArrayList<long[]>> cols = new HashMap<>();
	HashMap<Long, ArrayList<long[]>> rows = new HashMap<>();
	long [][] points = new long [n][2];
	HashMap<long[], Long> tri = new HashMap<>();
	for (int i = 0; i < n; i++) {
		String[] temp = in.readLine().split(" ");
		points[i] = new long[] { Integer.parseInt(temp[0]), 
							   Integer.parseInt(temp[1]) };
	}
	
    for(long [] p:points) {
    	if(!cols.keySet().contains(p[0])) {
    		cols.put(p[0], new ArrayList<>());
    	}
    	cols.get(p[0]).add(p);
    	if(!rows.keySet().contains(p[1])) {
    		rows.put(p[1], new ArrayList<>());
    	}
    	rows.get(p[1]).add(p);
    }
    for (long c : cols.keySet()) {
		ArrayList<long[]> column = cols.get(c);
		column.sort((a, b) -> Long.compare(a[1], b[1]));
		long initialSum = 0;	
		for (int i = 0; i < column.size(); i++) {
			initialSum += column.get(i)[1] - column.get(0)[1];
		}
		System.out.println(initialSum);
		for (int i = 0; i < column.size() - 1; i++) {
			tri.put(column.get(i), initialSum);
			
			long dist = column.get(i + 1)[1] - column.get(i)[1];
			int sec = column.size()-1;
			//initialSum += (2*(i+1)- column.size()) * dist;
			initialSum +=(-(sec-i-1)+i)*dist;
		}
		tri.put(column.get(column.size() - 1), initialSum);
	}
    long ans =0;
	for (long r : rows.keySet()) {
		ArrayList<long[]> row = rows.get(r);
		row.sort((a, b) -> Long.compare(a[0], b[0]));
		long initialSum = 0;
		for (int i = 0; i < row.size(); i++) {
			initialSum += row.get(i)[0] - row.get(0)[0];
		}
		for (int i = 0; i < row.size() - 1; i++) {
			ans += (initialSum * tri.get(row.get(i))) % mod;	
			long dist = row.get(i + 1)[0] - row.get(i)[0];
			int sec = row.size()-1;
			//initialSum += (2*(i+1)- column.size()) * dist;
			initialSum +=(-(sec-i-1)+i)*dist;

		}
		ans += (initialSum * tri.get(row.get(row.size() - 1)));
	}
	

    System.out.println(ans% mod);
    output.write(String.valueOf(ans%mod));
    output.close();
  }
 
  
}