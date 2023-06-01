import java.util.*;
import java.lang.*;
import java.io.*;
public class wheel {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int m =sc.nextInt();
   
   int [] kids = new int [n];
   for(int i =0;i<n;i++) {
	   kids[i]=sc.nextInt();
   }
   
   Arrays.sort(kids);
   
   int i=0;
   int j=n-1;
   int count = 0;
   while(i <=j) {
	
	   if(kids[i]+kids[j]<=m) {
		   count++;
		   i++;	
		   j--;
	   }
	   else {
		   count++;
		   j--;
	   }
   }



  System.out.println(count);
  }


}



