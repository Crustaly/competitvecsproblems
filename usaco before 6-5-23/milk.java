import java.util.*;
import java.lang.*;
import java.io.*;
public class milk {

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("shuffle.out"));
    FileWriter file = new FileWriter("shuffle.out");
    BufferedWriter output = new BufferedWriter(file);
    int n =sc.nextInt();
    int ans=0;
    boolean [] found=new boolean [n];
    for(int i =0;i<n;i++) {
    	int a=sc.nextInt()-1;
    	if(found[a]==false) {
    		ans++;
    	}
    	found[a]=true;
    }
    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }


}



