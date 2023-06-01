import java.util.*;
import java.lang.*;
import java.io.*;
public class square{
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
  
    int n =sc.nextInt();
    int m =sc.nextInt();
    int k =sc.nextInt();
    double  [] plots = new double [n];
    for(int i =0;i<n;i++) {
        plots[i]=sc.nextDouble();
    }
    double [] houses = new double  [m+k];
    for(int i =0;i<m;i++) {
        houses[i]=sc.nextDouble();
    }
    for(int i =m;i<m+k;i++) {
        double a = sc.nextDouble();
        houses[i] = Math.sqrt(2*Math.pow(a/2, 2));
        }
    int count =0;
    Arrays.sort(houses);
    Arrays.sort(plots);
    for(int i =0;i<n;i++) {
        for(int j = 0;j<m+k;j++) {
            if(houses[j]<plots[i]) {
                plots[i]=-11000;
                count++;
                break;
            }
        }
    }
    System.out.println(count);

  }
}