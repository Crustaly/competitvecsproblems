import java.util.*;
import java.lang.*;
import java.io.*;
public class popopop {

  public static void main(String[] args) throws IOException{
	  Scanner sc = new Scanner(new File("halloweencurfew.in"));
      // Scanner sc = new Scanner(System.in);
	  int n =sc.nextInt();
	  for(int i =0;i<n;i++) {
		  String s =sc.next();
		  int poo = s.indexOf(':');
		  int a = Integer.parseInt(s.substring(0,poo));
		  int b = Integer.parseInt(s.substring(poo+1,s.length()));
		  int time=0;
		  if(a==12&&b!=0) {
			  time = b+sc.nextInt();
		  }
		  else {
		   time = a*60+b+sc.nextInt();
		  }
		  String name =sc.next();
		  String tt = sc.next();
		  int pee = tt.indexOf(':');
		  int pb = Integer.parseInt(tt.substring(0,pee));
		  int pa = Integer.parseInt(tt.substring(pee+1,tt.length()));
		  int exptime=0;
		  if(a==12&&b!=0) {
			  exptime = pa;
		  }
		  else {
		   exptime = pb*60+pa;;
		  }

		  if(exptime>=time) {
			  System.out.println(name+" is not in trouble");
		  }
		  else {
			  System.out.println(name+" is in trouble");
		  }
		  
		  
	  }
	  

	  sc.close();


  }


}



