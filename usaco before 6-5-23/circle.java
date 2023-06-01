import java.util.*;
import java.lang.*;
import java.io.*;
public class circle{

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    char [] bag = new char [n];
    bag=sc.next().toCharArray();
    int m=sc.nextInt();
    for(int poo = 0;poo<m;poo++) {

        int r=0;
        int a =sc.nextInt();
        char tar = sc.next().charAt(0);
        int exc=0;
        int ansCount =0;
 
        for(int l=0;l<n;l++) {
        	r=l;
        	exc=0;
      
        	while(r<n) {
        			if(bag[r]==tar) {
        				r++;
        			}
        			else if(bag[r]!=tar) {
        				if(exc+1>a) {
        					break;
        				}
        				if(exc+1<=a) {
        					exc++;
        					r++;
        				}

        				
        			}


        		}
        	
        	ansCount=Math.max(ansCount, r-l);

        	
        }
        System.out.println(ansCount);
    }


  }


}



