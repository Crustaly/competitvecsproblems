import java.util.*;
import java.lang.*;
import java.io.*;
public class stringSort {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    String [] s = new String [n] ;
    for(int i =0;i<)



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static class String  implements Comparable<String> {
		int a,b,w;
		public Edge(int _a, int _b, int _w) { a = _a; b = _b; w = _w; }
		public int compareTo(Edge y) {
			if (w != y.w) return Integer.compare(w,y.w);
			return Integer.compare(a,y.a);
		}
	}


}



