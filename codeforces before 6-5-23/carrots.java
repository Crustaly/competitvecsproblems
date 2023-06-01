import java.util.*;
public class carrots{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
      while(true) {
    	  int a =sc.nextInt();
    	  int b =sc.nextInt();
    	  if(a==0&&b==0) {
    		  break;
    	  }
    	  int [][] n= new int [a][2];
    	  for(int i =0;i<a;i++) {
    		  int fill =sc.nextInt();
    		  fill =sc.nextInt();
    		  n[i][0]=sc.nextInt();
    		  n[i][1]=sc.nextInt()+n[i][0];
    	  }
    	  for(int i =0;i<b;i++) {
    		  int s = sc.nextInt();
    		  int e =sc.nextInt()+s;
    		  int count =0;
    		  for(int j =0;j<a;j++) {
    			  if(!(s>=n[j][1]||e<=n[j][0])) {
    				  count++;
    			  }
    		  }
    		  System.out.println(count);
    	  }
      }
    }
}