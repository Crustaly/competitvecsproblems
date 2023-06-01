import java.util.*;
import java.lang.*;
import java.io.*;
public class mountain{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    data [] dates = new data[n];
    int min=Integer.MAX_VALUE;
    for(int i =0;i<n;i++) {
    	dates[i]=new data(sc.nextInt(),sc.nextInt());
        min=Math.min(min,dates[i].l);
    }
    Arrays.sort(dates);
    int max = dates[n-1].r;
   int ans =0;
   int index=0;
   int i =min;
   while(i<=max&&index<n) {
	   if(i>=dates[index].l&&i<=dates[index].r) {
		   index++;
		   ans++;
	   }
	   i++;
   }
    System.out.println(ans);

  }
  static class data implements Comparable<data>{
	  public int l,r;
	  public data(int l, int r) {
	  this.l=l;
	  this.r=r;
	  
	  }
	  public int compareTo(data other) {
		  if(this.r==other.r) {
			  return Integer.compare(this.l,other.l);
		  }
		  else {
			  return Integer.compare(this.r, other.r);
	  }
	  }
  }


}
