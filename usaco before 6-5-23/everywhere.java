import java.util.*;
import java.lang.*;
import java.io.*;
public class everywhere {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    HashSet<Character> uniques = new HashSet<Character>();
    String s = sc.next();
    for(int i=0;i<n;i++) {
    	uniques.add(s.charAt(i));
    }

    
  
    int left =0;
    int ans =n;
    HashMap<Character,Integer> current = new HashMap<Character,Integer>();
    for(int right=0;right<s.length();right++) {
    	current.put(s.charAt(right),current.getOrDefault(s.charAt(right),0)+1);
    
          while(left<right&&current.getOrDefault(s.charAt(left),0)>1) {
    	
          current.put(s.charAt(left),current.get(s.charAt(left))-1);
          left++;
          }

    	if(current.size()==uniques.size()) {
    		ans =Math.min(ans,right-left+1);
    	
    	}
    }
    System.out.println(ans);
    }


  }






