import java.util.*;

public class alibi {
	static int [][] graze;
	static int [][] alibi;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int n=sc.nextInt();
		graze  = new int [g][3];
		for(int i =0;i<g;i++) {
			graze[i][0]=sc.nextInt();
			graze[i][1]=sc.nextInt();
			graze[i][2]=sc.nextInt();
		}
		alibi  = new int [n][3];
		
		int count =0;
		for(int i =0;i<n;i++) {
			boolean works = true;
			int x =sc.nextInt();
			int y =sc.nextInt();
			int t =sc.nextInt();
			for(int j=0;j<g;j++) {
				if(distance((double)graze[j][0],(double)graze[j][1],(double)x,(double)y)>Math.abs(graze[j][2]-t)) {
					works = false;
					break;
				}
			}
			if(works) {
				count++;
			}
		}
		
			System.out.println(count);
		
		
	}
	public static double distance(
			  double x1, 
			  double y1, 
			  double x2, 
			  double y2) {       
			    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
			}
}