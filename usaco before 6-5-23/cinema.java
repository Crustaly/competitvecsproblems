import java.util.*;
import java.lang.*;
import java.io.*;
public class cinema{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
 
    int w =sc.nextInt();
    int r =sc.nextInt();
    int [] arr = new int [r*w];
    //0,(W+1)/2+1
  int poo = 0;
  int [][] ans = new int [r][w];

  int index=0;
    for(int i =1;i<=r;i++) {
    	for(int j=1;j<=w;j++) {
    		poo=Math.abs(((w+1)/2 ) - j);
    		arr[index]=((poo*poo+(i-1)*(i-1))*1000000)+i*100+j;
    		index++;
    		
    	}
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));


	int x=0;
	int y=0;
	for(int i =0;i<r*w;i++) {
	
		x=arr[i]%100-1;
		y=((arr[i]%100000-x)/100)-1 ;
		
		ans[y][x]=i+1;
		
	}


for(int i =r-1;i>=0;i--) {
	for(int j=0;j<w;j++) {
		System.out.print(ans[i][j]+" ");
	}
	System.out.println();
}

  }


}



