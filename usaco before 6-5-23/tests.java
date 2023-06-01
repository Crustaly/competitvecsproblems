import java.util.*;

public class tests {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a =22;	
		System.out.println(Integer.toBinaryString(a)); 
		for(int i=0;i<5;i++) {
			int change = (1<<i);
			System.out.println(Integer.toBinaryString(change));
	
		}
		System.out.println(0^1);
	}
}