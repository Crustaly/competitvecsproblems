import java.util.*;

public class binaryString {
	static int [] psum, ssum;
	static int zeroCount;
	static int oneCount; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int c = 0; c < t; c++) {
			char [] s = sc.next().toCharArray();
			zeroCount = 0;
			oneCount = s.length-zeroCount;
			int n = s.length;
			for(int i=0;i<n;i++) {
				if(s[i]=='0') {
					zeroCount++;
				}
			}
			psum = new int [s.length-zeroCount];
			ssum = new int [s.length-zeroCount];
			int count =0;
			int index =0;
			for(int i=0;i<n;i++) {
				if(s[i]=='1') {
					psum[index]=count; 
					index++;
				}
				else {
					count++;
				}
			}
			
			count =0;
			index =0;
			for(int i=s.length-1;i>=0;i--) {
				if(s[i]=='1') {
					ssum[index]=count; 
					index++;
				}
				else {
					count++;
				}
			}


			int lo =0;
			int hi = ssum.length;
			while(lo<hi){
				int mid = (lo+hi)/2;
				if(works(mid)){
				hi=mid;
				}
			 	else{
				lo=mid+1;
				}
				}
				System.out.println(lo);

		}
	}
	static boolean works(int k) {
		
		for(int i =0;i<=k;i++) {
			int left = zeroCount;
				left -= psum[i];
				left -= ssum[k-i];
				if(left<=k) {
					return true;
				}
			
		}
		return false;
		
	}
}