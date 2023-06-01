import java.util.*;
import java.lang.*;
import java.io.*;
public class helpCross {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("helpcross.in"));
    FileWriter file = new FileWriter("helpcross.out");
    BufferedWriter output = new BufferedWriter(file);
    int c =sc.nextInt();
    int n =sc.nextInt();
    int [] chicks = new int [c];
    int [][] cows = new int [n][2];
    for(int i =0;i<c;i++) {
    	chicks[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++) {
    	cows[i][0]=sc.nextInt();
    	cows[i][1]=sc.nextInt();
    }	
    Arrays.sort(chicks);
    Arrays.sort(cows, (e1, e2)->compare(e1,e2));
    int j=0;
    int ans =0;
    PriorityQueue<Integer> availableCows = new PriorityQueue<>();
    for(int i =0;i<c;i++) {
    	//how many cows work?
    	while(j<n&&cows[j][0]<=chicks[i]) {
    		availableCows.add(cows[j][1]);
    		j++;
    	}
    	while(!availableCows.isEmpty()&&availableCows.peek()<chicks[i]) {
    		availableCows.remove();
    	}
    	if(!availableCows.isEmpty()) {
    		availableCows.remove();
    		ans++;
    	}
    }




    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static int compare(int [] e1,int []e2) {
	  if(e1[0]==e2[0]) {
		  return e1[1]-e2[1];
	  }
	  return e1[0]-e2[0];
  }
}