import java.util.*;
import java.lang.*;
import java.io.*;
public class communicating {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0 ;
		for(int i =0;i<n;i++) {
			if(works(sc.nextInt(),sc.nextInt(),sc.nextInt())) {
				count++;
			}
		}
		System.out.println(count);
	
	}
	static boolean works(int x, int y, int z) {
		if(x<y) {
			int temp = x;
			x=y;
			y=temp;
		}
		return (z == 0) || ((z <= (long )x + y) && ((y == 0 && z == y) || (z % gcd(x, y) == 0)));
	}
	static int gcd(int x, int y) {
		int c = x%y;
		if(c==0){
			return y;
		}
		return gcd(y,c);
	}

}
