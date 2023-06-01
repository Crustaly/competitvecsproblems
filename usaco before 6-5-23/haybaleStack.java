import java.util.*;
import java.io.*;
public class haybaleStack {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("stacking.in"));
    FileWriter file = new FileWriter("stacking.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();
    int [] balls = new int [n+1];
    for(int i =0;i<m;i++) {
    	balls[sc.nextInt()-1]++;
    	balls[sc.nextInt()]--;
    }
    System.out.println(Arrays.toString(balls));
    int [] psum = new int [n+1];
    for(int i =0;i<n;i++) {
    	psum[i+1]=balls[i]+psum[i];
    }
    Arrays.sort(psum);
    System.out.println(psum[n/2+1]);
    output.write(String.valueOf(psum[n/2+1]));

    output.close();
  }


}



