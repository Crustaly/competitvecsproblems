import java.util.*;
import java.lang.*;
import java.io.*;
public class acorn{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    int k =sc.nextInt();
    ArrayList<Integer>acorns = new ArrayList<Integer>(12);
    acorns.add(232);
    acorns.add(132);
    acorns.add(222);
    acorns.add(122);
    acorns.add(212);
    acorns.add(112);
    acorns.add(231);
    acorns.add(131);
    acorns.add(221);
    acorns.add(121);
    acorns.add(211);
    acorns.add(111);
    
    for(int i =0;i<n;i++) {
    	int num=0;
    	for(int j=0;j<4;j++) {
    	String fill=sc.next();
    	}
    	String size =sc.next();
    	if(size.equals("small")) {
    		num+=100;
    	}
    	else num+=200;
    	String color =sc.next();
    	if(color.equals("brown")) {
    		num+=30;
    	}
    	else if(color.equals("green"))num+=20;
    	else num+=10;
    	String poo =sc.next();
    	
    	
    	if(poo.equals("shiny")) {
    		num+=2;
    	}
    	
    	else num+=1;
    	
    	acorns.remove(new Integer (num));
    	String poppers =sc.next();


    	
    }
    Collections.sort(acorns,Collections.reverseOrder());

    int ans=acorns.get(k-1);
    if(ans/100==1) {
    	System.out.print("small ");
    }
    else System.out.print("big ");
    if(ans%100/10==3) {
    	System.out.print("brown ");
    }
    else if(ans%100/10==2) {
       System.out.print("green ");
    }
    
    else System.out.print("red ");
    if(ans%10==1) {
    	System.out.print("smooth");
    }
    else System.out.print("shiny");



  }


}



