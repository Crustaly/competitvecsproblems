import java.util.*;
import java.lang.*;
import java.io.*;
public class sort{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //gopher
    double x1 =sc.nextDouble();
    double y1 =sc.nextDouble();
    //fast dog
    double x2 =sc.nextDouble();
    double y2 =sc.nextDouble();
    double gx =sc.nextDouble();
    double gy =sc.nextDouble();
    if(2*distance(x1, y1,gx, gy)>=distance(x2, y2, gx, gy)) {
    	System.out.println("The gopher cannot escape.");
    }
    else {
    	System.out.println("The gopher can escape through the hole at ("+gx+","+gy+").");
    }
    
 

  }
  static double distance(double x1, double y1, double x2, double y2) {
	  return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
  }
}