import java.util.*;
import java.lang.*;
public class fiel {
	static TreeSet<String> teams;
	static String [] vals;
	static HashMap<String, boolean []> he;
	static int c,n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n= sc.nextInt();
		teams = new TreeSet<String>();
		vals = new String [n];
		for(int i =0;i<n;i++) {
			vals[i] = sc.next();
			teams.add(vals[i]);
		}
		 he= new HashMap<String,boolean []>();
		for(int i =0;i<n;i++) {
			StringBuilder poo = new StringBuilder();
			for(int k=0;k<c;k++) {
				if(vals[i].charAt(k)=='G')poo.append('H');
				else poo.append('G');
			}
			if(teams.contains(String.valueOf(poo))) {
				System.out.println(c);
			} else {
			System.out.println(recurse(poo, c));
			}
		}
			
	}
	static int recurse(StringBuilder s, int dif) {

		   
			boolean [] changed= he.getOrDefault(String.valueOf(s), new boolean [c]);
			//prolly no work, array declaration ToT
		for(int i=0;i<s.length();i++) {
			if(changed[i])continue;
			if(s.charAt(i)=='G') {
			s.replace(i, i+1,"H" );
			changed[i]=true;
			he.put(String.valueOf(s), changed);
			changed[i]=false;
			s.replace(i, i+1,"G" );
			}
			else if(s.charAt(i)=='H') {
				s.replace(i, i+1,"G" );
				changed[i]=true;
				he.put(String.valueOf(s), changed);
				changed[i]=false;
				s.replace(i, i+1,"H" );
				}
		}
		for( String pp : he.keySet()) {
			if(teams.contains(pp)) {
				return dif-1;
			}
			
		}
		for( he.Entry<String, boolean []> pp : he) {
			StringBuilder a = new StringBuilder(pp.key());
			recurse(a, dif-1);
		}
		
		return -1;
		
	}
}