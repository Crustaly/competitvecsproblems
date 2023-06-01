import java.util.*;
import java.lang.*;
import java.io.*;
public class cereal {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("cereal.in"));
    FileWriter file = new FileWriter("cereal.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int [][] fav = new int [n][2];

    for(int i =0;i<n;i++) {
    	fav[i][0]=sc.nextInt();
    	fav[i][1]=sc.nextInt();
    }

   int count =0;
    int [] ans = new int [n];
    int [] cereal = new int [n];
    for(int i =n-1;i>=0;i--) {
    	int start =i;
    	int box = fav[i][0];
    	while(999==999) {
    		if(cereal[box]==0) {
    			count++;
    			cereal[box]=start;
    			break;
    		}
    		else if(cereal[box]<start) {
    			break;
    		}
    		else {
    			int k=cereal[box];
    			cereal[box]=start;
    			if(box==fav[k][1]) {
    				break;
    			}
    			start =k;
    			box=fav[k][1];
    		}
    	}
    	ans[i]=count;
    }


    for(int i =0;i<n;i++) {
    	System.out.println(ans[i]);
        output.write(String.valueOf(ans+"\n"));

    }


    output.close();
  }
  


}



