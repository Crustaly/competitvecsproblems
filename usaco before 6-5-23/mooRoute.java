import java.util.*;

public class mooRoute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dirs = new int [n];
		for(int i=0;i<n;i++) {
			dirs[i]=sc.nextInt();
		}
		 StringBuilder str = new StringBuilder();
		if(n==2) {
			int count =0;
			if(dirs[0]==dirs[1]) {
				while(dirs[0]>0) {
					count++;
					dirs[1]--;
					dirs[0]--;
					if(count%2==1) {
						str.append("RR");
						}
						else {
							str.append("LL");
						}
				}
			}
			else if(dirs[0]%2==0&&dirs[1]%2==0) {
				if(dirs[0]>dirs[1]) {
					while(dirs[1]!=0) {
						dirs[1]--;
						dirs[0]--;
						count++;
						if(count%2==1) {
						str.append("RR");
						}
						else {
							str.append("LL");
						}
					}
					count =0;
					while(dirs[0]>0) {
						dirs[0]--;
						if(count%2==0) {
						str.append("R");
						}
						else {
							str.append("L");
						}
						count++;
					}
				}
				else {
					while(dirs[0]>1) {
						count++;
						dirs[0]--;
						dirs[1]--;
						if(count%2==1) {
						str.append("RR");
						}
						else {
							str.append("LL");
						}
					}
					count =0;
					while(dirs[1]>1) {
						dirs[1]--;
						if(count%2==0) {
						str.append("L");
						}
						else {
							str.append("R");
						}
						count++;
					}
					str.append("LL");
					
				}
			}
		
			}
		if(n==3) {
			str.append("RRRLLRRLLL");
		}
		System.out.println(String.valueOf(str));
		}

}