import java.util.*;

public class game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n=sc.nextInt();
			int [] poo=  new int [n];
			for(int i =0;i<n;i++) {
				poo[i]=sc.nextInt();
			}
			Arrays.sort(poo);
			int count =0;
			for(int i=0;i<n;i++) {
				if(poo[i]==1&&i<n-1&&poo[i+1]==1) {
					count++;
					i++;
				}
				else {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}