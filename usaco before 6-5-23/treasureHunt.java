import java.util.*;

public class treasureHunt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(treasure(s.toCharArray()));
	}
	static int treasure(char [] a) {
		int index =-1; 
		for(char i: a) {
			index++;
			if(i=='T') {
				return index;
			}
		}
		return -1; 
	}
}