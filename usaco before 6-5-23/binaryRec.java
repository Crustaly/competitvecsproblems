import java.util.*;
import java.lang.*;
import java.io.*;
public class binaryRec {
static int [] bin;
static int n,c;

  public static void main(String[] args) throws IOException{
   Scanner sc = new Scanner(System.in);

    n =sc.nextInt();
   bin = new int [n];
   c =0;
   bins(0,0);
   System.out.println(c);

  }
static void bins(int i,int z) {

	if(i==n) {
		if(z*2<n) {
	for(int p =0;p<n;p++) {
		System.out.print(bin[p]);
	}
	c=c+1;
	System.out.println();
		}
	return;
	}
	if((z+1)*2<n) {
		bin[i]=0;
		bins(i+1,z+1);
	}
	
	bin[i]=1;
	bins(i+1,z);
	bin[i]=0;

}


}



