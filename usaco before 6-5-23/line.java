import java.util.*;

public class line {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] cows = new String [8];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		cows[0]="Beatrice";
		cows[1]="Belinda";
		cows[2]="Bella";
		cows[3]="Bessie";
		cows[4]="Betsy";
		cows[5]="Buttercup";
		cows[6]="Blue";
		cows[7]="Sue";
		map.put("Beatrice",0);
		map.put("Belinda",1);
		map.put("Bella",2);
		map.put("Bessie",3);
		map.put("Betsy",4);
		map.put("Blue",5);
		map.put("Buttercup",6);
		map.put("Sue",7);
		int [][] req= new int [n][2];
		sc.nextLine();
		for(int i =0;i<n;i++) {
			String s =sc.nextLine();
			String [] poop = s.split(" ",0);
			req[i][0]=map.get(poop[0]);
			req[i][1]=map.get(poop[5]);
		}
		boolean found = false;
		for(int a=0;a<8&&!found;a++) {
			for(int b=0;b<8&&!found;b++) {
				if(a==b)continue;
				for(int c=0;c<8&&!found;c++) {
					if(c==b||c==a)continue;
					for(int d=0;d<8&&!found;d++) {
						if(c==d||d==b||d==a)continue;	
						for(int e=0;e<8&&!found;e++) {
							if(c==e||e==a||e==b||e==d)continue;
							for(int f=0;f<8&&!found;f++) {
								if(f==e||f==a||f==b||f==d||f==c)continue;
								for(int g=0;g<8&&!found;g++) {
									if(g==e||g==a||g==b||g==d||g==c||f==g)continue;
									for(int h=0;h<8&&!found;h++) {
										if(h==e||h==a||h==b||h==d||h==c||h==f||h==g)continue;
									ArrayList<Integer>order= new ArrayList<Integer>();
									order.add(a);
									order.add(b);
									order.add(c);
									order.add(d);
									order.add(e);
									order.add(f);
									order.add(g);
									order.add(h);
									boolean works  =true;
									for(int j=0;j<n;j++) {
										
										int index1 = order.indexOf(req[j][0]);
										int index2 = order.indexOf(req[j][1]);
										int dist =index1-index2;
										if(dist*dist>2) {
											works = false;
											break;
											} 
										}
									if(works) {
									found = true;
									for(int m:order) {
										System.out.println(cows[m]);
									}
									}
								}
									}
								}
				}
			}
		}
	}
	}
}
	}
