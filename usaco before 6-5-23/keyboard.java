import java.util.*;

public class keyboard {
	static ArrayList<ArrayList<Integer>>adj;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		boolean works = true;
		for(int t=0;t<ts;t++) {
			String s = sc.next();
			adj = new ArrayList<ArrayList<Integer>>();
			for(int i =0;i<26;i++) {
				adj.add(new ArrayList<Integer>());
			}
			for(int i=0;i<s.length()-1;i++) {
				int a = s.charAt(i)-'a';
				int b = s.charAt(i+1)-'a';
				adj.get(a).add(b);
				adj.get(b).add(a);
			}
			int two=0;
			for(int i =0;i<26;i++) {
				if(adj.get(i).size()>2) {
					works = false; 
				}
				if(adj.get(i).size()==2) {
					two++;
				}
			}
			if(two>24) {
				works=false;
			}
			if(!works) {
				System.out.println("NO");
			}
			else {
			System.out.println("YES");
			}
			//if any is >2, it no worky
		}
	}
}