import java.util.*;
import java.lang.*;
import java.io.*;
public class firehose {
static int h,k;
static int [] house;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    h=sc.nextInt();
    house = new int [h];
    for(int i =0;i<h;i++) {
    	house[i]=sc.nextInt();
    }
    Arrays.sort(house);
    k =sc.nextInt();
    int r=500001;
    int l=0;
    while(l<r) {
    	int mid=(l+r)/2;
    	if(works(mid)) {
    	r=mid;
    	}
    	else {
    		l=mid+1;
    	}
    	}
    System.out.println(l);
    }

  
static boolean works(int len) {
	for(int i =0;i<h;i++) {
		int need=1;
		int start = house[i];
		for(int j=1;j<h;j++) {

			int end = house[((i+j)%h)];
			if((end - start + 1000000) % 1000000>len*2) {
				need++;
				start=end;
			}
		}
		if(need<=k) {
			return true;
		}
	}
	return false;
}


}



