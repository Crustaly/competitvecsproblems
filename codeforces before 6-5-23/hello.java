import java.util.*;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char [] h = new char [5];
		h[0]='h';
		h[1]='e';
		h[2]='l';
		h[3]='l';
		h[4]='o';
		int index =0;
		boolean works = false;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)==h[index]) {
				index++;
			}
			if(index==5) {
				works = true;
				break;
			}
		}
		if(works) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}