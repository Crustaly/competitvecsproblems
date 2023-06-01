import java.util.*;
import java.lang.*;
import java.io.*;
public class sticks {
static int count; 
	public static void main(String[] args) throws IOException{
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		rec(0,n);
		System.out.println(count);
	}
	static void rec(int len, int target) {
		if(len==target) {
			count++;
			return;
		}
		if(len>target) {
			return;
		}
		rec(len+1,target);
		rec(len+2,target);
		rec(len+3,target);
	}
}
