import java.util.*;

public class pack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
			int n = sc.nextInt();
			int [][] packs = new int [n+1][2];
			for(int i =1;i<=n;i++) {
				packs[i][0]=sc.nextInt();
				packs[i][1]=sc.nextInt();
			}
			
			Arrays.sort(packs, (e1, e2)->compare(e1,e2));
			StringBuilder ans = new StringBuilder();
			boolean works = true;
			for(int i =0;i<n;i++) {
				//move x
				if(packs[i][0]<packs[i+1][0]) {
					for(int k =0;k<packs[i+1][0]-packs[i][0];k++) {
						ans.append('R');
					}
				}
				if(packs[i][1]!=packs[i+1][1]) {
					if(packs[i][1]>packs[i+1][1]) {
						System.out.println("NO");
						works = false;
						break;
					}
					if(packs[i][1]<packs[i+1][1]) {
						for(int k =0;k<packs[i+1][1]-packs[i][1];k++) {
							ans.append('U');
						}
					}
				}
			}
			if(works) {
				System.out.println("YES");
				System.out.println(String.valueOf(ans));
			}
		}
	}
	static int compare(int [] e1, int [] e2) {
		if(e1[0]==e2[0])return e1[1]-e2[1];
		else return e1[0]-e2[0];
	}
}