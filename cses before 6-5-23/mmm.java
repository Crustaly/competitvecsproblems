import java.util.*;
import java.lang.*;
import java.io.*;
public class mmm {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			int temp = 0;
			int t, h, ft, tw, te, f, o;
			t = 0;
			h = 0;
			ft = 0;
			tw = 0;
			te = 0;
			f = 0;
			o = 0;
					
			if(x/1000 > 0) {
				temp = x - (x%1000);
				t = temp/1000;
				x -= temp;
			}
			if(x/100 > 0) {
				temp = x - (x%100);
				h = temp/100;
				x -= temp;
			}
			if(x/50 > 0) {
				temp = x - (x%50);
				ft = temp/50;
				x -= temp;
			}
			if(x/20 > 0) {
				temp = x - (x%20);
				tw = temp/20;
				x -= temp;
			}
			if(x/10 > 0) {
				temp = x - (x%10);
				te = temp/10;
				x -= temp;
			}
			if(x/5 > 0) {
				temp = x - (x%5);
				f = temp/5;
				x -= temp;
			}
			if(x/1 > 0) {
				temp = x - (x%1);
				o = temp/1;
				x -= temp;
			}
			
			System.out.println(t + ":" + h +":" + ft + ":"+tw+":"+te+ ":"+ f + ":" + o);
	
		}
		
		sc.close();
	}
	
}
