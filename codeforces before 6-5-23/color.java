import java.util.*;

public class color {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t =0;t<ts;t++) {
		int n = sc.nextInt();
		if(n%2==1)
			{
			System.out.println("Mike");
			for(int i=0;i<n;i++) {
				sc.nextInt();
			}
			}
			
		else {
			int max =0;
			int index =0;
			for(int i =0;i<n;i++) {
				int a = sc.nextInt();
				if(a>max) {
					max=a;
					index=i;
				}
			}
			if(index%2==1) {
				System.out.println("Joe");
			}
			else {
				System.out.println("Mike");
			}
		}
		}
	}
}