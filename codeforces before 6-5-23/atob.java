import java.util.*;
import java.lang.*;
import java.io.*;
public class atob {
static boolean works;
static int count;
static ArrayList<Integer>values;
static ArrayList<Integer> answer;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int n =sc.nextInt();
    int m =sc.nextInt();
    works = false;
    
    values = new ArrayList<Integer>();
    answer = new ArrayList<Integer>();
    count =0;
    if(n<m) {
    	rec(n,m,0);
    }
    else if(m<n) {
    	rec(m,n,0);
    }
    else {
    	works = true;
    }
    if(works) {
    	System.out.println("YES");
    	System.out.println(answer.size());
    	for(int i: answer) {
    		System.out.print(i+" ");
    	}
    }
    else {
    	System.out.println("NO");
    }

  }
  static void rec(int a, int b, int index) {
	  System.out.println(values);
	  values.add(a);
	  count++;
	  if(a==b) {
		  works = true;
		  answer.addAll(values);
		  return;
	  }
	  if(a>b) {
		  return;
	  }
	  rec(a*2,b, index+1);
	  a/=2;
	  values.remove(index);
	  rec(((a*10)+1),b,index+1);
	  values.remove(index);
  }
}