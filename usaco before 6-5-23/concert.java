import java.util.*;
import java.lang.*;
import java.io.*;
public class concert{

  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("fenceplan.in"));
    FileWriter file = new FileWriter("fenceplan.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();

    int m =sc.nextInt();
    
    TreeSet<Integer> set = new TreeSet<Integer>();
    
    for(int i=0;i<n;i++) {
    	set.add(sc.nextInt());
    }

    
    for(int i =0;i<m;i++) {
    	
    }




    output.write(String.valueOf(ans));

    output.close();
  }


}


