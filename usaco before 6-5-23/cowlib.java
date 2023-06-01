import java.util.*;

public class cowlib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Integer, Pair> graze = new TreeMap<Integer, Pair>();
		for(int i =0;i<n;i++) {
			int c= sc.nextInt();
			int a= sc.nextInt();
			int b= sc.nextInt();
			graze.put(b, new Pair(c,a));
		}
		int count =0;
		
		for(int i=0;i<m;i++) {
			int x =sc.nextInt();
			int y =sc.nextInt();
			int t =sc.nextInt();
			int t1=100;
			
			boolean worksUp = true;
			boolean worksDown =true; 
			//where is the cow start
			if(graze.higherEntry(t)!=null) {
			Pair up = graze.higherEntry(t).getValue();
			t1 = graze.higherEntry(t).getKey();
			worksUp = works(up.a, x,up.b,y,t1,t);
			
			}
	
			if(graze.lowerEntry(t)!=null) {
			Pair down = graze.lowerEntry(t).getValue();
			t1 = graze.lowerEntry(t).getKey();
			worksDown = works(down.a, x,down.b,y,t1,t);
			}
		
			
			boolean same = true;
			if(graze.get(t)!=null) {
				same= (graze.get(t).a== x)&&(graze.get(t).b== y);
			}	
			
			if(worksDown&&worksUp) {
				if(same) {
			count++;	
				}
			}		
			}
		System.out.println(m-count);
		}
	
	static boolean works(int x11, int x21, int y11, int y21, int t11, int t21) {
		long x1 =x11;
		long x2 =x21;
		long y1 =y11;
		long y2 =y21;
		long t1 =t11;
		long t2 =t21;
		long x= (x1-x2)*(x1-x2);
		long y = (y1-y2)*(y1-y2);
		long b = (t1-t2)*(t1-t2);
		return b>=y+x;
	}
	static class Pair implements Comparable<Pair> {
		int a;
		int b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(cowlib.Pair o) {
			// TODO Auto-generated method stub
			return 0;
		}
}
}