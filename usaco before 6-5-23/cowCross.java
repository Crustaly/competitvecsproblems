import java.util.*;
import java.lang.*;
import java.io.*;
public class cowCross {
static HashSet<tuple> roads;
static int n;
static boolean [][] visit;
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    //Scanner sc = new Scanner(new File("countcross.in"));
    FileWriter file = new FileWriter("countcross.out");
    BufferedWriter output = new BufferedWriter(file);
    n =sc.nextInt();
    int k =sc.nextInt();
    int r =sc.nextInt();
    roads=new HashSet<tuple>();

    for(int i =0;i<r;i++) {
    	int a=sc.nextInt()-1;
    	int b=sc.nextInt()-1;
    	int c=sc.nextInt()-1;
    	int d=sc.nextInt()-1;
    	roads.add(new tuple (a,b,c,d));
    	roads.add(new tuple (c,d,a,b));
    }
    int [][] cows=new int [k][2];
    int ans =0;

    for(int i =0;i<k;i++) {
    	cows[i][0]=sc.nextInt()-1;
    	cows[i][1]=sc.nextInt()-1;
visit=new boolean[n][n];
    		ff(cows[i][0],cows[i][1]);

    		for(int j=0;j<i;j++) {
    			if(!visit[cows[j][0]][cows[j][1]])ans++ ;
    	}
    }

    System.out.println(ans);

    output.write(String.valueOf(ans));

    output.close();
  }
  static void ff(int x, int y) {
	  if(x<0||y<0||x>=n||y>=n||visit[x][y]) {
		  return;
	  }
	  visit[x][y]=true;
      
	  if(!roads.contains(new tuple(x+1,y,x,y))) {
		  ff(x+1,y);
	  }
	  if(!roads.contains(new tuple(x-1,y,x,y))) {
		  ff(x-1,y);
	  }
	  if(!roads.contains(new tuple(x,y-1,x,y))) {
		  ff(x,y-1);
	  }
	  if(!roads.contains(new tuple(x,y+1,x,y))) {
		  ff(x,y+1);
	  }

  }
  static boolean contains(tuple a) {
	  for(tuple i:roads) {
		  if(i.x==a.x&&i.y==a.y&&i.z==a.z&&i.p==a.p) {
			  return true;
		  }
	  }
	  return false;
  }

  static class tuple {
		int x, y,z,p;

		public tuple(int x, int y,int z, int p) {
			super();
			this.x = x;
			this.y = y;
			this.z=z;
			this.p=p;
		}
  @Override
public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		result = prime * result + z;
		result = prime * result + p;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tuple other = (tuple) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (z != other.z)
			return false;
		if (p!= other.p)
			return false;
		return true;
	}


}
}



