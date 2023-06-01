import java.util.*;

public class berryDeezNuts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer>berries= new ArrayList<Integer>();
		ArrayList<Integer>basket = new ArrayList<Integer>();
		for(int i =0;i<n;i++) {
			berries.add(sc.nextInt());
		}
		Collections.sort(berries);
		int news=0;
		for(int i =berries.size()-1;i>=0;i++) {
			if(basket.size()==b) {
				break;
			}
			if(berries.size()-b+news>=0&&berries.size()-b+news<berries.size()&&berries.get(i)/2>berries.get(berries.size()-b+news)) {
				news++;
				if(berries.get(i)%2==1) {
				basket.add(berries.get(i)/2);
				basket.add(berries.get(i)/2+1);
			}
				else {
					basket.add(berries.get(i)/2);
					basket.add(berries.get(i)/2);
				}
		}
	}
		Collections.sort(basket);
		int split=0;
		if(basket.size()<b) {
			basket.get(basket.size()-1);
		}
}
}