import java.util.*;
import java.lang.*;
import java.io.*;
public class boo {
  public static void main(String[] args) throws IOException{
	  Scanner sc = new Scanner(new File("mandymode.in"));
	  int n = sc.nextInt();
	  sc.nextLine();
	  while(n-->0) {
		  String c = sc.nextLine();
		  String i = sc.nextLine();
		  
		  Scanner candy = new Scanner(c.replaceAll(",", " "));
		  Scanner nums = new Scanner(i.replaceAll(",", " "));
		  
		  ArrayList<String> can = new ArrayList<>();
		  
		  while(candy.hasNext()) {
			  String string = candy.next();
			  String ans = "m";
			  int index = 0;
			  for(int j = 0; j<string.length(); j++) {
				  if(string.charAt(j) == 'a' || string.charAt(j) == 'e' ||
						  
					  string.charAt(j) == 'i' || string.charAt(j) == 'o' ||
					  string.charAt(j) == 'u'
					 ) {
					  index = j;
				  break;
				  }
			  }
			  int last = string.length();
			  for(int s = string.length(); s>=0; s--) {
				  if(string.charAt(s) ==)
			  }
			  ans += string.substring(index,last) + "";
			  
			  can.add(ans);
			  
			
			
			  
		  }
		  int h = 0;
		  while(nums.hasNextInt()) {
			  int x = nums.nextInt();
			  for(int p = 0; p<x; p++)
				  System.out.println(can.get(h));
			  h++;
		  }
	  }
		  sc.close();
	  }
	  
	  

  }






