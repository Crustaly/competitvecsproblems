import java.util.*;
import java.lang.*;
import java.io.*;
public class pairedUp {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("pairup.in"));
    FileWriter file = new FileWriter("pairup.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int [][] cows = new int [n][2];

    for(int i =0;i<n;i++) {
    	cows[i][0]=sc.nextInt();
    	cows[i][1]=sc.nextInt();
  
    }
    
    Arrays.sort(cows, (a,b)->a[1]-b[1]);
long ans = 0;
int left =0;
int right = n-1;
int min = Integer.MAX_VALUE;
while(left<=right) {
	min=Math.min(cows[right][0], cows[left][0]);
	if(left==right) {
		min/=2;
	}
	cows[left][0]-=min;
	cows[right][0]-=min;
	
	if(cows[left][0]==0) {

		left++;
	}
	if(cows[right][0]==0) {
		
		right--;
	}
	
	ans=Math.max(ans,cows[left][1]+cows[right][1]);
	
}

System.out.println(ans);
    output.write(String.valueOf(ans));

    output.close();
  }


}



