import java.util.*;
import java.lang.*;
import java.io.*;
public class padLock{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    FileWriter file = new FileWriter("case.out");
    BufferedWriter output = new BufferedWriter(file);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++) {
    	if(i%2==0&&i%7==0) {
    		System.out.println("PadLock");
    	    output.write("PadLock");
    	}
    	else if(i%2==0) {
    		System.out.println("Pad");
    		 output.write("Pad");
    	}
    	else if(i%7==0) {
    		System.out.println("Lock");
    		 output.write("Lock");
    	}
    	else {
    		System.out.println("Bypass");
    		 output.write("Bypass");
    	}
    }


    output.close();

  }


}



