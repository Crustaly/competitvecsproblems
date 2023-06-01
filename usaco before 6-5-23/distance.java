import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class distance {
	static int [][] places;
	static int n,m;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	    //Scanner sc = new Scanner(new File("socdist.in"));
	    FileWriter file = new FileWriter("socdist.out");
	    BufferedWriter output = new BufferedWriter(file);
		n = sc.nextInt();
		m =sc.nextInt();
		places=new int [m][2];
		for(int i =0;i<m;i++) {
			places[i][0]=sc.nextInt();
			places[i][1]=sc.nextInt();
		}
		 Arrays.sort(places, (e1,e2)->(e1[0]-e2[0]));
		long lo=0;
		long hi =Long.MAX_VALUE/2;
	    while(lo<hi){
	    	long mid = (lo+hi+1)/2;
	    	if(check(mid)){
	    	lo=mid;
	    	}
	    	else{
	    	hi = mid-1;
	    	}
	    	}

	    System.out.println(lo);
	    output.write(String.valueOf(lo));
	    output.close();
	}

	static boolean check(long dist) {
		int put =1;
		long next =places[0][0];
		int index=0;
		for(int i =0;i<m;i++){
			if(next+dist<places[i][0]) {
				put++;
				next=places[i][0];
			}
			while(next+dist<=places[i][1]) {
				put++;
				next+=dist;
			}

		}
		return put>=n;
	}
}
