import java.util.*;
import java.lang.*;
import java.io.*;
public class restaurant {

  public static void main(String[] args) throws IOException{
	  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
 
		int n = Integer.parseInt(bf.readLine());
  int a = 0;
  int b =0;
	List<toast> points = new ArrayList<>();
    for(int i =0;i<n;i++) {
    	String[] params = bf.readLine().split(" ");
		points.add(new toast(Integer.parseInt(params[0]), true));
		points.add(new toast(Integer.parseInt(params[1]), false));

    }
   Collections.sort(points);
    int  max=0;
    int summy = 0;
    for(toast ev:points) {
    	summy+=ev.status ? 1 : -1;
    	max=Math.max(max, summy);
    }
    pw.println(max);
	pw.close();
  }
  public static class toast implements Comparable<toast>{
  public int num;
  public boolean status;
  public toast(int a, boolean b) {
	  num=a;
	  status=b;
  }
  public int compareTo(toast event) {
	  return num- event.num;
  }
  }
  }





