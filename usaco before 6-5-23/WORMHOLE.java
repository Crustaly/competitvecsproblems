import java.util.*;
import java.lang.*;
import java.io.*;
public class WORMHOLE {

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("fenceplan.in"));
    FileWriter file = new FileWriter("fenceplan.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int m =sc.nextInt();



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



