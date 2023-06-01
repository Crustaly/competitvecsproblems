import java.util.*;
import java.lang.*;
import java.io.*;
public class tennis {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int [] players = new int [n];
    for(int i =0;i<n;i++) {
    	players[i]=sc.nextInt();
    }
    Arrays.sort(players);
    int ans=0;
    for(int x=0;x<n;x++) {
    	for(int y =x+1;y<n;y++) {
    	
    		int dist = players[y]-players[x]; 
    		int minz=players[y]+dist;
    		int maxz=players[y]+2*dist;
    		 ans += upperbound(maxz,players)-lowerbound(minz,players);
    	}
    }
    System.out.println(ans);


  }
  static int upperbound(int a, int [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a>=arr[mid]) {
			  l=mid+1;
			  
		  }
		  else {
			  r=mid;
		  }
		 
	  }
	  return l;
  }
  static int lowerbound(int a, int [] arr) {
	  int l=0;
	  int r=arr.length;
	  while(l<r) {
		  int mid=(l+r)/2;
		  if(a<=arr[mid]) {
			  r=mid;
			  
		  }
		  else {
			  l=mid+1;
		  }
		 
	  }
	  return l;
  }


}



