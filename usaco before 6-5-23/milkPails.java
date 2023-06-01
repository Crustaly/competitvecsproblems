import java.util.*;
import java.lang.*;
import java.io.*;
public class milkPails{
	static int x,y,k,m,ans;
	static boolean [][][] vis;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
   // Scanner sc = new Scanner(new File("pails.in"));
    FileWriter file = new FileWriter("pails.out");
    BufferedWriter output = new BufferedWriter(file);
    x =sc.nextInt();
    y =sc.nextInt();
    k =sc.nextInt();
    m =sc.nextInt();
    ans=Integer.MAX_VALUE;
    vis = new boolean[x+1][y+1][k+1];
    recursion(0,0,0);



    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static void recursion(int currX, int currY, int steps) {
		if (vis[currX][currY][steps]) return;
		vis[currX][currY][steps] = true;

	  if(steps==k) {
		  ans=Math.min(ans, Math.abs(currX+currY-m));
		  return;
	  }
	  recursion(currX,y, steps+1);
	  recursion(x,currY, steps+1);
	  recursion(0,currY, steps+1);
	  recursion(currX,0, steps+1);
	  recursion(Math.min(x, currX+currY),Math.max((currX+currY)-x, 0), steps+1);
	  recursion(Math.max((currX+currY)-y, 0),Math.min(y, currY+currX), steps+1);
	  
  }


}



