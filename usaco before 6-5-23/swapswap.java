import java.util.*;
import java.lang.*;
import java.io.*;
public class swapswap{

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("swap.in"));
    FileWriter file = new FileWriter("swap.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();

    int m =sc.nextInt();



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



