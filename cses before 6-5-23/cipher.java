import java.util.*;
import java.lang.*;
import java.io.*;
public class cipher {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    for(int p=0;p<n;p++) {
    Map<Character, Character> map = new HashMap<Character, Character>();
    String a =sc.next();
    String b=sc.next();
    for(int i =0;i<26;i++) {
    	map.put(b.charAt(i),(char)(97+i));
    }
    for(int i =0;i<a.length();i++) {
    	System.out.print(map.getOrDefault(a.charAt(i), a.charAt(i)));
    }
    }

  }


}



