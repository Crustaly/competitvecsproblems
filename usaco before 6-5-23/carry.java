import java.util.*;
import java.lang.*;
import java.io.*;
public class carry {
static int [] g;
static int n;

  public static void main(String[] args) throws IOException{
   Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
  g = new int [n];
for(int i=0;i<n;i++) {
	g[i]=sc.nextInt();
}
   System.out.println(bins(0,0,0));


  }
static int bins(int i,int sum, int size) {

	if(i==n) {
		return size;
		}
	
	if(carr(sum,g[i])) {
		return bins(i+1,sum,size);
	}
	return Math.max(bins(i+1,sum+g[i],size+1),bins(i+1,sum,size));

}
static boolean carr(int a, int b) {
	while(a>0&&b>0) {
		if((a%10)+(b%10)>=10) {
			return true;
		}
		a/=10;
		b/=10;
	}
	return false;
}

}



