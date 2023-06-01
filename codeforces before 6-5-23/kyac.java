import java.util.*;

public class kyac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ppl = new int [2*n];
		for(int i =0;i<2*n;i++) {
			ppl[i]=sc.nextInt();
		}
		Arrays.sort(ppl);
		int min=Integer.MAX_VALUE;
		for(int i =0;i<n*2;i++) {
			for(int j=i+1;j<n*2;j++) {
				int max=0;
				for(int k=0;k<n*2-1;k+=2) {
					if(k+1==i) {
						
						max+=ppl[k+2]-ppl[k];
						k+=1;
						continue;
					}
					if(k==i) {
						k-=1;
						continue;
					}
					if(k+1==j) {
						
						max+=ppl[k+2]-ppl[k];
						k+=1;
						continue;
					}
					if(k==j) {
						k-=1;
						continue;
					}
					max+= ppl[k+1]-ppl[k];
				}
				min = Math.min(min, max);
			}
		}
		System.out.println(min);
	}
}