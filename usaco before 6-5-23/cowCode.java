import java.util.*;
import java.lang.*;
import java.io.*;
public class cowCode {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("cowcode.in"));
    FileWriter file = new FileWriter("cowcode.out");
    BufferedWriter output = new BufferedWriter(file);
    String s =sc.next();
    long n =sc.nextInt();

    System.out.println(parse(s, n-1));

    //output.write(String.valueOf(ans));

    output.close();
  }

	public static char parse(String s, long index) {
		if(index<s.length()) {
			return s.charAt((int)index);
		}
		long len = s.length();
		while(2*len<=index) {
			len*=2;
		}
		if(len==index) {
			return parse(s,index-1);
		}
		else {
			return parse(s, index-len-1);
		}
	}
}