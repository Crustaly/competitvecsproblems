import java.util.*;
import java.lang.*;
import java.io.*;
public class mash {

  public static void main(String[] args) throws IOException{
	  Scanner sc = new Scanner(new File("monstermash.in"));
      int n=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      for(int i =1;i<=n;i++) {
    	  if(i%a==0&&i%b==0) {
    		  System.out.println("It was a graveyard smash!");
    		  
    	  }
    	  else if(i%a==0) {
    		  System.out.println("He did the Monster Mash!");
    	  } 
    	  else if(i%b==0) {
    		  System.out.println("He did the flash,");
    	  }
    	  else {
    		  System.out.println("He did the mash,");
    	  }
      }
	  
	  sc.close();


  }


}



