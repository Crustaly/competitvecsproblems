import java.util.*;
import java.lang.*;
import java.io.*;
public class snow{
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("snowboots.in"));
    FileWriter file = new FileWriter("snowboots.out");
    BufferedWriter output = new BufferedWriter(file);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++) {
    	if(i%2==0&&i%7==0) {
    		System.out.println("PadLock");
    	    output.write("PadLock\n");
    	}
    	else if(i%2==0) {
    		System.out.println("Pad");
    		 output.write("Pad\n");
    	}
    	else if(i%7==0) {
    		System.out.println("Lock");
    		 output.write("Lock\n");
    	}
    	else {
    		System.out.println("Bypass");
    		 output.write("Bypass\n");
    	}
    }


    output.close();

}
}


