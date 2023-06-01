import java.util.*;

public class brian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		boolean color = false;
		for(int i =0;i<n;i++) {
			for(int j=0;j<c;j++) {
				char a = sc.next().charAt(0);
				if(a!='W'&&a!='G'&&a!='B') color = true;
			}
		}
		if(color)System.out.println("#Color");
		else {
			System.out.println("#Black&White");
		}
	}
}