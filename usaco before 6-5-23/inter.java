import java.util.*;
import java.lang.*;
import java.io.*;
public class inter {
  public static void main(String[] args) throws IOException{
	  Scanner sc = new Scanner(new File("interdimensionalbusiness.in"));
	  
	  int row = sc.nextInt();
	  int col = sc.nextInt();
	  
	  int total = 0;
	  
	  for (int r = 0; r < row; r++) {
		  String s = sc.next();
		  int start =0;

		  for (int c = 0; c < col;c++ ) {
			 int com = s.indexOf(',',start);
			 if(com==-1) {
				 com=s.length();
			 }
			 int hold = Integer.parseInt(s.substring(start, com));
			 start=com+1;
			  total += hold;
		  }
	  }
	  
	  System.out.println(1 - total);
	  
	  sc.close();


  }


}



