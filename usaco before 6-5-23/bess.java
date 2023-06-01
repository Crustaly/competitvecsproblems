import java.util.*;
import java.io.IOException;
import java.lang.*;
public class bess {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Pair> range = new ArrayList<Pair>();
		StringBuilder be = new StringBuilder();
		int start =-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='b') {
				if(be.length()==0) { be.append('b');
				start = i;
				
			}
				else be.setLength(0);
		}
			
			else if(s.charAt(i)=='e') {
				if(String.valueOf(be).equals("b")) be.append('e');
				else if(String.valueOf(be).equals("bessi")) {
					range.add(new Pair(start+1, i));
					be.setLength(0);
				}
				else be.setLength(0);
			}
			else if(s.charAt(i)=='s') {
				if(String.valueOf(be).equals("be")) be.append('s');
				else if(String.valueOf(be).equals("bes")) be.append('s');
				else be.setLength(0);
			}
			else if(s.charAt(i)=='i') {
				if(String.valueOf(be).equals("bess")) be.append('i');
				else be.setLength(0);
			}
			
		}
		long ans =0;
		for(Pair i :range) {
			ans+=(s.length()-i.b)*(i.a);
			}
		System.out.println(ans);
	}
	static class Pair{
		  int a,b;
		  public Pair(int c,int d) {
			  a=c;
			  b=d;
		  }
	  }

}