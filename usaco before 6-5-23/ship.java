import java.util.*;
import java.lang.*;
import java.io.*;
public class ship {
static int x,y,ex,ey,n;
static char [] dir;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);

     x =sc.nextInt();
     y =sc.nextInt();
     ex =sc.nextInt();
     ey =sc.nextInt();
    
     n =sc.nextInt();
     dir = new char [n];
    dir = sc.next().toCharArray();
    
    int l=0;
    int h=5;
    boolean work =false;
    int m=5;
    while(l<h) {
    	int mid =(h+l)/2;
    	if(works(mid)) {
    		h=mid;
    		m=mid;
    		work=true;
    	}
    	else {
    	l=mid+1;
    	}
    	}
    if(work) {
    	System.out.println(m);
    }
    else {
    	System.out.println(-1);
    }
    }

  
static boolean works (int k ) {
	long windx=0;
	long windy=0;
	for(int i =0;i<n;i++){
		if(dir[i]=='U') {
			windy++;
			}
		else if(dir[i]=='D') {
			windy--;
		}
		else if(dir[i]=='L') {
			windx--;
		}
		else {
			windx++;
		}
		}
	windx*=k/n;
	windy*=k/n;
	long remainder = k%n;
	
for(int i =0;i<remainder;i++) {
	if(dir[i]=='U') {
		windy++;
		}
	else if(dir[i]=='D') {
		windy--;
	}
	else if(dir[i]=='L') {
		windx--;
	}
	else {
		windx++;
	}
}
x+=windx;
y+=windy;
return (Math.abs(x-ex) + Math.abs(y-ey)) <= k;


}
}



